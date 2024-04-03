package lpa;

import java.util.Scanner;

public class Exemp1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe a idade");
		int idade = ler.nextInt();
		
		String mensagem = idade >= 18 ?"Maior de idade" : "Menor de idade";
        System.out.println(mensagem); // Imprime maior idade 
	}

}
