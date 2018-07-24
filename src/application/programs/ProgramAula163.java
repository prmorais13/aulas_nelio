package application.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.aula163.entities.Contrato;

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
		int prestacao = sc.nextInt();
		
		System.out.println();
		System.out.println("PRESTAÇÕES:");
	
		
		sc.close();
		
	}

}
