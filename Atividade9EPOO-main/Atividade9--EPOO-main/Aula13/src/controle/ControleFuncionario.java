package controle;
import java.util.HashMap;
import dominio.Funcionario;
public class ControleFuncionario {
	private HashMap<String, Funcionario> listaFunc =
			new HashMap<String, Funcionario>();
	public void addFuncionario(Funcionario novoFunc) {
		listaFunc.put(novoFunc.getMatricula(), novoFunc);
	}
	public Funcionario informarFuncionario(String matricula) {
		return listaFunc.get(matricula);
	}
}