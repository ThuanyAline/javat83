import java.util.Scanner;

public class ExercicioMediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		// Definir variaveis
		
		float nota1, nota2, nota3, nota4, mediaNotas;
		
		// Entrada de dados
		
		System.out.println("Digite as notas");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite as notas");
		nota2 = leia.nextFloat();

		System.out.println("Digite as notas");
		nota3 = leia.nextFloat();

		System.out.println("Digite as notas");
		nota4 = leia.nextFloat();
		
        //O barra quatro significa dividir
	    mediaNotas = (nota1 + nota2 + nota3 + nota4)/4;
			
		// Efetuar calculos
	   // Calculo das notas
	
	    System.out.println("nota1, nota2, nota3, nota4: " + mediaNotas);
		
		leia.close();
	}

}
