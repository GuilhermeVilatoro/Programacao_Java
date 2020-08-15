package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class ExercicioVetor {

	private static final int QUANTIDADE_QUARTOS = 10;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Quarto[] quartos = new Quarto[QUANTIDADE_QUARTOS];
		String nomeHospede = null;
		String emailHospede = null;
		int numeroQuarto = 0;		
		
		System.out.print("How many rooms will be rented? ");
		int quantidadeReservas = sc.nextInt();
		System.out.println();

		for (int contador = 1; contador <= quantidadeReservas; contador++) {
			sc.nextLine();
            
			System.out.println("Rent #" + contador);
			System.out.print("Name: ");
			nomeHospede = sc.nextLine();

			System.out.print("Email: ");
			emailHospede = sc.nextLine();

			System.out.print("Room: ");
			numeroQuarto = sc.nextInt();
			
			System.out.println();

			Quarto quarto = new Quarto(nomeHospede, emailHospede);
			quartos[numeroQuarto] = quarto;
		}

		for (int contador = 0; contador < quartos.length; contador++) {
			if (quartos[contador] != null)
				System.out.println(contador + ": " + quartos[contador]);
		}

		sc.close();
	}

}
