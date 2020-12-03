package controle;
import java.util.Scanner;
import dominio.Funcionario;
public class Programa {
	public static void main(String[] args) {
		ControleFuncionario cf = new ControleFuncionario();
		cf.addFuncionario(new Funcionario("4433", "Jose", 1023));
		cf.addFuncionario(new Funcionario("4444", "Maria", 1038));
		cf.addFuncionario(new Funcionario("4411", "Dalira", 1003));
		cf.addFuncionario(new Funcionario("4455", "Ralf", 1026));
		cf.addFuncionario(new Funcionario("4422", "Gerson", 1017));
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite uma matrícula: ");
		String matricula = leia.nextLine();
		System.out.println("Nome: " +

cf.informarFuncionario(matricula).getNome());

		System.out.println("Salário: R$ " +

cf.informarFuncionario(matricula).getSalario());

	}
}