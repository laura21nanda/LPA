package lpa;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
        String texto;
        
        System.out.println("Informe o dia da semana: ");
        texto = ler.nextLine();
        
        if (texto.equals("domingo")) {
        	System.out.println("Dia 1");
        }
        else if (texto.equals("segunda")) {
        	System.out.println("Dia 2");
        }
        else if (texto.equals("terça")) {
        	System.out.println("Dia 3");
        }
        else if (texto.equals("quarta")) {
        	System.out.println("Dia 4");
        }
        else if (texto.equals("quinta")) {
        	System.out.println("Dia 5");
        }
        else if (texto.equals("sexta")) {
        	System.out.println("Dia 6");
        }
        else if (texto.equals("sabado")) {
        	System.out.println("Dia 7");
        }
        else {
        	System.out.println("Dia invalido");
        }
        ler.close();
	}

}
