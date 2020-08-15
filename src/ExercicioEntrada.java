import java.util.Scanner;

public class ExercicioEntrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Você digitou: " + sc.nextInt()); System.out.println();
		 * 
		 * double entradaDouble; entradaDouble = sc.nextDouble();
		 * 
		 * System.out.printf("Você digitou: %.2f%n", entradaDouble);
		 * 
		 * String entradaString; entradaString = sc.next();
		 * 
		 * System.out.println("\nVocê digitou: " + entradaString);
		 * 
		 * System.out.println("\nVocê digitou: " + sc.next().charAt(0));
		 */

		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);		
		
		sc.close();
	}
}
