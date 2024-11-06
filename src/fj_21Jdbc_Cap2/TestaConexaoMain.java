package fj_21Jdbc_Cap2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import motoApp.CreateMotoappAdminConnection;

public class TestaConexaoMain {

	public static void main(String[] args) throws SQLException {

		Connection con = CreateMotoappAdminConnection.getConnection();
		PreparedStatement stmt = con.prepareStatement
		("INSERT INTO TIPO_USER(nome,descricao) VALUES (?,?)");
		try {
			stmt.setString(1, "UserTeste");
			stmt.setString(2, "Usuário de teste de conexao");

			
			stmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			stmt.close();
			con.close();
		}
	}
}
