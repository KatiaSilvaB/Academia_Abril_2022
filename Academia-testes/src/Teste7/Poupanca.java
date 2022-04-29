package Teste7;
public class Poupanca extends Conta{
	
	private double rendimento;
	
	public Poupanca(String numero, double saldo, double rendimento) {
		super(numero, saldo);
		this.rendimento = rendimento;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	@Override
	public String toString() {
		return "Poupanca [rendimento = " + rendimento + "]";
	}

}
