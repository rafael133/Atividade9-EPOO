package controle;
import java.util.Iterator;
import java.util.LinkedList;
public class Programa {
	public static void main(String[] args) {
		LinkedList<String> nomes = new LinkedList<String>();
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Dalira");
		nomes.add("Ralf");
		nomes.add("Gerson");
		System.out.println("Lista 1 de Nomes");

		for (String nomeTemp : nomes)
			System.out.print(nomeTemp + " - ");
		nomes.add("Severino");
		System.out.println("\nLista 2 de Nomes");
		for (Iterator it = nomes.iterator(); it.hasNext();)
			System.out.print(it.next() + " - ");
		nomes.add("Marco");
		System.out.println("\nLista 3 de Nomes");
		Iterator it = nomes.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " - ");

	}
}