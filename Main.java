import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;
		String endereco; 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print(" Digite seu nome:");
		nome = leitor.nextLine();
		
		System.out.printf(" Bem vindo senhor(a): "+nome);
		leitor.hasNextLine();
		
		System.out.print(" Digite sua idade:");
		idade = leitor.nextInt();
		
		System.out.print(" Digite seu endereço:");
		endereco = leitor.next();
		
		
		System.out.println("Seu nome é "+nome+" , você tem "+idade+" anos e mora em "+endereco);
		
		System.out.printf("Seu nome é %s , você tem %d ano e você mora em %s",nome, idade,endereco);
		

	}
	
}
