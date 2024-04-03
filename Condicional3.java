package lpa;

import java.util.Scanner;

public class Condicional3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe o dia da domingo a segunda");
		String dia = ler.next ();
		
		switch (dia) {
		case "domingo":
			System.out.println("O dia escolhido foi: 1");
			break;
		case "segunda":
			System.out.println("O dia escolhido foi: 2");
			break;
		case "terça":
			System.out.println("O dia escolhido foi: 3");
			break;
		case "quarta":
			System.out.println("O dia escolhido foi: 4");
			break;
		case "quinta":
			System.out.println("O dia escolhido foi: 5");
			break;
		case "sexta":
			System.out.println("O dia escolhido foi: 6");
			break;
		case "sabado":
			System.out.println("O dia escolhido foi: 7");
			break;
			
			default:
			System.out.println("O dia escolhido é invalido!");

	}
	}
}
