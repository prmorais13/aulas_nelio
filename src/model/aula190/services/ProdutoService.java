package model.aula190.services;

import java.util.List;
import java.util.function.Predicate;

import model.aula180.entities.Produto;

public class ProdutoService {
	
	public double filtroSoma(List<Produto>  lista, Predicate<Produto> criterio) {
		
		double soma = 0.0;
		for (Produto produto : lista) {
			if (criterio.test(produto)) {
				soma += produto.getPreco();
			}
		}
		
		return soma;
	}

}
