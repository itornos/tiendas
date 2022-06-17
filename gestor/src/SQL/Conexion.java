package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

public class Conexion {

	public static Statement stmt = null;

	public void sesion() {
        //CONECTAR JDBC
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("JDBC no se ha podido registrar");
		}
		System.out.println("JDBC registrada");

		while(1<2){
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
				try {
					stmt = conn.createStatement();
					break;
				} catch (Exception e) {
					break;
				}
			} catch (SQLException e) {
				System.out.println("Intentando conectar con la base de datos...");
				try {TimeUnit.SECONDS.sleep(1);} catch (InterruptedException e1) {}
			}
		}
	}
}
