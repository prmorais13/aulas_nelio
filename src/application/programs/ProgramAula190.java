package application.programs;

import java.util.ArrayList;
import java.util.List;

import model.aula180.entities.Produto;
import model.aula190.services.ProdutoService;

public class ProgramAula190 {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD Case", 80.90));
		
		ProdutoService produtoService = new ProdutoService();
		
		double soma = produtoService.filtroSoma(lista, p -> p.getPreco() < 100);
		
		System.out.println("Soma: " + String.format("%.2f", soma));
	}
}
