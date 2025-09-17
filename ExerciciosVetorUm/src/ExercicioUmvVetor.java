import java.util.Scanner;

public class ExercicioUmvVetor {

	public static void main(String[] args) {

		// dez números inteiros, não ordenados
		int[] vetor = { 3, 2, 1, 5, 4, 7, 6, 9, 8, 10 };

		Scanner leia = new Scanner(System.in);
		// Mensagem para o usuário
		System.out.printf("Digite um número: ");
		int numero = leia.nextInt();

		boolean encontrado = false;

		for (int indice = 0; indice < vetor.length; indice++) {
			if (vetor[indice] == numero) {
				System.out.println(" O número " + numero + " Está localizado na posição: " + indice);
				encontrado = true;
				break;
			}
			
		if (!encontrado) {
		System.out.println(" não foi encontrado ");
		}

				leia.close();


	}

}
	
}
