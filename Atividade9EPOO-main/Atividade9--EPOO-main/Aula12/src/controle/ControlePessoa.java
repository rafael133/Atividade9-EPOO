package controle;
import java.util.ArrayList;
import java.util.Collections;
import dominio.Pessoa;
public class ControlePessoa {
	public static void main(String[] args) {
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		listaPessoas.add(new Pessoa(17, 'M'));
		listaPessoas.add(new Pessoa(83, 'F'));
		listaPessoas.add(new Pessoa(42, 'M'));
		listaPessoas.add(new Pessoa(79, 'F'));
		listaPessoas.add(new Pessoa(23, 'M'));
		Pessoa p = new Pessoa(3, 'F');
		listaPessoas.add(p);
		Collections.sort(listaPessoas, p);
		for (Pessoa pessoaTemp : listaPessoas)
			System.out.println(pessoaTemp.getIdade() + " - " + pessoaTemp.getSexo());

	}
}