package condicionais;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("======================");
		System.out.println(" Codigo do produto    ");
		System.out.println("=======================");
		System.out.println("                      ");
		System.out.println("   1 - Cachorro quente");
		System.out.println("   2 - X Salada    ");
		System.out.println("   3 - X Bacon     ");
		System.out.println("   4 - Bauru       ");
		System.out.println("   5 - Refrigerante");
		System.out.println("   6 - Suco de Laranja");

		// lê o código do produto
		System.out.println("Digite a opção");
		int codigo = leia.nextInt();

		// lê a quantidade do produto
		System.out.println("Digite a quantidade");
		int quantidade = leia.nextInt();

		switch (codigo) {

		case 1:
			System.out.println("Cachorro Quente");
			System.out.println("Valor Total:" + quantidade * 10);

			break;
		case 2:
			System.out.println("X Salada");
			System.out.println("Valor Total:" + quantidade * 15);

			break;

		case 3:
			System.out.println("X Bacon");
			System.out.println("Valor Total:" + quantidade * 18);

			break;

		case 4:
			System.out.println("Bauru");
			System.out.println("Valor Total:" + quantidade * 12);

			break;

		case 5:
			System.out.println("Refrigerante");
			System.out.println("Valor Total:" + quantidade * 8);

			break;

		case 6:
			System.out.println("Suco de laranja");
			System.out.println("Valor Total:" + quantidade * 13);

			break;

		}
		leia.close();
	}

}
