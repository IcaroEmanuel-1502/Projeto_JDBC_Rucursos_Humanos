package bancoDeDados;

public class Funcionario {
	
	// attributes
	private String NomeFuncionario;
	private int CPF;
	private String dataDeInicio;
	
	// constructor
	
	public Funcionario(String NomeFuncionario  , int CPF, String dataDeInicio ) {
		this. NomeFuncionario = NomeFuncionario;
		this. CPF =  CPF;
		this. dataDeInicio= dataDeInicio;
	}

	public String getNomeFuncionario() {
		return NomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		NomeFuncionario = nomeFuncionario;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public String getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	
}