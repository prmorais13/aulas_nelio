package application.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.aula178.entities.EntradaLog;

public class ProgramAula178 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Set<EntradaLog> set = new HashSet<>();
			String linha = br.readLine();
			
			while (linha != null) {
				String[] campos = linha.split(" ");
				String nome = campos[0];
				Date data = Date.from(Instant.parse(campos[1]));
				
				set.add(new EntradaLog(nome, data));
				
				linha = br.readLine();
			}
			
			System.out.println("Total de nomes: " + set.size());
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
