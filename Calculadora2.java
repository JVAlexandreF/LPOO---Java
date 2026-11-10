// CALCULADORA 2.0

//Importando o método Scanner
import java.util.Scanner;


class Valores {
	int num1;
	int num2;

	// Criando o Construtor da classe Valores
	Valores(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Métodos aritiméticos criados
	public int somar() {
		return this.num1 + this.num2;
	}

	public int subtrair() {
		return this.num1 - this.num2;
	}

	public int multiplicar() {
		return this.num1 * this.num2;
	}

	public double dividir() {
		// Ao adicionar entre parênteses o double, transformamos as variáveis declaradas com os tipos int em double
		return (double) this.num1 / this.num2; 
	}
}

public class Calculadora2 {
	// Classe Principal (Possui o método main)
	public static void main(String[] args) {
		boolean resposta = true;

		Scanner teclado = new Scanner(System.in); // Aqui declaramos o método Scanner = teclado, para receber valores digitados 

		System.out.println("\n====================Legenda=====================\n[ 0 ] - Digite zero para Sair a qualquer momento\n\n");

		do {
			System.out.println("Digite o primeiro valor: ");
			int valor1 = teclado.nextInt(); // Primeiro valor
			
			if (valor1 == 0) { // Se o valor digitado for igual a 0, a resposta torna-se falsa e saímos do programa
				System.out.println("O zero sozinho, sai do programa.");
				resposta = false;
				break;
			}

			System.out.println("Digite o segundo valor: ");
			int valor2 = teclado.nextInt(); // Segundo valor

			if (valor2 == 0) { // Se o valor digitado for igual a 0, a resposta torna-se falsa e saímos do programa
				System.out.println("O zero sozinho, sai do programa.");
				resposta = false;
				break;
			}

			// Criamos o menu para facilitar a chamada dos operadores aritiméticos
			System.out.println("Digite:\n[ 0 ] - Sair\n[ 1 ] - Somar\n[ 2 ] - Subtrair\n[ 3 ] - Multiplicar\n[ 4 ] - Dividir\n ... ");
			int opcao = teclado.nextInt(); // Armazenando o operador na variável opcao

			Valores valores = new Valores(valor1, valor2); // Instanciando o objeto valores da classe Valores

			switch (opcao) { // O switch case realiza o processo de chamada dos métodos aritiméticos conforme a opção digitada do menu
				case 0:
					System.out.printf("Você saiu do programa!%n%n");
					resposta = false;
					break;
				case 1:
					System.out.printf("Soma: %d + %d = %d%n", valores.num1, valores.num2, valores.somar());
					break;
				case 2:
					System.out.printf("Subtração: %d - %d = %d%n", valores.num1, valores.num2, valores.subtrair());
					break;
				case 3:
					System.out.printf("Multiplicação: %d x %d = %d%n", valores.num1, valores.num2, valores.multiplicar());
					break;
				case 4:
					if (valores.num2 != 0) {
						System.out.printf("Divisão: %d / %d = %.2f%n", valores.num1, valores.num2, valores.dividir());
					} else {
						System.out.println("Erro! Não é possível dividir por zero.");
					}
					break;
				default:
					System.out.printf("Erro! Operação inválida%n%n");
			}
		} while (resposta);

		teclado.close(); // Encerramento do Scanner

	}
}