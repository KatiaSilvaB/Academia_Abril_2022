import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Digite um numero 1: ");
		num1 = in.nextInt();
		System.out.println("Digite um numero 2: ");
		num2 = in.nextInt();
		
		System.out.println("Valor da soma: " + (num1 + num2));
		System.out.println("Valor da subtração: " + (num1 - num2));
		System.out.println("Valor da multiplicação: " + (num1 * num2));
		System.out.println("Valor da divisão: " + (num1 / num2));
		
		
		// TODO Auto-generated method stub

	}

}
