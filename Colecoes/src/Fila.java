import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		
		Queue<String> fila = new LinkedList<String>();
		
		// ADD SIGNIFICA METODO DE INSERÇÃO
		fila.add("Maria");
		fila.add("Aline");
		fila.add("Letícia");
		fila.add("Cintia");
		fila.add("Rayssa");
				
		System.out.println(fila);
		
		//retirar elemento da fila
		
		fila.add("Milena");
		fila.add("Nadia");
		
		System.out.println(fila);

		System.out.println("O tamanho da fila é: " + fila.size());
		
		// o VAR É UTIL PARA CRIAR UMA VARIAVEL QUE DA PARA INFERIR O VALOR 
		for(var pessoa : fila) {
			System.out.println(pessoa);
			
		}
		}

}
