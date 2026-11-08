// CLASSE ABSTRATA

// Super classe
abstract class Animal {
	private String nome; // Atributo comum a todos os animais

	// Método Construtor
	public Animal(String nome) {
		this.nome = nome;
	}	

	// Método normal
	public void dormir() {
		System.out.println(nome + " está dormindo...Zzz");
	}

	// Método abstrato (não tem corpo; as subclasses são obrigadas a criar)
	public abstract void emitirSom();

	// Getter para o nome
	public String getNome() {
		return nome;
	}
}

// Subclasse
class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome); // Chama o construtor da classe pai (Animal)
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " faz: Au au!");
	}
}

// Subclasse
class Gato extends Animal {

	public Gato(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(getNome() + " faz: Miau!");
	}	
}

// Classe de testes (Principal. Possui o método main)
public class Abstracao {
	public static void main(String[] args) {

		Cachorro meuCachorro = new Cachorro("Rex");
		Gato meuGato = new Gato("Alex");

		meuCachorro.dormir();    // Herdado da classe Animal
		meuCachorro.emitirSom(); // Implementado na classe Cachorro

		meuGato.dormir();        // Herdado da classe Animal
		meuGato.emitirSom();     // Implementado na classe Gato
	}
}


