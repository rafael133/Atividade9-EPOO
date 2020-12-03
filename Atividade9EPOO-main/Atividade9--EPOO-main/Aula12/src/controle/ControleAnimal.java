package controle;
import java.util.ArrayList;
import java.util.Collections;
import dominio.Animal;
public class ControleAnimal {
	public static void main(String[] args) {
		ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
		listaAnimais.add(new Animal("Coração", "Streetdog"));
		listaAnimais.add(new Animal("Suzuki", "Streetdog"));
		listaAnimais.add(new Animal("Pachola", "Streetdog"));
		listaAnimais.add(new Animal("Betinha", "Streetdog"));
		listaAnimais.add(new Animal("Mel", "Poodle"));
		Collections.sort(listaAnimais);
		System.out.println("LISTA DE ANIMAIS");
		for (Animal animalTemp : listaAnimais)
			System.out.println(animalTemp.getNome() + " - "

+ animalTemp.getRaca());

	}
}