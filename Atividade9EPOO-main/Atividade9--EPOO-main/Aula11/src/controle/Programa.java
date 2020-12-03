package controle;
import java.util.HashSet;
import java.util.Iterator;
public class Programa {
	public static void main(String[] args) {
		HashSet<String> nomes = new HashSet<String>();
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Dalira");
		nomes.add("Ralf");
		nomes.add("Gerson");
		System.out.println("LISTA 1 DE NOMES: ");
		Iterator it = nomes.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " - ");
		nomes.add("Severino");
		System.out.println("\nLISTA 2 DE NOMES: ");
		for (String nomeTemp : nomes)
			System.out.print(nomeTemp + " - ");
		nomes.add("Maria");
		System.out.println("\nLISTA 3 DE NOMES: ");
		for (String nomeTemp : nomes)
			System.out.print(nomeTemp + " - ");

	}
}