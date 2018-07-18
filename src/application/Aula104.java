package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.aula104.Contribuinte;
import entities.aula104.Fisica;
import entities.aula104.Juridica;

public class Aula104 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> contribuintes = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Dados do contribuinte nº " + i);
			
			System.out.print("Pessoa Física ou Jurírica (f/j)? ");
			char cont = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Nome: ");	
			String nome = sc.nextLine();

			System.out.print("Renda anual: ");	
			Double rendaAnual = sc.nextDouble();
			
			if (cont == 'f') {
				System.out.print("Despesas medicas: ");
				Double despesaSaude = sc.nextDouble();
				
				contribuintes.add(new Fisica(nome, rendaAnual, despesaSaude));
			}
			else if (cont == 'j') {
				System.out.print("Número de funcionários: ");
				int numeroFuncionario = sc.nextInt();
				
				contribuintes.add(new Juridica(nome, rendaAnual, numeroFuncionario));
			}
			
		}
		
		sc.close();
		
		System.out.println();
		System.out.println("IMPOSTO PAGOS: ");
		for (Contribuinte contribuinte : contribuintes) {
			System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", contribuinte.imposto()));
		}
		
		System.out.println();
		System.out.println("IMPOSTO PAGOS: ");
		
		Double total = 0.00;
		
		for (Contribuinte contribuinte : contribuintes) {
			total += contribuinte.imposto();
		}
		System.out.println("Total de impostos: " + String.format("%.2f", total));

	}

}
