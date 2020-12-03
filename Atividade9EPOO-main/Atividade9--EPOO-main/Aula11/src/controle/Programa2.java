package controle;
import java.util.HashSet;
import dominio.Time;
public class Programa2 {
	public static void main(String[] args) {
		HashSet<Time> times = new HashSet<Time>();
		times.add(new Time("CRF", "Flamengo"));
		times.add(new Time("CRVG", "Vasco da Gama"));
		times.add(new Time("BFR", "Botafogo"));
		times.add(new Time("FFC", "Fluminense"));
		times.add(new Time("SAI", "Sel Av Itatiaia"));
		System.out.println("LISTA 1 DE TIMES:");
		for (Time timeTemp : times)
			System.out.println(timeTemp.getSigla() + " - " +

timeTemp.getDescricao());

	}
}