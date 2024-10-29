package exerciciosCap5;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class SingletonJDBC {
	    // Referência estática para a única instância de conexão
	    private static SingletonJDBC instancia;
	    private Connection conexao;

	    // URL de conexão, usuário e senha do banco de dados
	    private final String url = "jdbc:postgresql://localhost:5432/motoapp";
	    private final String usuario = "postgres";
	    private final String senha = "postgres";

	    // Construtor privado para impedir a criação de novas instâncias
	    private SingletonJDBC() {
	        try {
	            // Cria a conexão com o banco de dados
	            conexao = DriverManager.getConnection(url, usuario, senha);
	            System.out.println("Conexão com o banco de dados estabelecida com sucesso.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Erro ao conectar ao banco de dados.", e);
	        }
	    }

	    // Método público estático para obter a única instância
	    public static SingletonJDBC getInstancia() {
	        if (instancia == null) {
	            instancia = new SingletonJDBC();
	        }
	        return instancia;
	    }

	    // Retorna a conexão com o banco de dados
	    public Connection getConexao() {
	        return conexao;
	    }

	    // Método para fechar a conexão (opcional)
	    public void fecharConexao() {
	        if (conexao != null) {
	            try {
	                conexao.close();
	                System.out.println("Conexão com o banco de dados fechada.");
	            } catch (SQLException e) {
	                e.printStackTrace();
	                throw new RuntimeException("Erro ao fechar a conexão com o banco de dados.", e);
	            }
	        }
	    }
	}
