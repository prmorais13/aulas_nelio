package application.programs;

import java.util.HashMap;
import java.util.Map;
//import java.util.TreeMap;

import entities.Produto;

public class ProgramAula180 {

	public static void main(String[] args) {
		
		Map<Produto, Double> estoque = new HashMap<>();
		
		Produto p1 = new Produto("TV", 900.0);
		Produto p2 = new Produto("Notebook", 1200.0);
		Produto p3 = new Produto("Tablet", 400.0);
		
		estoque.put(p1, 10000.0);
		estoque.put(p2, 20000.0);
		estoque.put(p3, 15000.0);
		
		Produto ps = new Produto("TV", 900.00);
		
		System.out.println("Contém 'ps' chave: " + estoque.containsKey(ps));
		
		/*Map<String, String> cookies = new TreeMap<>();
		cookies.put("nome", "Fernanda");
		cookies.put("email", "nanda@hotmail.com");
		cookies.put("telefone", "98804-0404");
		
		cookies.remove("email");
		cookies.put("telefone", "98736-1339");
		
		System.out.println("TODOS OS COOKIES");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}*/

	}

}
