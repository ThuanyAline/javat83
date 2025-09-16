package condicionais;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número 1");
		float numero1 = scanner.nextFloat();
		
		System.out.println("Digite o número 2");
		float numero2 = scanner.nextFloat();
		
		System.out.println("Digite a operação ");
		int operacao = scanner.nextInt();
		
		switch (operacao) {

		case 1:
			System.out.println("A soma é igual:" + (numero1 + numero2));
			break;
			
		case 2:
			System.out.println("A subtração é igual:" + (numero1 - numero2));
			break;
			
		case 3:
			System.out.println("A multiplicação é igual:" + (numero1 * numero2));
			break;
			
		case 4:
			System.out.println("A multiplicação é igual:" + (numero1 / numero2));
			break;
			
		default:
			System.out.println("Opção inválida");
			
			}
	}

}
