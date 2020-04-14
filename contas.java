import java.util.Scanner;

public class contas {

	public static void main(String[] args) {
		
		int number2;
		int number1;
		int soma;
		int subtraçao;
		int divisao;
		int multiplicaçao;
		int porcentagem;
		
		Scanner input = new Scanner(System.in);
		
		 
		
		System.out.println("Digite o primeiro número: ");
			number1= input.nextInt();
					
		System.out.println("Digite o segundo número: ");
			number2 = input.nextInt();
			
		System.out.print("a soma dos números é = ");
			soma= number1+number2;
		System.out.println (soma);
		
		System.out.print("a subtração do número 1 pelo 2 é = ");
			subtraçao=number1-number2;
		System.out.println(subtraçao);
		
		System.out.print("a subtração do número 2 pelo número 1 é = ");
			subtraçao=number2-number1;
		System.out.println(subtraçao);
		
		System.out.print("a divisão do número 1 pelo 2 é = ");
				divisao=number1/number2;
		System.out.println(divisao);
		
		System.out.print("a divisão do número 2 pelo número 1 é = ");
				divisao=number2/number1;
		System.out.println(divisao);
		
		System.out.print(" a multiplicação entre os números é = ");
				multiplicaçao=number2*number1;
		System.out.println(multiplicaçao);
		
		System.out.print(" O resto da divisão do primeiro pelo segundo =  ");
		porcentagem=number1 % number2;
		System.out.println(number1%number2);
		
				
		
		
		
	}

}
