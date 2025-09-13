import java.util.Scanner;

public class ExercicioQuatroValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner leia = new Scanner(System.in);
		
		// Definir Variaveis
		
		float n1, n2, n3, n4, calculo;
		
		// Entrada de Dados
		
		System.out.println("Digite n1");
	    n1 = leia.nextFloat();
	    
	    System.out.println("Digite n2");
	    n2 = leia.nextFloat();
	    
	    System.out.println("Digite n3");
	    n3 = leia.nextFloat();
	    
	    System.out.println("Digite n4");
	    n4 = leia.nextFloat();
	    
	    calculo = (n1*n2) - (n3*n4);
	    
	    //Efetuar Calculo
	    
	    System.out.println(calculo);
	    
	    leia.close();
       
	}

}
