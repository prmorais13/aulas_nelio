package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Aula57 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Caixa 24 horas");
		System.out.println();
		
		System.out.print("Entre com o número da conta: ");
		int conta = sc.nextInt();
		
		System.out.print("Entre com o nome do titular: ");
		String titular = sc.next();
		
		System.out.print("Depositar um valor inicial (s/n)? ");
		String opcao = sc.next();
		
		Conta contaAberta = new Conta(conta, titular);	
				
		if (opcao.equals("s")) {
			System.out.print("Digite o valor do depósito inicial: ");
			double valor = sc.nextDouble();
			contaAberta.depositar(valor);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: " + contaAberta);
		System.out.println();
		
		System.out.print("Entre com o valor para depósito: ");
		double valor = sc.nextDouble();
		contaAberta.depositar(valor);
		System.out.println();
		System.out.println("Novo saldo após depósito: " + contaAberta);
		System.out.println();
		
		System.out.print("Entre com o valor para saque: ");
		valor = sc.nextDouble();
		contaAberta.sacar(valor);
		System.out.println();
		System.out.println("Novo saldo após o saque: " + contaAberta);
		System.out.println();	
		
		sc.close();
	}

}
