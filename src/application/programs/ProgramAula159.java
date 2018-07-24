package application.programs;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.aula159.entities.AluguelCarro;
import model.aula159.entities.Veiculo;
import model.aula159.services.AluguelService;
import model.aula159.services.TaxaBrasilService;

public class ProgramAula159 {
	
	public static void main(String[] args) throws ParseException {	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Entre com os dados da Locação:");
		System.out.print("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		
		System.out.print("Data início (DD/MM/YYYY): ");
		Date inicio = sdf.parse(sc.nextLine());
		
		System.out.print("Data início (DD/MM/YYYY): ");
		Date retorno = sdf.parse(sc.nextLine());
		
		AluguelCarro aluguelCarro = new AluguelCarro(inicio, retorno, new Veiculo(modeloCarro));
		
		System.out.print("Entre com o preço por hora: ");
		double precoHora = sc.nextDouble();
		
		System.out.print("Entre com o preço por dia: ");
		double precoDia = sc.nextDouble();
		
		AluguelService aluguelService = new AluguelService(precoDia, precoHora, new TaxaBrasilService());
		
		aluguelService.ProcessarFatura(aluguelCarro);
		
		System.out.println();
		System.out.println("FATURA:");
		
		System.out.println("Pagamento básico: " + String.format("%.2f", aluguelCarro.getFatura().getPagamentoBasico()));
		System.out.println("Taxa: " + String.format("%.2f", aluguelCarro.getFatura().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f", aluguelCarro.getFatura().getTotalPagamento()));
		
		sc.close();
		
	}

}
