package gabriela.exercicios.javaBasico;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero inteiro:");
		int num1 = scan.nextInt();

		System.out.println("Digite OUTRO numero inteiro:");
		int num2 = scan.nextInt();

		System.out.println("Digite um numero real:");
		float num3 = scan.nextInt();

		int resultadoA = (2 * num1) * (num2 / 2);
		int resultadoB = (3 * num1) + num2;
		float resultadoC = (num3 * num3 * num3);

		System.out.println("Resultado A =" + resultadoA);
		System.out.println("Resultado B =" + resultadoB);
		System.out.println("Resultado C =" + resultadoC);

	}

}
