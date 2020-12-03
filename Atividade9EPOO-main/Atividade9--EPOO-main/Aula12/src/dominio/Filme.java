package dominio;
import java.util.Comparator;
public class Filme implements Comparator<Filme> {
	private String titulo;
	private int ano;
	public Filme(String titulo, int ano) {
		this.titulo = titulo;
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int compare(Filme f1, Filme f2) {
		return f1.getTitulo().compareTo(f2.getTitulo());
	}
}