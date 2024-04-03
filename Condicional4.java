package lpa;

import java.util.Scanner;

public class Condicional4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe o numero do mes");
		int mes = ler.nextInt ();
		
		switch (mes) {
		case 1:
			System.out.println("O mes escolhido foi: janeiro");
			break;
		case 2:
			System.out.println("O dia escolhido foi: fevereiro");
			break;
		case 3:
			System.out.println("O dia escolhido foi: março");
			break;
		case 4:
			System.out.println("O dia escolhido foi: abril");
			break;
		case 5:
			System.out.println("O dia escolhido foi: maio");
			break;
		case 6:
			System.out.println("O dia escolhido foi: junho");
			break;
		case 7:
			System.out.println("O dia escolhido foi: julho");
			break;
		case 8:
			System.out.println("O dia escolhido foi: agosto");
			break;
		case 9:
			System.out.println("O dia escolhido foi: setembro");
			break;
		case 10:
			System.out.println("O dia escolhido foi: outubro");
			break;
		case 11:
			System.out.println("O dia escolhido foi: novembro");
			break;
			
		case 12:
			System.out.println("O dia escolhido foi: dezembro");
			break;
			
			default:
			System.out.println("O mes escolhido é invalido!");

	}
	}
}
