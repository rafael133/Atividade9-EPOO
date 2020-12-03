package controle;
public class Programa {
	public static void main(String[] args) {
		ListaEncadeada<String> lista = new ListaEncadeada<String>();
		lista.adicionar("José");
		lista.adicionar("Maria");
		lista.adicionar("Dalira");
		lista.adicionar("Ralf");
		lista.adicionar("Gerson");
		System.out.println("LISTA 1 DE NOMES");
		for (int i = 0; i < lista.getTamanho(); i++)
			System.out.println(lista.obter(i));
		lista.remover("Dalira");
		System.out.println("LISTA 2 DE NOMES");
		for (int i = 0; i < lista.getTamanho(); i++)

			System.out.println(lista.obter(i));

	}
}