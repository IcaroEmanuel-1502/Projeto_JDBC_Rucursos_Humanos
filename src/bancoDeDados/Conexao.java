package bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/RhDaEmpresa";
	private static final String USUARIO = "root";
	private static final String SENHA = "0000";
	static Connection conn;
	
	public static void testaConexao() {
		try {
			Class.forName(URL);
			conn = DriverManager.getConnection(URL,USUARIO,SENHA);
			System.out.println("Conexão realizada com sucesso.");
			conn.close();
		} catch (ClassNotFoundException e) {
			System.err.println("Driver JDBC não encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection abrirConexao() throws SQLException {
		conn = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conn;
	}
	public static void fecharConexao() throws ClassNotFoundException {
		try {
			conn.close();
		} catch (SQLException e ) {
			e.printStackTrace();
		}
	}
	
	}
