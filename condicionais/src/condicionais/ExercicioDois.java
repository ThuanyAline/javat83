package condicionais;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			int numero = leia.nextInt();
			
			//Verifica se o número é impar ou par
			if (numero %2 == 0) {
				System.out.println("O número é par!");
		
		   } else {
			   System.out.println("O número é ímpar!");
		   }
			
			
			//Verifica se o número é positivo ou negativo 
		  if (numero >= 0) {
			  System.out.println("O número é positivo!");
			  
		  } else {
			  System.out.println("O número é negativo!");
		  }
		   leia.close();
		}
		

	}

}
