package fj_21Jdbc_Cap2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExemplo {

	public static void main(String[] args) { 
		try {
			Connection con = 
					DriverManager.getConnection("jdbc:postgresql://localhost:5432/motoapp",
							"postgres","admin");
			System.out.println("Conectado!");
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
