package controle;

import dominio.Jogador;
import dominio.Time;
public class ControleTime {
	private Time time = new Time(null, null);
	private Jogador jog = new Jogador(0, null, null);
	public void cadastrarTime(String sigla, String descricao) {
		time.setSigla(sigla);
		time.setDescricao(descricao);
	}
	public void cadastrarJogador(int numero, String nome,

			String posicao) {
		jog.setNumero(numero);
		jog.setNome(nome);
		jog.setPosicao(posicao);
		time.addJogador(jog);
	}
}