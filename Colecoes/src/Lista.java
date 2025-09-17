
public class Lista {

	public static void main(String[] args) {

		ArrayList<Interger> numeros = new Arraylist<Integer>();
		
		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(5);
		
		System.out.println(numeros);
		
		System.out.println("Exibir o elemento na posição 2: " + numeros.get(2));

		System.out.println("Exibir o indice do elemento 10: " + numeros.indexOf(2));

        numeros.set(numeros.indezOf(10), 4);
        
        numeros.remove(numeros.indexOf(5));
        
        System.out.println(numeros);
        
	}

}
