package jbdc.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConnection {
  public static void main(String[] args) throws SQLException {
    Connection conn = new ConnectionFactory().recuperaConexion();
    PreparedStatement statement = conn.prepareStatement("SELECT * FROM huespedes");
    try (statement) {
      statement.execute();
      final ResultSet result = statement.getResultSet();
      System.out.println(result.getString(0));
    } catch (Exception e) {
      System.exit(0);
    }
    conn.close();
    System.out.println();
  }
}