package lpa;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String turno;

		System.out.println("Digite o turno: ");
		turno = ler.next();

		if (turno.equals("m")) {
			System.out.print("Bom dia");
		}
		else if (turno.equals("v")) {
			System.out.print("Boa Tarde");
		}
		else if (turno.equals("n")) {
			System.out.print("Boa Noite");
		}
		else {
			System.out.print("Valor inválido");
		}
		ler.close();
	}

}
