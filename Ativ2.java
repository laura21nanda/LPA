package lpa;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String L, S;
		String login, senha;
		
		System.out.println("Cadastre o usuário: ");
		login = ler.next();
	
		System.out.println("Crie uma senha: ");
		senha = ler.next();
		
		System.out.println("Cadastro realizado com sucesso!");
		
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
