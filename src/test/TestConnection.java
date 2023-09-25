package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jbdc.dao.HuespedesDao;
import jbdc.dao.ReservasDao;
import jbdc.factory.ConnectionFactory;
import jbdc.modelo.Huespedes;
import jbdc.modelo.Reservas;

public class TestConnection {
  public static void main(String[] args) throws SQLException {
    Connection conn = new ConnectionFactory().recuperaConexion();
    HuespedesDao huespedesDao = new HuespedesDao(conn);
    List<Huespedes> hues = huespedesDao.listar();
    hues.forEach(res -> huespedesDao.eliminar(res.getId()));
    ReservasDao reservasDao = new ReservasDao(conn);
    List<Reservas> reses = reservasDao.listar();
    reses.forEach(res -> reservasDao.eliminar(res.getId()));
    conn.close();
  }
}

// Reservas reserva = new Reservas(new Date(2023, 3, 12), new Date(2023, 3, 14),
// 123, "Tarjeta de Crédito");

// Huespedes huesped = new Huespedes(null, "Juan", "No se", new Date(123),
// "Colombia", "+123 123", reserva.getId());