// HERANÇA

// Superclasse
class Veiculo {
    String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public void buzinar() {
        System.out.println(marca + " faz: Bi-bi!");
    }
}

// Subclasse (Classe Filha) - Herda tudo de Veiculo
class Carro extends Veiculo {
    int portas;

    public Carro(String marca, int portas) {
        super(marca); // Envia a marca para o construtor da classe mãe
        this.portas = portas;
    }

    // Método exclusivo da classe Carro
    public void abrirPortas() {
        System.out.println("Abrindo as " + portas + " portas do " + marca + ".");
    }
}

// Classe Principal para Testar
public class Heranca {
    public static void main(String[] args) {
        
        // Na herança comum, podemos criar a classe mãe diretamente:
        Veiculo v = new Veiculo("Genérico");
        v.buzinar();

        // A classe filha tem os métodos dela E os da classe mãe:
        Carro meuCarro = new Carro("Fiat", 4);
        meuCarro.buzinar();     // Método herdado de Veiculo
        meuCarro.abrirPortas(); // Método próprio de Carro
    }
}
