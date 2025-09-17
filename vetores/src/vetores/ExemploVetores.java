package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nomes[] = { "Cintia", "Stella", "Patricia", "Rafaela", "Leticia", "Jamila", "Priscila" };

		int numeros[] = new int[5];

		System.out.printf("Listagem- Vetor de nomes");


		// ordenar o vetor
				Arrays.sort(nomes);
				
				Arrays.sort(nomes, Collections.reverseOrder());
				
		for (int indice = 0; indice < nomes.length; indice++) { // length define o nome do vetor
			System.out.printf("nomes[%d] = %s%n", indice, nomes[indice]);
		}
		
		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.printf("numeros[%d] = %s%nde nomes");
			numeros[indice] = leia.nextInt();
			
		System.out.printf("\nImput de dados - Vetor");

		}

		System.out.printf("n/Listagem- Vetor de nomes");

		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.printf("numeros[%d] = %s%n", indice, numeros[indice]);
            nomes[indice] = leia.nextInt();
		}
		leia.close();
	}
}
