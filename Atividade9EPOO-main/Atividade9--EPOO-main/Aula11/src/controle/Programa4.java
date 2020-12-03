package controle;
import java.util.Iterator;
import java.util.TreeSet;
public class Programa4 {
	public static void main(String[] args) {
		TreeSet<String> nomes = new TreeSet<String>();
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Dalira");
		nomes.add("Ralf");
		nomes.add("Gerson");
		System.out.println("LISTA 1 DE NOMES: ");
		Iterator it = nomes.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " - ");

	}
}