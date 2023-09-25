package jbdc.modelo;

import java.sql.Date;

public class Huespedes {
  private Integer id;
  private String nombre;
  private String apellido;
  private Date fechaNacimiento;
  private String nacionalidad;
  private String tel;
  private Integer idReserva;

  /**
   * @param id
   * @param nombre
   * @param apellido
   * @param fechaNacimiento
   * @param nacionalidad
   * @param tel
   * @param idReserva
   */
  public Huespedes(Integer id, String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String tel,
      Integer idReserva) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.nacionalidad = nacionalidad;
    this.tel = tel;
    this.idReserva = idReserva;
  }

  /**
   * @param nombre
   * @param apellido
   * @param fechaNacimiento
   * @param nacionalidad
   * @param tel
   */
  public Huespedes(String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String tel) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.nacionalidad = nacionalidad;
    this.tel = tel;
  }

  /**
   * @param id
   * @param nombre
   * @param apellido
   * @param fechaNacimiento
   * @param nacionalidad
   * @param tel
   */
  public Huespedes(int id, String nombre, String apellido, Date fechaNacimiento, String nacionalidad,
      String tel) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.nacionalidad = nacionalidad;
    this.tel = tel;
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return the apellido
   */
  public String getApellido() {
    return apellido;
  }

  /**
   * @param apellido the apellido to set
   */
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  /**
   * @return the fechaNacimiento
   */
  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  /**
   * @param fechaNacimiento the fechaNacimiento to set
   */
  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  /**
   * @return the nacionalidad
   */
  public String getNacionalidad() {
    return nacionalidad;
  }

  /**
   * @param nacionalidad the nacionalidad to set
   */
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  /**
   * @return the tel
   */
  public String getTel() {
    return tel;
  }

  /**
   * @param tel the tel to set
   */
  public void setTel(String tel) {
    this.tel = tel;
  }

  /**
   * @return the idReserva
   */
  public int getIdReserva() {
    return idReserva;
  }

  /**
   * @param idReserva the idReserva to set
   */
  public void setIdReserva(int idReserva) {
    this.idReserva = idReserva;
  }

  /**
   * @param id the id to set
   */
  public void setId(Integer id) {
    this.id = id;
  }

  public boolean getNull() {
    boolean result = false;
    if (getNombre().isEmpty()
        || getNombre().equals(null)
        || getApellido().equals(null)
        || getApellido().isEmpty()
        || getNacionalidad().equals(null)
        || getNacionalidad().isEmpty()
        || getTel().equals(null)
        || getTel().isEmpty()
        || getFechaNacimiento().equals(null)) {
      result = true;
    }
    return result;
  }
}
