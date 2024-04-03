package lpa;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		 
		int dia;
		
		System.out.println("Informe o dia: ");
		dia = ler.nextInt();
		
		if (dia == 1) {
			System.out.println("Domingo");
		}
		else if (dia == 2) {
			System.out.println("Segunda-Feira");
		}
		else if (dia == 3) {
				System.out.println("Terça-Feira");
		}
		else if (dia == 4) {
			System.out.println("Quarta-Feira");
		}
		else if (dia == 5) {
			System.out.println("Quinta-Feira");
		}
		else if (dia == 6) {
			System.out.println("Sexta-Feira");
		}
		else if (dia == 7) {
			System.out.println("Sábado");
		}
		else {
			System.out.println("Dia inválido");
		}
		ler.close();
	    }

}
