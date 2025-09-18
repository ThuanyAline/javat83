import java.util.Scanner;

public class ExercicioTresMatriz {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int matriz[][] = new int [3][3];
		
		String diagonalPrincipal = "", diagonalSecundaria = "";
		
		int somaPrincipal = 0, somaSecundaria = 0;
		
		// diagonal principal
		for(int linha = 0; linha < matriz.length; linha ++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				System.out.printf("matriz[%d][%d] = ", linha, coluna);
		        matriz[linha][coluna]= leia.nextInt();
			  }
			
			}
			
			  // diagonal pricipal
		     // lista e somar os elementos da diagonal principal
		    //Na diagonal principal os índices dos elementos são iguais 
		   // Exemplo:0,0 
		for (int indice = 0; indice < matriz.length; indice ++) {
		     diagonalPrincipal += matriz[indice][matriz.length -1 - indice] +" ";
		     somaPrincipal += matriz[indice][matriz.length - 1 - indice];
		     
		}
		
		// diagonal secundaria
		//listar e somar os elementos da diagonal Secundária
		// na diagonal secundária o indice da colunaa é o resultado entre o tamanho da linha -1- indice da linha
		// ex: 2,0 => tamanho da liha (3) -1- indice da linha 2()
		
		 for(int indice= 0; indice < matriz.length; indice ++) {
		    diagonalSecundaria += matriz[indice][indice] + " ";
		    somaSecundaria += matriz[indice][indice];
		 
		 }
		 
		 
		  System.out.println(" Diagonal Principal: " + diagonalPrincipal);
		  System.out.println(" Diagonal Principal: " + diagonalSecundaria);
		  System.out.println("Soma dos elementos da Diagonal Principal: " + somaPrincipal);
		  System.out.println("Soma dos elementos da Diagonal Secundaria: " + somaSecundaria);

		  
		  
		  leia.close();
	}

}


