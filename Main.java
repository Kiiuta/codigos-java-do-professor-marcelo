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
		
		System.out.print(" Digite seu endere�o:");
		endereco = leitor.next();
		
		
		System.out.println("Seu nome � "+nome+" , voc� tem "+idade+" anos e mora em "+endereco);
		
		System.out.printf("Seu nome � %s , voc� tem %d ano e voc� mora em %s",nome, idade,endereco);
		

	}
	
}
