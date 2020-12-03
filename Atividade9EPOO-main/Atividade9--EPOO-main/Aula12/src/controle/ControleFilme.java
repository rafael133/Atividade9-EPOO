package controle;
import java.util.ArrayList;
import java.util.Collections;
import dominio.Filme;
public class ControleFilme {

	public static void main(String[] args) {
		ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
		listaFilmes.add(new Filme("O Rei Leão", 1995));
		listaFilmes.add(new Filme("Toy Story", 1994));
		listaFilmes.add(new Filme("Shrek", 2001));
		listaFilmes.add(new Filme("Aladin", 1992));
		listaFilmes.add(new Filme("Branca de Neve", 1937));
		Filme f = new Filme("A Pequena Sereia", 1989);
		listaFilmes.add(f);
		Collections.sort(listaFilmes, f);
		System.out.println("LISTA DE FILMES");
		for (Filme filmeTemp : listaFilmes)
			System.out.println(filmeTemp.getTitulo() + " - "

+ filmeTemp.getAno());

	}
}