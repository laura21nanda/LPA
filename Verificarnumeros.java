package lpa;

import java.util.Scanner;

public class Verificarnumeros {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escolha um número entre 1 a 3");
		int numero = ler.nextInt();
	switch (numero) {
	case 1:
		System.out.println("O numero escolhido foi: 1.");
		break;
	case 2:
		System.out.println("Onúmrto escolhido foi: 2.");
		break;
	case 3:
	System.out.println("O número escolido foi: 3.");
		break;
		
	
	default:
		System.out.println("O número escolhido é invalido!Digite um número entre 1 a 3");
	}
	}	

}
