package jbdc.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
  public DataSource dataSource;

  public ConnectionFactory() {
    ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
    comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC");
    comboPooledDataSource.setUser("Java");
    comboPooledDataSource.setPassword("asd123");
    comboPooledDataSource.setMaxPoolSize(10);
    this.dataSource = comboPooledDataSource;
  }

  public Connection recuperaConexion() {
    try {
      return this.dataSource.getConnection();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
