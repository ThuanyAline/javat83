package exercColecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		// o ARRAYLIST MANTEM NA ORDEM DAS CORES
		List<String> cores = new ArrayList<String>();

		// PARA A ENTRADA DE DADOS
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite cinco cores:");
       
		// o FOR faz o laço para receber as cincos cores digitadas pelo usuário
		for (int i = 0; i < 5; i++) {
			String cor = scanner.nextLine();
			cores.add(cor);
		}
        
		// Exibe as cores na ordem em que forem digitadas
		System.out.println("\nListar todas as cores : ");
		for (String cor : cores) {
			System.out.println(cor);
		}
        // Serve para ORDENAR as cores em ordem CRESCENTE = ALFABÉTICA
		Collections.sort(cores);

		// Exibe as cores já na ordem
		System.out.println("\nOrdenar todas as cores : ");
		for (String cor : cores) {
			System.out.println(cor);

		}

		// fecha o scanner 
         scanner.close();
	}

}
