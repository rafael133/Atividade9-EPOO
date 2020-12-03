package controle;
import java.util.TreeSet;
import dominio.Disciplina;
public class Programa5 {
	public static void main(String[] args) {
		TreeSet<Disciplina> disciplinas =
				new TreeSet<Disciplina>();

		disciplinas.add(new Disciplina("388", "PRE"));
		disciplinas.add(new Disciplina("203", "FPR II"));

		disciplinas.add(new Disciplina("225", "POO"));
		disciplinas.add(new Disciplina("232", "POO II"));
		disciplinas.add(new Disciplina("363", "OPR"));
		disciplinas.add(new Disciplina("372", "PIS"));
		disciplinas.add(new Disciplina("236", "APR"));
		System.out.println("LISTA DE DISCIPLINAS");
		for (Disciplina discTemp : disciplinas)
			System.out.println(discTemp.getCodigo() + " - " +

discTemp.getDescricao());

	}
}