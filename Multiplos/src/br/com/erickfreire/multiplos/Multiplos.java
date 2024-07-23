package br.com.erickfreire.multiplos;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que verifica se o primeiro valor é multiplo do segundo: ");
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		if(numero1 % numero2 == 0)
			System.out.printf("%nO número é multiplo!");
		
		if(numero1 % numero2 > 0)
			System.out.printf("%nO número não é Multiplo");

	}

}
