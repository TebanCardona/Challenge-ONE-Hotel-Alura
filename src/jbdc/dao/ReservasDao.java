package jbdc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jbdc.modelo.Reservas;

public class ReservasDao {
  private Connection conn;

  /**
   * @param conn
   */
  public ReservasDao(Connection conn) {
    this.conn = conn;
  }

  public int editar(Date fechaEntrada, Date fechaSalida, int valor, String formaPago) {
    try {
      PreparedStatement statement = conn.prepareStatement("UPDATE reservas SET " +
          "fecha_entrada = ?, " +
          "fecha_salida = ?, " +
          "valor = ?, " +
          "forma_pago = ? " +
          "WHERE id = ?");
      try (statement) {
        statement.setDate(1, fechaEntrada);
        statement.setDate(2, fechaSalida);
        statement.setInt(3, valor);
        statement.setString(4, formaPago);
        statement.execute();

        int reservaCount = statement.getUpdateCount();
        return reservaCount;
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void guardar(Reservas reserva) {
    if (reserva.getNull()) {
      throw new RuntimeException("Complete los campos necesario");
    }
    try {
      final PreparedStatement statement = conn.prepareStatement("INSERT INTO reservas "
          + "(fecha_entrada, fecha_salida, valor, forma_pago)"
          + "VALUES(?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
      try (statement) {
        statement.setDate(1, reserva.getFechaEntrada());
        statement.setDate(2, reserva.getFechaSalida());
        statement.setInt(3, reserva.getValor());
        statement.setString(4, reserva.getFormaPago());
        statement.execute();

        final ResultSet result = statement.getGeneratedKeys();
        try (result) {
          while (result.next()) {
            reserva.setId(result.getInt(1));
            System.out.println(String.format("Fue insertado la reseva: %s", reserva));
          }
        }
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public List<Reservas> listar() {
    List<Reservas> resultado = new ArrayList<>();
    try {
      final PreparedStatement statement = conn.prepareStatement(
          "SELECT R.id, R.fecha_entrada, R.fecha_salida, R.valor, R.forma_pago FROM reservas AS R");
      try (statement) {
        statement.execute();
        final ResultSet resultSet = statement.getResultSet();
        try (resultSet) {
          while (resultSet.next()) {
            resultado.add(new Reservas(
                resultSet.getInt("R.id"),
                resultSet.getDate("R.fecha_entrada"),
                resultSet.getDate("R.fecha_salida"),
                resultSet.getInt("R.valor"),
                resultSet.getString("R.forma_pago")));
          }
        }
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return resultado;
  }

  public int eliminar(Integer id) {
    try {
      final PreparedStatement statement = conn.prepareStatement("DELETE FROM reservas WHERE ID = ?");

      try (statement) {
        statement.setInt(1, id);
        statement.execute();

        int updateCount = statement.getUpdateCount();

        return updateCount;
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
