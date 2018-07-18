package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Aula71 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Funcionário #" + i + ": ");
			// sc.nextLine();
			
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			
			// Funcionario funcionario = new Funcionario(id, nome, salario);
			
			lista.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println();
		System.out.print("Entre com o ID do funcionário para o aumento de salário: ");		
		Integer id = sc.nextInt();
		
		Funcionario funcionarioId = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (funcionarioId != null) {			
			System.out.print("Entre com a percentagem de reajuste: ");
			Double p = sc.nextDouble();
			
			// funcionarioId.setSalario(funcionarioId.salarioReajustado(p));
			funcionarioId.salarioReajustado(p);
			
		} else {
			System.out.println("Funcionário com ID: " + id + " não existe");
		}
		
		System.out.println();
		System.out.println("Lista dos funcionários");
		
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}

}
