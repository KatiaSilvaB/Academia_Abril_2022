import java.util.Scanner;

public class Teste4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite um numero 1: ");
		num1 = in.nextInt();
		System.out.println("Digite um numero 2: ");
		num2 = in.nextInt();
		System.out.println("Digite um numero 3: ");
		num3 = in.nextInt();
		
		if((num1 < num2)) {
			System.out.println("Seu maior numero é: " + num2);
		}if((num2 < num3)){
			System.out.println("Seu maior numero é: " + num3);	 
		}else {
			System.out.println("Seu maior numero é: " + num1);
		}
		// TODO Auto-generated method stub

	}

}
