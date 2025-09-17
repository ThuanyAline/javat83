import java.util.Scanner;

public class ExercicioCincoDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero;
		
		int somaPositivos = 0;
		
		do {
			System.out.print("Digite o número: ");
			numero = leia.nextInt();
			
		if (numero > 0) {
			//soma apenas se o número for positivo
			somaPositivos += numero;
		}
			
		} while (numero != 0);
		
		System.out.println("\nA soma dos números positivos é: " + somaPositivos);

		leia.close();
	}

}
