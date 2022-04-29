import java.util.Scanner;

public class Teste3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num = in.nextInt();
		
		if(num <= 10) {
			System.out.println("O numero digita está entre os dez primeiros ");
		}else {
			System.out.println("Este numero não corresponde aos dez primeiros ");
		}
		
		// TODO Auto-generated method stub
		

	}

}
