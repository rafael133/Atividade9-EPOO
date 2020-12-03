package controle;
import dominio.Time;
public class ControleTime {
	private Time time = new Time(null, null);
	public void cadastrarTime(String sigla, String descricao) {

		time.setSigla(sigla);
		time.setDescricao(descricao);
	}
}