package bancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioDAO {
	ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	public void adicionarFuncionario(Funcionario funcionario) {
		String sql = "INSERT INTO funcionario (NomeFuncionario, CPF, dataDeInicio) VALUES (?,?,?);";
		System.out.println(sql);
		try {
			Connection conn = Conexao.abrirConexao();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, funcionario.getNomeFuncionario());
			stmt.setInt(2, funcionario.getCPF());
			stmt.setString(3, funcionario.getDataDeInicio());
			stmt.executeUpdate(); 
			conn.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void listarFuncionario() {
		String sql = "SELECT * FROM funcionario";
		try {
			Connection conn = Conexao.abrirConexao();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Funcionario funcionario = new Funcionario(
					rs.getString("NomeFuncionario"),
					rs.getInt("CPF"),
					rs.getString("dataDeInicio")
				);
				funcionarios.add(funcionario);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (Funcionario f : funcionarios) {
			System.out.println("Nome do funcionário: " + f.getNomeFuncionario());
			System.out.println("CPF do funcionário: " + f.getCPF());
			System.out.println("Data de inicio do funcionario: " + f.getDataDeInicio());
		}
	}

	public void removerFuncionario(String NomeFuncionario) {
		String sql = "DELETE FROM funcionario WHERE NomeFuncionario = ?;";
		try {
			Connection conn = Conexao.abrirConexao();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, NomeFuncionario);
			int rowsAffected = stmt.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Funcionário com Nome de " + NomeFuncionario + " removido com sucesso.");
			} else {
				System.out.println("Nenhum funcionário encontrado com o Nome de: " + NomeFuncionario);
			}

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

