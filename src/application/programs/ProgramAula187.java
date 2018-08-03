package application.programs;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;
import java.util.stream.Collectors;

import model.aula180.entities.Produto;

public class ProgramAula187 {

	public static void main(String[] args) {
		
		List<Produto> list =  new ArrayList<>();
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		// double min = 100.00;
		
		/*list.removeIf(p -> p.getPreco() >= min);
		
		for (Produto produto : list) {
			System.out.println(produto);
		}*/
		
/*		double factor = 1.1;
		
		Consumer<Produto> cons = p -> {
			p.setPreco(p.getPreco() * factor);
		};
		
		list.forEach(cons);*/
		
		//list.forEach(p -> p.setPreco(p.getPreco() * 1.1));
		
		List<String> nomes = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		nomes.forEach(System.out :: println);
		
		//list.forEach(System.out :: println);

	}

}
