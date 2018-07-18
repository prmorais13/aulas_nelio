package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.StatusPedido;

public class Aula92 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do cliente");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Data Nascimento (DD/MM/YYYY): ");
		String dataNascimento = sc.nextLine();
		
		Cliente cliente = new Cliente(nome, email, sdf.parse(dataNascimento));
		
		System.out.println();
		System.out.println("Informe os dados do pedido");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("Quantos itens terá o pedido? ");
		int n = sc.nextInt();
		
		Produto produto;
		ItemPedido itemPedido;
		Pedido pedido = new Pedido(new Date(), StatusPedido.valueOf(status));
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do item #" + i);
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			Double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			produto = new Produto(nomeProduto, precoProduto);
			itemPedido = new ItemPedido(quantidade, precoProduto, produto);
			itemPedido.subTotal();
			pedido.adicionarItem(itemPedido);
		}
		
		System.out.println();
		System.out.println("RESUMO DO PEDIDO");
		System.out.println("Data do Pedido: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(pedido.getDataPedido()));
		System.out.println("Status do Pedido: " + pedido.getStatus());
		System.out.println("Nome do Cliente: " + cliente.getNome()
							+ " (" + sdf.format(cliente.getDataNascimento()) + ") - "
							+ cliente.getEmail());
		
		System.out.println("Itens do pedido:");	
		
		for (ItemPedido item : pedido.getItens()) {
			System.out.print(item.toString() + "\n");
		}
		
		System.out.print("Preço total: " + String.format("%.2f", pedido.total()));
		sc.close();
	}

}
