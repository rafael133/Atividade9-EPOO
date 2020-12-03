package controle;
import java.util.Iterator;
import java.util.LinkedList;
import dominio.Disciplina;
public class Programa2 {
	public static void main(String[] args) {
		LinkedList<Disciplina> listaDisc =
				new LinkedList<Disciplina>();

		listaDisc.add(new Disciplina("EIN232", "POO II"));
		listaDisc.add(new Disciplina("EIN225", "POO"));
		listaDisc.add(new Disciplina("EIN236", "APR"));
		listaDisc.add(new Disciplina("EIN388", "PRE"));
		listaDisc.add(new Disciplina("EIN363", "OPR"));
		Iterator it = listaDisc.iterator();
		while (it.hasNext()) {
			Disciplina discTemp = (Disciplina)it.next();
			System.out.println(discTemp.getCodigo() + " - " + discTemp.getDescricao());

		}
	}
}