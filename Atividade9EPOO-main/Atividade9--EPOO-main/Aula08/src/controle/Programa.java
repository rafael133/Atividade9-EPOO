package controle;
import java.util.Scanner;
import java.util.Vector;
import dominio.Medico;
import dominio.Parto;
public class Programa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("CADASTRO DE MÉDICO");
		System.out.print("Digite o CRM: ");
		String crm = leia.nextLine();
		System.out.print("Digite o CPF: ");
		String cpf = leia.nextLine();
		System.out.print("Digite o nome: ");
		String nome = leia.nextLine();
		Medico med = new Medico(crm, cpf, nome);
		System.out.println("CADASTRO DE PARTOS");
		char resposta = 'S';
		do {
			System.out.print("Digite a data: ");
			String data = leia.next();
			System.out.print("Digite a hora: ");
			String hora = leia.next();
			Parto parto = new Parto(data, hora);
			med.addParto(parto);
			System.out.print("Deseja Continuar? <S/N>: ");
			resposta = leia.next().charAt(0);
		} while (resposta == 'S');
		System.out.println("Agenda de Partos do Dr(a) " + med.getNome());

		Vector<Parto> lista = med.getListaPartos();
		
		for (Parto partoTemp : lista) {
			System.out.print(partoTemp.getData() + " - ");
			System.out.println(partoTemp.getHora());
			System.out.print("Deseja remover da agenda? <S/N>:");
			resposta = leia.next().charAt(0);
			if (resposta == 'S')
				med.removeParto(partoTemp);

		}
		System.out.println("Agenda Atualizada de Partos do Dr(a) " + med.getNome());

		Vector<Parto> lista2 = med.getListaPartos();
		for (Parto partoTemp : lista2) {
			System.out.print(partoTemp.getData() + " - ");
			System.out.println(partoTemp.getHora());
		}
	}
}