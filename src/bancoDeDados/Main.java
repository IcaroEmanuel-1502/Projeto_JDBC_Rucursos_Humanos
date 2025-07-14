package bancoDeDados;

public class Main {
	public static void main(String[]args) {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		//Funcionario novoFuncionario = new Funcionario("Joao", 132207332 ,"10/05/2005");
		//funcionarioDAO.adicionarFuncionario(novoFuncionario);
		
		//novoFuncionario = new Funcionario("pedro", 132207332 ,"10/05/2005");
		//funcionarioDAO.adicionarFuncionario(novoFuncionario);
		
		//Funcionario novoFuncionario = new Funcionario("Julia", 132232312 ,"10/08/205");
		//funcionarioDAO.adicionarFuncionario(novoFuncionario);
		
		funcionarioDAO.removerFuncionario("pedro");
		
		System.out.println("Lista de Funcionarios: ");
		funcionarioDAO.listarFuncionario();
		
	}
}
	