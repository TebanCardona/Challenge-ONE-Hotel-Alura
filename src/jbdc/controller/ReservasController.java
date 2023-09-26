package jbdc.controller;

import java.sql.Date;
import java.util.List;

import jbdc.dao.ReservasDao;
import jbdc.factory.ConnectionFactory;
import jbdc.modelo.Reservas;

public class ReservasController {
  private ReservasDao reservasDao;

  public ReservasController() {
    ConnectionFactory connectionFactory = new ConnectionFactory();
    this.reservasDao = new ReservasDao(connectionFactory.recuperaConexion());
  }

  public List<Reservas> buscarId(int id) {
    return reservasDao.buscarId(id);
  }

  public List<Reservas> listar() {
    return reservasDao.listar();
  }

  public void guardar(Reservas reservas) {
    reservasDao.guardar(reservas);
  }

  public int modificar(int id, Date fechaEntrada, Date fechaSalida, int valor, String formaPago) {
    return reservasDao.editar(id, fechaEntrada, fechaSalida, valor, formaPago);
  }

  public int eliminar(Integer id) {
    return reservasDao.eliminar(id);
  }
}
