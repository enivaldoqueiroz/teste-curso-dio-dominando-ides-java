package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a, b;
		
		System.out.println("Informe o numero a: ");
		a = entrada.nextInt();
		System.out.println("Informe o numero b: ");
		b = entrada.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		float divisao = divisao(a, b);
		
		System.out.println("soma "+ soma);
		System.out.println("subtracao "+ subtracao);
		System.out.println("multiplicacao " + multiplicacao);
		System.out.println("divisao " + divisao);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static float divisao(float a, float b) {
		return a / b;
	}
	
}
