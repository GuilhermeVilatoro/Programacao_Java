package application;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidadeLinhas = sc.nextInt();
		int quantidadeColunas = sc.nextInt();

		int[][] matriz = new int[quantidadeLinhas][quantidadeColunas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		int valorMatriz = sc.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int valorCorrenteMatriz = matriz[i][j];

				if (valorCorrenteMatriz == valorMatriz) {
					System.out.println("Position " + i + "," + j + ":");					
					
					if (i > 0)
						System.out.println("Up: " + matriz[i - 1][j]);

					if (j + 1 < matriz[i].length)
						System.out.println("Right: " + matriz[i][j + 1]);

					if (i + 1 < matriz.length)
						System.out.println("Down: " + matriz[i + 1][j]);

					if (j > 0)
						System.out.println("Left: " + matriz[i][j - 1]);
				}
			}
		}

		sc.close();
	}

}
