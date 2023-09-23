package jbdc.modelo;

import java.sql.Date;

public class Reservas {
  private Integer id;
  private Date fechaEntrada;
  private Date fechaSalida;
  private Integer valor;
  private String formaPago;

  /**
   * @param fechaEntrada
   * @param fechaSalida
   * @param valor
   * @param formaPago
   */
  public Reservas(Date fechaEntrada, Date fechaSalida, Integer valor, String formaPago) {
    this.fechaEntrada = fechaEntrada;
    this.fechaSalida = fechaSalida;
    this.valor = valor;
    this.formaPago = formaPago;
  }

  /**
   * @param id
   * @param fechaEntrada
   * @param fechaSalida
   * @param valor
   * @param formaPago
   */
  public Reservas(Integer id, Date fechaEntrada, Date fechaSalida, Integer valor, String formaPago) {
    this.id = id;
    this.fechaEntrada = fechaEntrada;
    this.fechaSalida = fechaSalida;
    this.valor = valor;
    this.formaPago = formaPago;
  }

  /**
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @return the fechaEntrada
   */
  public Date getFechaEntrada() {
    return fechaEntrada;
  }

  /**
   * @param fechaEntrada the fechaEntrada to set
   */
  public void setFechaEntrada(Date fechaEntrada) {
    this.fechaEntrada = fechaEntrada;
  }

  /**
   * @return the fechaSalida
   */
  public Date getFechaSalida() {
    return fechaSalida;
  }

  /**
   * @param fechaSalida the fechaSalida to set
   */
  public void setFechaSalida(Date fechaSalida) {
    this.fechaSalida = fechaSalida;
  }

  /**
   * @return the valor
   */
  public Integer getValor() {
    return valor;
  }

  /**
   * @param valor the valor to set
   */
  public void setValor(Integer valor) {
    this.valor = valor;
  }

  /**
   * @return the formaPago
   */
  public String getFormaPago() {
    return formaPago;
  }

  /**
   * @param formaPago the formaPago to set
   */
  public void setFormaPago(String formaPago) {
    this.formaPago = formaPago;
  }

}
