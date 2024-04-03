package lpa;

import java.util.Scanner;

public class Ativ4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;

		System.out.print("Informe o primeiro numero : ");
		n1 = ler.nextInt();
		
		System.out.print("Informe o segundo numero : ");
		n2 = ler.nextInt();
		
		System.out.print("Informe o terceiro numero : ");
		n3 = ler.nextInt();

		if (n1 >n2 && n1 > n3 ) {
			System.out.println("O primeiro número é o maior");
		}

		else if (n2 > n3) {
			System.out.println("O Segundo numero é o maior");
		}
		else if (n1==n2 && n1==n3) {
			System.out.println("Os números são iguais");
		}
		else if (n1 <n2 && n1<n3 ) {
			System.out.println("O primeiro número é o menor");
		}
		else if (n2 < n3) {
			System.out.println("O Segundo numero é o menor");
		}
		else if (n3<n1 && n3<n2) {
			System.out.println("O terceiro numero é o menor");
		}
		else {
			System.out.println("O terceiro é o maior");
		}
		
		ler.close();

	}

}
