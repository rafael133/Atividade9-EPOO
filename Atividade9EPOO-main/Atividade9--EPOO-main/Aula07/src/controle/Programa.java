package controle;
import java.util.Vector;
public class Programa {
	public static void main(String[] args) {
		Vector<String> listaNomes = new Vector<String>();
		listaNomes.add("José");
		listaNomes.add("Maria");
		listaNomes.add("Dalira");
		listaNomes.add("Ralf");
		listaNomes.add("Maria");
		listaNomes.add("Gerson");
		System.out.println("Tamanho da coleção: " +

listaNomes.size());

		System.out.println("Primeiro nome da coleção: " +

listaNomes.firstElement());

		System.out.println("Último nome da coleção: " +

listaNomes.lastElement());

		System.out.println("Terceiro nome da coleção: " +

listaNomes.get(2));

		System.out.println("Primeira posição de Maria: " +

listaNomes.indexOf("Maria"));

		System.out.println("Última posição de Maria: " +
				listaNomes.lastIndexOf("Maria"));

		if (listaNomes.contains("Gerson"))
			System.out.println("Gerson está na coleção");
		else
			System.out.println("Gerson não está na coleção");
		if (listaNomes.contains("João"))
			System.out.println("João está na coleção");
		else
			System.out.println("João não está na coleção");
		System.out.println("");
		System.out.print(listaNomes);
		listaNomes.add("Marco");
		System.out.println("");
		System.out.print(listaNomes);

		listaNomes.add(4, "Augusto");
		System.out.println("");
		System.out.print(listaNomes);
		listaNomes.setElementAt("Severino", 3);
		System.out.println("");
		System.out.print(listaNomes);
		listaNomes.remove("Augusto");
		System.out.println("");
		System.out.print(listaNomes);
	}
}