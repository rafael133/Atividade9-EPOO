package controle;
import java.util.ArrayList;
import java.util.Collections;
import dominio.Conta;
public class ControleConta {
	public static void main(String[] args) {
		ArrayList<Conta> listaContas = new ArrayList<Conta>();
		listaContas.add(new Conta(3017, "José"));
		listaContas.add(new Conta(8379, "Maria"));
		listaContas.add(new Conta(2326, "Dalira"));
		listaContas.add(new Conta(7068, "Ralf"));
		listaContas.add(new Conta(3842, "Gerson"));
		Collections.sort(listaContas);
		System.out.println("LISTA DE CONTAS");
		for (Conta contaTemp : listaContas)
			System.out.println(contaTemp.getNumero() + " - "

+ contaTemp.getTitular());

	}
}