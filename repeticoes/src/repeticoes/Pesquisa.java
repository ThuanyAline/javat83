package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		 Scanner leia = new Scanner(System.in);

		 int idade, esporte, futebol = 0, voleiM18 = 0, basquetem18 =0;
		 
		 long somaIdades = 0;
		 
		 double mediaIdades = 0;
		 
		 String continua = "S";
		 
		 while(continua.equalsIgnoreCase ("S")){
			 
			 System.out.println("Pesquisar - Esporte Favorito");

			 System.out.println("Digite a sua idade: ");
			 idade = leia.nextInt();
			 
			 System.out.println("1 - Futebol");
			 System.out.println("2 - Voleibol");
			 System.out.println("3 - Basquetebol");


			 System.out.println("Digite seu esporte favorito");
             esporte = leia.nextInt();
             
             //total de pessoas que gostam de futebol
			 if (esporte == 1) {
				 futebol ++;
			 }
			 
			 // total de pesoas que gostam de volei e são maiores de 18 anos
			 if (esporte == 2 && idade >= 18) {
				 voleiM18 ++;
			 }
			 
			 // Total de pesssoa que gostam de besquetebol e são menores de 18 anos
			 if(esporte == 3 && idade <18 ) {
				basquetem18 ++;
			 }
			 
			 somaIdades += idade;
			 
			 totalRespostas ++;
			 
			 System.out.println("Deseja continuar (S/N)?");
			 
			 while(leia.hasNextLine()) {
			 leia.skip("\\R");
			 continua = leia.nextLine().toUpperCase();
			 
		 }
		 
		 
		     mediaIdades = Math.round(somaIdades / totalRespostas);
		 
			 System.out.printf("Total de pessoas que gostam de futebol: %d%n",futebol);
			 System.out.printf("Total de pessoas que gostam de voleibol maiores de 18 anos: %d%n", voleiM18);
			 System.out.printf("Total de pessoas que gostam de basquetebol: %d%n\",futebol");
			 System.out.printf("Deseja continuar (S/N)?");

		    leia.close;
	}

}
