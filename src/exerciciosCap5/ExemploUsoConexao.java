package exerciciosCap5;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class ExemploUsoConexao {
	    public static void main(String[] args) {
	        // Obtém a instância do Singleton
	    	SingletonJDBC conexaoDB = SingletonJDBC.getInstancia();

	        // Obtém a conexão a partir da instância
	        Connection conexao = conexaoDB.getConexao();

	        // Exemplo de consulta ao banco de dados
	        String sql = "SELECT * FROM tipo_moto";
	        try (PreparedStatement stmt = conexao.prepareStatement(sql);
	             ResultSet rs = stmt.executeQuery()) {

	            while (rs.next()) {
	                System.out.println("Coluna 1: " + rs.getString(1));
	                System.out.println("Coluna 2: " + rs.getString(2));
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            // Fecha a conexão quando não for mais necessária
	            conexaoDB.fecharConexao();
	        }
	    }
	}
