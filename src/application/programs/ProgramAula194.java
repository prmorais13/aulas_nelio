package application.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Funcionario;

public class ProgramAula194 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o path do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Funcionario> lista = new ArrayList<>();
			
			String linha = br.readLine();
			
			while (linha != null) {
				String[] campos = linha.split(",");
				
				Funcionario funcionario = new Funcionario(campos[0], campos[1], Double.parseDouble(campos[2]));		
				lista.add(funcionario);
				
				linha = br.readLine();
			}
			
			System.out.print("Entre com o salário: ");
			double salarioTeto = sc.nextDouble();
			
			List<String> nomes = lista.stream()
					.filter(f -> f.getSalario() > salarioTeto)
					.map(f -> f.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email de funcionário com salário maior que " + String.format("%.2f", salarioTeto) + ":");
			nomes.forEach(System.out :: println);
			
			double soma = lista.stream()
					.filter(f -> f.getNome().charAt(0) == 'M')
					.map(f -> f.getSalario())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Soma do salário dos funcionários com nome començando com 'M': " + String.format("%.2f", soma));
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
			
		sc.close();
	}

}
