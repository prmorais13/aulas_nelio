package application.programs;

import java.util.Locale;
import java.util.Scanner;

import model.aula115.Conta;
import model.exception.ExcecaoDominio;

public class ProgramAula115 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre com os dados da conta:");
			System.out.print("Número: ");
			int numero = sc.nextInt();
			
			System.out.print("Titular: ");
			sc.nextLine();
			String titular = sc.nextLine();
			
			System.out.print("Saldo inicial: ");
			Double saldoInicial = sc.nextDouble();
			
			System.out.print("Limite de saque: ");
			Double limiteSaque = sc.nextDouble();
			
			System.out.println("\nConta: " 
								+ numero
								+ "\nTitular: "
								+ titular
								+ "\nSaldo: "
								+ String.format("%.2f", saldoInicial)
								+ "\nLimite de Saque: "
								+ String.format("%.2f", limiteSaque));
			
			Conta conta = new Conta(numero, titular, saldoInicial, limiteSaque);
			
			System.out.println();
			System.out.print("Entre com o valor do saque: ");
			Double valor = sc.nextDouble();
			
			conta.saque(valor);
			
			System.out.println("Novo saldo: " + String.format("%.2f", conta.getSaldo()));
		
		}
		catch (ExcecaoDominio e) {
			System.out.println("Erro no saque: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Erro inesperado!");
		}
		
		sc.close();
	}

}
