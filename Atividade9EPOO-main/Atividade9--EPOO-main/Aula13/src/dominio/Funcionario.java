package dominio;
public class Funcionario {
	private String matricula, nome;
	private float salario;
	public Funcionario(String matricula, String nome, float salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}