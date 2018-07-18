package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Aula101 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> produtos = new ArrayList<>();
		
		System.out.print("Informe a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do produto: #" + i);
			System.out.print("O Produto � Comum, Usado ou Importado (c/u/i)? " );
			char resp = sc.next().charAt(0);
			
			System.out.print("Informe o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Informe o pre�o: ");		
			Double preco = sc.nextDouble();		
			
			if (resp == 'c') {
				produtos.add(new Produto(nome, preco));			
				
			} else if (resp == 'u') {			
				System.out.print("Informe a data de Fabrica��o (DD/MM/YYYY): ");
				Date data = sdf.parse(sc.next());
				produtos.add(new ProdutoUsado(nome, preco, data));
				
			} else if (resp == 'i') {
				System.out.print("Informe a taxa de importa��o: ");
				Double taxa = sc.nextDouble();
				produtos.add(new ProdutoImportado(nome, preco, taxa));
			}
		}
		
		System.out.println();
		System.out.println("TAGS PRE�O: ");
		
		for (Produto prod : produtos) {
			
			System.out.println(prod.precoTag());
		}
		
		sc.close();
		
	}

}
