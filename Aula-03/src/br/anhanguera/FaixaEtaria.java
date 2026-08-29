package br.anhanguera;

import java.util.Scanner;

public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = 0;
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();

		if(idade < 0) {
			System.out.println("Idade inválida!");
		} else if (idade <= 12) {
			System.out.println("Você é uma criança!");
		} else if (idade <= 17) {
			System.out.println("Você é um adolescente!");
		} else if (idade <= 59) {
			System.out.println("Você é um adulto!");
		} else {
			System.out.println("Você é um idoso!");
		}
	}
}
