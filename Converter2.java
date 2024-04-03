package lpa;

import java.util.Scanner;

public class Converter2 {

	public static void main(String[] args) {
		double a;
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe um valor: ");
         a = ler.nextDouble();
         String mensagem = a % 5 == 0? "O numero "+ a + " é multiplo de 5":"O numero "+ a +" não é multiplo de 5"; 
         System.out.println(mensagem); 
	}

}
