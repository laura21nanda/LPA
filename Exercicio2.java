package lpa;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Informe nota 1: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Informe nota 2: ");
        nota2 = ler.nextDouble();
        
        System.out.println("Informe nota 3: ");
        nota3 = ler.nextDouble();
        
        System.out.println("Informe nota 4: ");
        nota4 = ler.nextDouble();
        
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média é:  " + media);
        
        if (media >= 6 ) {
        	System.out.println("Aprovado");
        }
        
        else if (media <=4) {
        	System.out.println("Reprovado");
        }
        
        else {
        	System.out.println("Recuperação");
        }
        ler.close();	
        }

	}

