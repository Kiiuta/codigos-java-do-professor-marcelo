import java.util.Scanner;

public class contas {

	public static void main(String[] args) {
		
		int number2;
		int number1;
		int soma;
		int subtra�ao;
		int divisao;
		int multiplica�ao;
		int porcentagem;
		
		Scanner input = new Scanner(System.in);
		
		 
		
		System.out.println("Digite o primeiro n�mero: ");
			number1= input.nextInt();
					
		System.out.println("Digite o segundo n�mero: ");
			number2 = input.nextInt();
			
		System.out.print("a soma dos n�meros � = ");
			soma= number1+number2;
		System.out.println (soma);
		
		System.out.print("a subtra��o do n�mero 1 pelo 2 � = ");
			subtra�ao=number1-number2;
		System.out.println(subtra�ao);
		
		System.out.print("a subtra��o do n�mero 2 pelo n�mero 1 � = ");
			subtra�ao=number2-number1;
		System.out.println(subtra�ao);
		
		System.out.print("a divis�o do n�mero 1 pelo 2 � = ");
				divisao=number1/number2;
		System.out.println(divisao);
		
		System.out.print("a divis�o do n�mero 2 pelo n�mero 1 � = ");
				divisao=number2/number1;
		System.out.println(divisao);
		
		System.out.print(" a multiplica��o entre os n�meros � = ");
				multiplica�ao=number2*number1;
		System.out.println(multiplica�ao);
		
		System.out.print(" O resto da divis�o do primeiro pelo segundo =  ");
		porcentagem=number1 % number2;
		System.out.println(number1%number2);
		
				
		
		
		
	}

}
