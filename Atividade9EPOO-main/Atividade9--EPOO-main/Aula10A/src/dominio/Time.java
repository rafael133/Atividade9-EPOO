package dominio;
import java.util.ArrayList;
public class Time {
	private String sigla, descricao;
	private ArrayList<Jogador> listaJogadores;
	public Time(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
		listaJogadores = new ArrayList<Jogador>();
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void addJogador(Jogador novoJogador) {
		if (listaJogadores.contains(novoJogador))
			return;
		else {
			listaJogadores.add(novoJogador);
			novoJogador.setTime(this);
		}
	}
	public void removeJogador(Jogador exJogador) {
		if (!listaJogadores.contains(exJogador))
			return;
		else {
			listaJogadores.remove(exJogador);
			exJogador.setTime(null);
		}
	}
}