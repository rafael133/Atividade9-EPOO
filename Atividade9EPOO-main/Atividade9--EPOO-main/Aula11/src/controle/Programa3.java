package controle;
import java.util.TreeSet;

public class Programa3 {
	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		numeros.add(17);
		numeros.add(26);
		numeros.add(3);
		numeros.add(38);
		numeros.add(23);
		System.out.println("LISTA 1 DE NÚMEROS:");
		for (Integer numeroTemp : numeros)
			System.out.print(numeroTemp + " - ");
		numeros.add(83);
		numeros.add(68);
		numeros.add(79);
		numeros.add(70);
		numeros.add(42);
		System.out.println("\nLISTA 2 DE NÚMEROS:");
		for (Integer numeroTemp : numeros)
			System.out.print(numeroTemp + " - ");

	}
}