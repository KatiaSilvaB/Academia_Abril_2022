package Avaliacao;

public class Funcionario {
	
	public String nome;
	public String funcao;
	public float salario;
	public int CPF;
	public String getNome() {
		return nome;
		
		
	}
	public Funcionario(String nome, String funcao, float salario, int cPF) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
		CPF = cPF;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	

}
