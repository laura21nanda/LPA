package lpa;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double salario, tempo, bonus;
		 System.out.println("Informe o salário: ");
         salario = ler.nextDouble();
         
         System.out.println("Informe anos de trabalho: ");
         tempo = ler.nextDouble();
         
         if (tempo <= 3 ) {
        	 bonus = (salario*0.05);
        	 System.out.println("O valor do bonus será de: " + bonus);
         }
        	 else {
        		 bonus = (salario*0.07);
        		 System.out.println("O valor do bonus será de: " + bonus);
         }
         ler.close();
	}

}
