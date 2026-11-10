// CRIANDO UMA CALCULADORA SIMPLES

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); 
		String opcao; 

		do {
			System.out.println("\nDigite o primeiro número: ");
			double num1 = teclado.nextDouble();

			System.out.println("Digite o segundo número: ");
			double num2 = teclado.nextDouble();

			System.out.println("Digite:\n [ - ] Subtração\n [ + ] Adição\n [ * ] Multiplicação\n [ / ] Divisão\n [ 0 ] Sair");
			opcao = teclado.next();

			// Só faz o cálculo se a opção NÃO for "0"
			if (!opcao.equals("0")) {
				double resultado = 0;
				boolean operacaoValida = true;

				switch (opcao) {
					case "-":
						resultado = num1 - num2;
						break;
					case "+":
						resultado = num1 + num2;
						break;
					case "*":
						resultado = num1 * num2;
						break;
					case "/":
						if (num2 != 0) {
							resultado = num1 / num2;
						} else {
							System.out.println("Erro: não é possível dividir por zero!");
							operacaoValida = false;
						}
						break;
					default:
						System.out.println("Erro: Operação inválida!");
						operacaoValida = false;
				}

				// Movido para DENTRO do 'do' para exibir o resultado a cada rodada
				if (operacaoValida) {
					System.out.printf("Resultado: %.0f %s %.0f = %.0f%n", num1, opcao, num2, resultado);
				}
			}

		} while (!opcao.equals("0")); // Repete enquanto não digitar "0"

		System.out.println("Calculadora encerrada.");
		teclado.close();
	}
}
