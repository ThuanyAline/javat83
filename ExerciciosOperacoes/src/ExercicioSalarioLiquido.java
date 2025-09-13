import java.util.Scanner;

public class ExercicioSalarioLiquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		// Definir variaveis
		
		float salarioBruto, adicional, horas, descontos, salarioLiquido;
		
		// Entrada de Dados
		
		System.out.println("Digite salario bruto");
	    salarioBruto = leia.nextFloat();

	    System.out.println("Digite adicional");
		adicional = leia.nextFloat();
	
		System.out.println("Digite as horas");
		horas = leia.nextFloat();
		
		System.out.println("Digite os descontos");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto+ adicional + horas*5 ) - descontos;
		
		// Efetuar Calculos
		// Calculos do Salario		
	
		 System.out.println("salarioBruto, adicional, horas, descontos: " + salarioLiquido);
		 
		 leia.close();
	
	}

}
