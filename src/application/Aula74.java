package application;

import java.util.Scanner;

public class Aula74 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com dois n�meros inteiros: ");
		
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		int[][] mat = new int[linha][coluna];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Entre com o n�mero a ser buscado: ");
		int n = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == n) {
					System.out.println("Posi��o " + i + ", " + j );
				}
			}
		}
		sc.close();

	}

}
