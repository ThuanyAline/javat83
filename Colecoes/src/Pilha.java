import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
        // dentro do <> fica o tipo de dado
	Deque<String> pilha = new ArrayDeque<String>();
	
	// push COLOCA coisas na PILHA POP RETIRA COISAS DA PILHA
	pilha.push("Pai Rico Pai Pobre");
	pilha.push("Maus");
	pilha.push("Crime e Castigo");
	pilha.push("Quartodo Despejo");
	
	System.out.println(pilha);
	
	pilha.pop();
	
	System.out.println(pilha);
	
	System.out.println(" O livro Guia do Mochileiro da Galáxia está na pilha ?" + pilha.contains("Guia dos Mochileiros das Galáxias"));

	}

}
