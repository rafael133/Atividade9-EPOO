package controle;

public class Programa {
	public static void main(String[] args) {
		ListaEncadeada<String> lista = new ListaEncadeada<String>();

		lista.adicionar("José");
		lista.adicionar("Maria");
		lista.adicionar("Dalira");
		lista.adicionar("Ralf");
		lista.adicionar("Gerson");
		System.out.println("LISTA DE NOMES");
	}
}