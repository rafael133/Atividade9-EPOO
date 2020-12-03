package dominio;
import java.util.Comparator;
public class Pessoa implements Comparator<Pessoa> {
	private int idade;
	private char sexo;
	public Pessoa(int idade, char sexo) {

		this.idade = idade;
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int compare(Pessoa p1, Pessoa p2) {
		if (p1.getIdade() > p2.getIdade())
			return 1;
		else if (p1.getIdade() < p2.getIdade())

			return -1;

		return 0;
	}
}