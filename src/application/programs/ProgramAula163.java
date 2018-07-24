package application.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.aula163.services.PagamentoService;

public class ProgramAula163 {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do Contrato:");
		
		System.out.print("Número: ");
		int numero = sc.nextInt();
		
		System.out.print("Data: ");
		Date data = sdf.parse(sc.next());
		
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		
		//Contrato contrato = new Contrato(numero, data, valor);
		
		System.out.print("Número de prestações: ");
		int prestacao = sc.nextInt();
		
		System.out.println(numero + " - " + sdf.format(data) + " - " + String.format("%.2f", valor) + " - " + prestacao);
		
		PagamentoService pagamentoService = new PagamentoService();
		
		
		System.out.println();
		System.out.println("PRESTAÇÕES:");
	
		double valorPrestacao;
		for (int i = 1; i <= prestacao; i++) {
			valorPrestacao = pagamentoService.juroMensal(valor, i);
			System.out.println("Valor Prestacao " + i + ": " + valorPrestacao);
		}
		
		sc.close();
		
	}

}
