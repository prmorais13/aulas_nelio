package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Aula66 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		Estudante[] estudantes = new Estudante[10];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			System.out.println();
			
			estudantes[quarto] = new Estudante(nome, email, quarto);
		}		
		
		for (int i = 0; i < estudantes.length; i++) {
			
			if (estudantes[i] != null) {
				System.out.println(estudantes[i].toString());	
			}
		}
				
		sc.close();
		
	}

}