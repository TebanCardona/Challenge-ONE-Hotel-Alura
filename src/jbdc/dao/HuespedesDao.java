package jbdc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jbdc.modelo.Huespedes;

public class HuespedesDao {
  private Connection conn;

  public HuespedesDao(Connection conn) {
    this.conn = conn;
  }

  public List<Huespedes> buscarIdReserva(int id) {
    List<Huespedes> resultado = new ArrayList<>();
    try {
      final PreparedStatement statement = conn.prepareStatement(
          "SELECT id, nombre, apellido, fecha_nacimiento, nacionalidad, tel, id_reserva FROM huespedes WHERE id_reserva = ?");
      try (statement) {
        statement.setInt(1, id);
        statement.execute();

        final ResultSet resultSet = statement.getResultSet();

        try (resultSet) {
          while (resultSet.next()) {
            resultado.add(new Huespedes(
                resultSet.getInt("id"),
                resultSet.getString("nombre"),
                resultSet.getString("apellido"),
                resultSet.getDate("fecha_nacimiento"),
                resultSet.getString("nacionalidad"),
                resultSet.getString("tel"),
                resultSet.getInt("id_reserva")));
          }
        }
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return resultado;
  }

  public String guardar(Huespedes huesped) {
    if (huesped.getNull()) {
      throw new RuntimeException("Completa los Campos");
    }
    try {
      PreparedStatement statement = conn.prepareStatement("INSERT INTO huespedes"
          + "(nombre, apellido, fecha_nacimiento, nacionalidad, tel, id_reserva)"
          + "VALUES(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
      try (statement) {
        statement.setString(1, huesped.getNombre());
        statement.setString(2, huesped.getApellido());
        statement.setDate(3, huesped.getFechaNacimiento());
        statement.setString(4, huesped.getNacionalidad());
        statement.setString(5, huesped.getTel());
        statement.setInt(6, huesped.getIdReserva());

        statement.execute();
        final ResultSet result = statement.getGeneratedKeys();
        try (result) {
          while (result.next()) {
            huesped.setId(result.getInt(1));
            System.out.println(String.format("Fue insertado el huesped: %s", huesped));
          }
        }
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return "Huesped Creado";
  }

  public List<Huespedes> listar() {
    List<Huespedes> resultado = new ArrayList<>();
    try {
      final PreparedStatement statement = conn.prepareStatement(
          "SELECT H.id, H.nombre, H.apellido, H.fecha_nacimiento, H.nacionalidad, H.tel, H.id_reserva FROM huespedes AS H");
      try (statement) {
        statement.execute();
        final ResultSet resultSet = statement.getResultSet();
        try (resultSet) {
          while (resultSet.next()) {
            resultado.add(new Huespedes(
                resultSet.getInt("H.id"),
                resultSet.getString("H.nombre"),
                resultSet.getString("H.apellido"),
                resultSet.getDate("H.fecha_nacimiento"),
                resultSet.getString("H.nacionalidad"),
                resultSet.getString("H.tel"),
                resultSet.getInt("H.id_reserva")));
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
      final PreparedStatement statement = conn.prepareStatement("DELETE FROM huespedes WHERE ID = ?");

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

  public int editar(int id, String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String tel,
      int id_reserva) {
    try {
      PreparedStatement statement = conn.prepareStatement("UPDATE huespedes SET " +
          "id = ?, " +
          "nombre = ?, " +
          "apellido = ?, " +
          "fecha_nacimiento = ?, " +
          "nacionalidad = ?, " +
          "tel = ?, " +
          "id_reserva = ? " +
          "WHERE id = ?");
      try (statement) {
        statement.setInt(1, id);
        statement.setString(2, nombre);
        statement.setString(3, apellido);
        statement.setDate(4, fechaNacimiento);
        statement.setString(5, nacionalidad);
        statement.setString(6, tel);
        statement.setInt(7, id_reserva);
        statement.setInt(8, id);

        statement.execute();

        int reservaCount = statement.getUpdateCount();
        return reservaCount;
      }
    } catch (SQLException e) {
      System.err.println(e);
      throw new RuntimeException(e);
    }
  }
}
