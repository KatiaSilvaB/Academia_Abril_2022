package Teste7;

public class Funcionarios {
	
	
	private static String nome;
	private static int CPF;
	private static float salario;
	
	Funcionarios(String nome, int CPF, float salario ){
		this.setNome(nome);
		this.setCPF(CPF);
		this.setSalario(salario);
		
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int getCPF() {
		return CPF;
	}

	public static void setCPF(int cPF) {
		CPF = cPF;
	}

	public static float getSalario() {
		return salario;
	}

	public static void setSalario(float salario) {
		Funcionarios.salario = salario;
	}
    
	

	
        	
	

}
