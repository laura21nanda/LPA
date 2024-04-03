package lpa;
 
import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	System.out.println("Informe o dia da semana de 1 a 7");
	int dia = ler.nextInt ();
	
	switch (dia) {
	case 1:
		System.out.println("O dia escolhido foi: Domingo");
		break;
	case 2:
		System.out.println("O dia escolhido foi: Segunda");
		break;
	case 3:
		System.out.println("O dia escolhido foi: Terça");
		break;
	case 4:
		System.out.println("O dia escolhido foi: Quarta");
		break;
	case 5:
		System.out.println("O dia escolhido foi: Quinta");
		break;
	case 6:
		System.out.println("O dia escolhido foi: Sexta");
		break;
	case 7:
		System.out.println("O dia escolhido foi: Sabado");
		break;
		 
	default:
		System.out.println("O dia escolhido é invalido!");
	}
	
 }
}