package gabriela.exercicios.javaBasico;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o valor ganho por hora:");
		double valorHora = scan.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas por m�s:");
		double horasTrabalhadas = scan.nextInt();
		
		double resultado = valorHora * horasTrabalhadas;
		
		System.out.println("Vc receber� ao final do m�s: " + resultado);
		
	}

}
