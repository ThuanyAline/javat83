import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioUmEstrutura {

	public static void main(String[] args) {
		
	
	    Scanner scanner = new Scanner(System.in);
	    
	    //Cria a fila de clientes String garante a ordem
		Queue<String> fila = new LinkedList<String>();
		
		// o -1 é para o menu rodar 
		int opcao = -1; // Variável para controlar o menu
		
		// enquanto a opção não for zero, o programa continua rodando
		while (opcao != 0){
		System.out.println("\n=== Menu banco ===");
		System.out.println("1 - Adicionar novo cliente");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Chamar próximo cliente");
		System.out.println("0 - Sair");
		System.out.println("Escolha uma opção");
		opcao = scanner.nextInt();
		// Limpar linha
		scanner.nextLine(); 
		
		switch (opcao) {
			case 1:
				System.out.print("Digite o nome do Cliente: ");
				String nome = scanner.nextLine();
			    fila.add(nome);
			    System.out.println(" Cliente \"" + nome + "\" adicionado à fila.");
			    break;
			    
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				}   else {
					System.out.println("Clientes na fila: ");
					for (var pessoa : fila) {
						System.out.println("- " + pessoa);
					}
				}
		        break;
                
		        // isEmpty
			case 3:
            	if (fila.isEmpty()) {
            		System.out.println("A fila está vazia. Nenhum cliente para chamar");
            	} else {
            		//remove o primeiro da fila
            		String chamado = fila.poll();  
            		System.out.print("Cliente chamado: " + chamado);
            		
            	}
                break;
                
			case 0:
				System.out.println("Encerrando o programa...");
                
		    default:
		    	System.out.println("Opção invalida. Tente novamente.");
		
		}
		
		
				}		
		scanner.close();
	}

}
