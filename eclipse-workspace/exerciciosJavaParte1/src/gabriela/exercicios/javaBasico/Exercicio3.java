package gabriela.exercicios.javaBasico;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o primeiro n�mero:");
		int primeiroNum = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		int segundoNum = scan.nextInt();
		
		int resultado = primeiroNum + segundoNum;
		
		System.out.println("A soma dos 2 numeros digitados �:  "  + resultado);
		

	}

}
