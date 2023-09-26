package jbdc.controller;

import java.sql.Date;
import java.util.List;

import jbdc.dao.HuespedesDao;
import jbdc.factory.ConnectionFactory;
import jbdc.modelo.Huespedes;

public class HuespedesController {
  private HuespedesDao huespedesDao;

  public HuespedesController() {
    ConnectionFactory connectionFactory = new ConnectionFactory();
    this.huespedesDao = new HuespedesDao(connectionFactory.recuperaConexion());
  }

  public List<Huespedes> buscarIdReserva(int id) {
    return huespedesDao.buscarIdReserva(id);
  }

  public List<Huespedes> listar() {
    return huespedesDao.listar();
  }

  public void guardar(Huespedes huespede) {
    huespedesDao.guardar(huespede);
  }

  public int modificar(int id, String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String tel,
      int id_reserva) {
    return huespedesDao.editar(id, nombre, apellido, fechaNacimiento, nacionalidad, tel, id_reserva);
  }

  public int eliminar(Integer id) {
    return huespedesDao.eliminar(id);
  }
}
