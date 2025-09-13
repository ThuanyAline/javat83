import java.util.Scanner;

public class ExercicioSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner leia = new Scanner(System.in);
        
        //Definir as variáveis
        
        float salario, abono, novoSalario;
        
        //Entrada de dados
        
        System.out.println("Digite o Salario");
        salario = leia.nextFloat();
        
        System.out.println("Digite o Abono");
        abono = leia.nextFloat();
        
        novoSalario = salario + abono;
        
        //Efetuar cálculos
        
      //  System.out.printf("%.2f + %.2f = %.2f%n", salario + abono = novoSalario);
        System.out.println("novo salario: " + novoSalario);
        
        leia.close();
        
		
		
	}

}
