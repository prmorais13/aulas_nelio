package application.programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramAula179 {

	public static void main(String[] args) {

		/*
		 MINHA IMPLEMENTAÇÃO
		 Scanner sc = new Scanner(System.in);
		  
		 Set<Integer> set = new HashSet<>();
		 int codigo = 0;
		  
		 System.out.print("Informe a quantidade de estudantes do curso A: ");
		 int na = sc.nextInt();
		 
		 for (int i = 0; i < na; i++) {
		 	codigo = sc.nextInt();
		 	set.add(codigo); 
		 }
		 
		 System.out.print("Informe a quantidade de estudantes do curso B: ");
		 int nb = sc.nextInt();
		 
		 for (int i = 0; i < nb; i++) {
		 	codigo = sc.nextInt();
		 	set.add(codigo);
		 }
		 
		 System.out.print("Informe a quantidade de estudantes do curso C: ");
		 int nc = sc.nextInt();
		  
		 for (int i = 0; i < nc; i++) {
		 	codigo = sc.nextInt();
		 	set.add(codigo);
		 }
		 System.out.println("Total de estudantes: " + set.size());
		 */
		
		// IMPLEMENTAÇÃO DO PROFESSOR
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			b.add(number);
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			c.add(number);
		}

		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total de estudantes: " + total.size());
		sc.close();
	}

}
