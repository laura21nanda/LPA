package lpa;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
    String texto1,texto2;
    int tamanho;
    char posicao;
   
    Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe texto: ");
		texto1 = ler.nextLine();
		tamanho = texto1.length();
		System.out.println("O tamanho é: " + tamanho);
		
		posicao = texto1.charAt(4);
		System.out.println("A posição é: " + posicao);
		
		System.out.println("Informe o 2 texto: ");
		texto2 = ler.nextLine();
		
        if (texto1.equals(texto2))
        	System.out.println("As textos são iguais");
		
		
	}
}
		
		
		
