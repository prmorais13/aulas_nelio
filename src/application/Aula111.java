package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.models.aula111.Reserva;

public class Aula111 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Número do quarto: ");
		int numQuarto = sc.nextInt();
		
		System.out.print("Data de entrada (DD/MM/YYYY): ");
		Date entrada = sdf.parse(sc.next());
		
		System.out.print("Data de saída (DD/MM/YYYY): ");
		Date saida = sdf.parse(sc.next());
		
		if (!saida.after(entrada)) {
			System.out.println("Erro na reserva: A data de saída deve ser superior a data de entrada.");
		}
		else {
			Reserva reserva = new Reserva(numQuarto, entrada, saida);
			System.out.println("Reserva: " + reserva.toString());
			
			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva: ");
			
			System.out.print("Data de entrada (DD/MM/YYYY): ");
			entrada = sdf.parse(sc.next());
			
			System.out.print("Data de saída (DD/MM/YYYY): ");
			saida = sdf.parse(sc.next());
			
			String error = reserva.atualizaDatas(entrada, saida);
			if (error != null) {
				System.out.println("Erro na reserva: " + error);
			}
			else {
				System.out.print("Reserva: " + reserva.toString());
			}
		}
			
/*			Date agora = new Date();
			if (entrada.before(agora) || saida.before(agora)) {
				System.out.println("Erro na reserva: As datas para atualização devem ser datas futuras.");
			}
			else if (!saida.after(entrada)) {
				System.out.println("Erro na reserva: A data de saída deve ser superior a data de entrada.");
			}
			else {		
				reserva.atualizaDatas(entrada, saida);		
				System.out.print("Reserva: " + reserva.toString());
			}*/
		
		sc.close();
				
	}

}
