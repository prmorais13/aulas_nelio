package application.programs;

import java.util.ArrayList;
import java.util.List;

import model.aula180.entities.Produto;

public class ProgramAula187 {

	public static void main(String[] args) {
		
		List<Produto> list =  new ArrayList<>();
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		double min = 100.00;
		
		list.forEach(p -> p.setPreco(p.getPreco() * 1.1));
		
		/*list.removeIf(p -> p.getPreco() >= min);
		
		for (Produto produto : list) {
			System.out.println(produto);
		}*/
		
		list.forEach(System.out :: println);

	}

}
