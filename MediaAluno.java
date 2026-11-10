//PROGRAMA PARA CALCULAR A MÉDIA DE UM ALUNO

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Media {

	String nome;
	double nota1, nota2, nota3, nota4;
	double media;

	Media(String nome, double n1, double n2, double n3, double n4) {
		this.nome = nome;
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
		this.nota4 = n4;
	}

	public double infoNota() {
		return this.media = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
	}

	public void infoAluno() {
		System.out.println("Informações sobre a Média do Aluno:\n");
		System.out.printf("Nome do aluno: %s%n", this.nome);

		if (media >= 7) {
			System.out.printf("Prezado(a) %s, sua média foi %.2f. Parabéns, você está APROVADO(A)%n%n", this.nome, this.media);
		} else if (media >= 4) {
			System.out.printf("Prezado(a) %s, sua média foi %.2f. Você está em RECUPERAÇÃO%n%n", this.nome, this.media);
		} else {
			System.out.printf("Prezado(a) %s, sua média foi %.2f. Infelizmente, você está REPROVADO(A)%n%n", this.nome, this.media);
		}

		System.out.println("Fim do programa!");
	}
}

// Classe Principal (Método main)
public class MediaAluno {
	public static void main(String[] args) {

		List<Double> notas = new ArrayList<>();
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Digite o nome do(a) Aluno(a): ");
		String aluno = entradaValor.nextLine();

		for (int nt = 0; nt < 4; nt++) {
			System.out.printf("Digite a %dª nota: %n", nt + 1);
			double nota = entradaValor.nextDouble();
			notas.add(nota);
		}

		Media mediaAluno = new Media(aluno, notas.get(0), notas.get(1), notas.get(2), notas.get(3));
		
		mediaAluno.infoNota();
		mediaAluno.infoAluno();

		entradaValor.close();
	}

}