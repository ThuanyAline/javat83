import java.util.Scanner;

public class ExercicioTresMatriz {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int matriz[][] = new int [3][3];
		
		String diagonalPrincipal = "", diagonalSecundaria = "";
		
		int somaPrincipal = 0, somaSecundaria = 0;
		
		// diagonal principal
		for(int linha = 0; linha< matriz.length; linha ++) {
			for(int coluna =0; coluna <matriz[linha].length; coluna ++) {
				System.out.printf("matriz[%d][%d] = ", linha, coluna);
		        matriz[linha][coluna]= leia.nextInt();
			
			}
			
			// diagonal secundária
		for (int indice = 0; indice < matriz.length; indice ++) {
		     diagonalSecundaria += matriz[indice][matriz.length -1 - indice] +" ";
		     somaSecundaria += matriz[indice][matriz.length - 1 - indice];
		     
		     {  
		}
		
		}
		 for(int indice= 0; indice < matriz.length; indice ++) {
		    diagonalPrincipal += matriz[indice][indice] + " ";
		    somaPrincipal += matriz[indice][indice];
		 
		 }
		 
		 
		  System.out.println(" Diagonal Principal: " + diagonalPrincipal);
		  
		  System.out.println("Soma dos elemen tos da Diagonal Principal");
        
		  
		  
		  leia.close();
	}

}

}
