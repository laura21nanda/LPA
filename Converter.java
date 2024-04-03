package lpa;

import java.util.Scanner;

public class Converter{ 
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

	double nota1, nota2,nota3, nota4, media;

	System.out.println("informe a nota1: ");
	nota1= ler.nextDouble();

	System.out.println("informe a nota2: ");
	nota2= ler.nextDouble();

	System.out.println("informe a nota3: ");
	nota3= ler.nextDouble();

	System.out.println("informe a nota4: ");
	nota4= ler.nextDouble();
	
	media = (nota1+nota2+nota3+nota4)/4;

	System.out.println("a media é: " + media);

	String mensagem = media >= 6 ?"Aprovado":"Reprovado";
	System.out.println(mensagem); //Imprime "aprovado"


	}
}


