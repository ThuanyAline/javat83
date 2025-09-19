import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecoesSete {

	public static void main(String[] args) {
		

		Set<String> frutas = new HashSet<String>();
		
		 // mesmo a banana estando repitida ele não mostra ela duas vezes
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("banana");

		
		
		System.out.println(frutas);
		
		for (String fruta : frutas) {
			// função hash usada para embaralhar criptografia
			System.out.println(fruta.hashCode());
		}
		 // remove ser para remover da lista
		frutas.remove("Abacate");
		
		System.out.println(frutas);
		
		System.out.println ("A fruta Amora está presente no set ? " + frutas.contains ("Amora"));
	
		System.out.println("O set está vazio? " + frutas.isEmpty());
		
		Iterator<String> itFrutas = frutas.iterator();
		
		
        // next mostra o proximo elemente se tiver mostra p mim se não tiver não mostra , só vai não volta 
		while(itFrutas.hasNext()) {
			System.out.println(itFrutas.next());
		}
	     //cria o ArrayList
		ArrayList<String> frutaList = new ArrayList<String>();
		
		// add todos os elementos da coleção Set no Arraylist
		frutaList.addAll(frutas);
		
		// ordenação dos dados em ordem crescente
		frutaList.sort(null);
		
		// lista os dados da Arraylist
		System.out.println(frutaList);
		
		frutaList.sort(Comparator.reverseOrder());
		
		System.out.println(frutaList);
	
	}
	

	}


