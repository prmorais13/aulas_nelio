package application.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramAula181 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o path do arquivo: ");
		String path = sc.nextLine();
		Map<String, Integer> candidatos = new LinkedHashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			
			while (linha != null) {
				String[] campos = linha.split(",");
				
				String nome = campos[0];
				int votacao = Integer.parseInt(campos[1]);
				
				if (candidatos.containsKey(nome)) {
					int votos = candidatos.get(nome);
					candidatos.put(nome, votacao + votos);
				} else {
					candidatos.put(nome, votacao);
				}				
				
				linha = br.readLine();
			}
			
			for (String key : candidatos.keySet()) {
				System.out.println(key + ": " + candidatos.get(key));
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
	}

}
