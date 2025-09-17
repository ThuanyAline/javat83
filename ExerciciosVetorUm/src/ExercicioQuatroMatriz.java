import java.util.Scanner;

public class ExercicioQuatroMatriz {

	public static void main(String[] args) {

		
        Scanner leia= new Scanner(System.in);
		
		float matriz[][] = new float [2][4];
		
		float media[] = new float[2];
		
		float soma = 0.0f;
		
				// input das notas
		for(int linha = 0; linha< matriz.length; linha ++) {
			for(int coluna =0; coluna <matriz[linha].length; coluna ++) {
				System.out.printf("matriz[%d][%d] = ", linha, coluna);
				 matriz[linha][coluna]= leia.nextFloat();		
				
	}

}	
		for(int linha = 0; linha< matriz.length; linha ++) {
			for(int coluna =0; coluna <matriz[linha].length; coluna ++) {
				//System.out.printf("matriz[%d][%d] = %.2f%n", linha, coluna, matriz[linha][coluna]);
		        
				soma += matriz[linha][coluna];
			}
			
			media[linha] = soma / 4;
				soma = 0.0f;
		}
		
		for(int indice= 0; indice < media.length; indice ++) {
			System.out.printf(" Média do %d aluno = %.2fn ",indice + 1, media[indice]);
		}
		
        leia.close();
	}
}