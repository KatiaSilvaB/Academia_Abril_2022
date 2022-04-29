import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		int idade;
				
		System.out.println("Digite seu nome: ");
		nome = input.next();
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		
		
		System.out.println("Nome: " +  nome + " " + idade + " anos");
		// TODO Auto-generated method stub

	}

}
