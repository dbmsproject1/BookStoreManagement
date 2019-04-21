

import java.sql.*;
import javax.swing.*;
public class jdbcConnection {
    Connection conn=null;
    public static Connection dbConnection() {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","hr");
                //JOptionPane.showMessageDialog(null,"connected");
                return conn;
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
    }
}
