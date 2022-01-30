package gabriela.exercicios.javaBasico;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o valor ganho por hora:");
		double valorHora = scan.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas por mês:");
		double horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		double inss = salarioBruto * 0.08;
		double iR = salarioBruto * 0.11;
		double sindicato = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - inss -iR - sindicato;
		
		System.out.println("Salario Bruto do mês: " + salarioBruto + " " + "Seus descontos são:"
				+ "INSS:" + " " + inss + " " 
				+ "IMPOSTO DE RENDA " + " " + iR + " " 
				+ "SINDICATO " + " " + sindicato + " " 
				+ "Total a receber com descontos: " + " " + salarioLiquido + " " 
				);
		
	}

}
