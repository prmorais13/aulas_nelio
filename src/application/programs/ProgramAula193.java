package application.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.aula180.entities.Produto;

public class ProgramAula193 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o path do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {			
			
			List<Produto> lista = new ArrayList<>();
			
			String linha = br.readLine();
			
			while(linha != null) {
				String[] campos = linha.split(",");
				String nome = campos[0];
				double preco = Double.parseDouble(campos[1]);
				
				lista.add(new Produto(nome, preco));
				
				linha = br.readLine();
			}
			
			double media = lista.stream()
					.map(p -> p.getPreco())
					.reduce(0.0, (x, y) -> x + y) / lista.size();
			
			System.out.println("Preço médio: " + String.format("%.2f", media));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> nomes = lista.stream()
					.filter(p -> p.getPreco() < media)
					.map(p -> p.getNome())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			nomes.forEach(System.out :: println);

			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();

	}

}
