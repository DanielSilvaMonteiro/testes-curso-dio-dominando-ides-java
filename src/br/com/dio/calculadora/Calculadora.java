package br.com.dio.calculadora;
import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//declaração de variaveis
		int a,b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		//ctrl + 1 para criar variavel ou ctrl +2, L
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("soma: " + soma);
		System.out.println("subtracao: " + subtracao);
		System.out.println("multiplicacao: " + multiplicacao);
		System.out.println("divisao: " + divisao);
		
		scan.close();			//fecha o Scanner
	}
	//criacao de metodos
	
	//ctrl+Alt +seta p/ cima ou baixo vc copia o código
	
	public static int soma (int a, int b) {
		return a+b;
	}
	public static int subtracao (int a, int b) {
		return a-b;
	}
	public static double divisao (double a, double b) {
		return a/b;
	}
	public static int multiplicacao (int a, int b) {
		return a*b;
	}
	}

//}
