package condicionais;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int valorA, valorB, valorC, soma;
		
		System.out.println("Digite o valor A: ");
		valorA= leia.nextInt();

		System.out.println("Digite o valor B: ");
		valorB= leia.nextInt();

		System.out.println("Digite valor C: ");
		valorC= leia.nextInt();
 
		soma =(valorA + valorB);
		
	   //System.out.printf("A soma é %d", soma);
		
		if(soma> valorC ) {
			System.out.println(valorA + "+" + valorB  + "=" +  soma + ">" + valorC);
			System.out.println("A+B é maior que C");
		}else if(soma< valorC ) {
				System.out.println("A+B é menor que C");
		}else if (soma== valorC) {
			System.out.println("A+B é igual a C");

	}
        leia.close();
	}
}
