package exercColecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercTres {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Declara o número digitado
		int numero;

		// cria um Set para armazenar os números sem repetição
		Set<Integer> setNumero = new HashSet<Integer>();

		// ler os números em loop não repetidos
		for (int i = 0; i < 10; i++) {
             System.out.println("Digite um valor: ");
			 numero = scanner.nextInt();
			 setNumero.add(numero);
		}

		System.out.printf("Listar os dados do set: %n"); // Exibe os dados do Set
		
        //Cria o iterator para percorrer o set
		Iterator<Integer> itNumero = setNumero.iterator(); 

		// Para exibir os números armazenados no Set
		while (itNumero.hasNext()) {
			  System.out.println(itNumero.next());
		}

		scanner.close();
	}

}
