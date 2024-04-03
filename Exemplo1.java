package lpa;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
     int numero;
     
     System.out.print("Informe o numero: ");
     numero = ler.nextInt();
     
     if (numero > 10){
     System.out.println("O numero maior ue 10");
	}
    ler.close();
	
   }
  }
