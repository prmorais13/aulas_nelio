package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.aula111.Reserva;
import model.exception.ExcecaoDominio;

public class Aula111 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do quarto: ");
			int numQuarto = sc.nextInt();
			
			System.out.print("Data de entrada (DD/MM/YYYY): ");
			Date entrada = sdf.parse(sc.next());
			
			System.out.print("Data de saída (DD/MM/YYYY): ");
			Date saida = sdf.parse(sc.next());
			
			Reserva reserva = new Reserva(numQuarto, entrada, saida);
			System.out.println("Reserva: " + reserva.toString());
			
			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva: ");
			
			System.out.print("Data de entrada (DD/MM/YYYY): ");
			entrada = sdf.parse(sc.next());
			
			System.out.print("Data de saída (DD/MM/YYYY): ");
			saida = sdf.parse(sc.next());
			
			reserva.atualizaDatas(entrada, saida);
			System.out.print("Reserva: " + reserva.toString());
		}
		catch (ParseException e) {
			System.out.println("Formato de data inválido!");
		}
		catch (ExcecaoDominio e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado! ");
		}
		
		sc.close();
				
	}

}
