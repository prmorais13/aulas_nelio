package application.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.aula163.entities.Contrato;
import model.aula163.entities.Parcelamento;
import model.aula163.services.ContratoService;
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
		
		Contrato contrato = new Contrato(numero, data, valor);
		
		System.out.print("Número de prestações: ");
		int numParcelas = sc.nextInt();
		
		ContratoService contratoService = new ContratoService(new PagamentoService());

		contratoService.processarContrato2(contrato, numParcelas);
			
		System.out.println();
		System.out.println("PRESTAÇÕES:");
		
		for (Parcelamento parcelamento : contrato.getParcelamento()) {
			System.out.println(
					sdf.format(parcelamento.getDataVencimento())
					+ " - "
					+ parcelamento.getValor());
		}
	
		/*for (int i = 1; i <= prestacao; i++) {
			System.out.println(
					contrato.getParcelamento().getDataVencimento()
					+ " - "
					+ contrato.getParcelamento().getValor());
		}*/
		
		sc.close();
		
	}

}
