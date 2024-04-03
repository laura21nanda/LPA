package lpa;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String L, S;
		String login = "laurafernanda";
		String senha = "2112";
		
		
		System.out.println("Informe o login");
		L= ler.next();
		
		System.out.println("Informe a senha");
		S = ler.next();
		
		if (L.equals(login)&& S.equals(senha)) {
			System.out.println("Bem vindo ao Sistema SENAI");
		}
		
		else {
		System.out.println("Dados incorretos, informe os dados novamente.");
		}
        ler.close();
	}

}
