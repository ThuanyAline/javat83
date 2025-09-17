import java.util.Scanner;

public class ExercicioTresWhile {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
	    int idadem21 = 0, idadeM50 = 0 , idade;
	    
	    System.out.println("Digite uma idade");
		idade = leia.nextInt();
		
		//idade negativa programa para 
		while(idade > 0 ){
			
			// todas as idades menores que 21
	        if (idade <21) {	
	    	// ++ significa mais um
		    idadem21 ++;
	        }
		    //todas as idades maiores que 50
		    if (idade >50) {	
		    // ++ significa mais um
			idadeM50 ++;
		    }
		    System.out.println("Digite uma idade");
			idade = leia.nextInt();
		}
		 System.out.println("\nTotal de pessoas menores de 21 anos: " + idadem21);
	     System.out.println("Total de pessoas maiores de 50 anos: " + idadeM50);
		   
	     leia.close();
		}
		
	}


