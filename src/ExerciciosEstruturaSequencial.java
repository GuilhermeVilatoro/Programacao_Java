import java.util.Locale;
import java.util.Scanner;

public class ExerciciosEstruturaSequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * int x, y, soma; x = sc.nextInt(); y = sc.nextInt(); soma = x + y;
		 * System.out.println("A Soma de " + x + " e " + y + " é " + soma);
		 * 
		 * System.out.println();
		 */

		/*
		 * double raio, areaCirculo, pi; pi = 3.14159; raio = sc.nextDouble();
		 * 
		 * areaCirculo = pi * (Math.pow(raio, 2.0));
		 * System.out.printf("A área do circulo é %.4f%n", areaCirculo);
		 * 
		 * System.out.println();
		 * 
		 */

		/*
		 * int a, b, c, d, diferenca;
		 * 
		 * a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt(); d = sc.nextInt();
		 * 
		 * diferenca = (a * b) - (c * d);
		 * 
		 * System.out.println("DIFERENÇA = " + diferenca);
		 */

		/*
		 * int numeroFuncionario, quantidadeHorasTrabalhadas; double valorHora, salario;
		 * 
		 * numeroFuncionario = sc.nextInt(); quantidadeHorasTrabalhadas = sc.nextInt();
		 * valorHora = sc.nextDouble();
		 * 
		 * salario = (double) valorHora * quantidadeHorasTrabalhadas;
		 * 
		 * System.out.println("NUMBER = " + numeroFuncionario);
		 * System.out.printf("SALARY = U$ %.2f%n", salario);
		 */

		/*
		 * int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2; double
		 * valorPeca1, valorPeca2, totalPagar;
		 * 
		 * codigoPeca1 = sc.nextInt(); quantidadePeca1 = sc.nextInt(); valorPeca1 =
		 * sc.nextDouble(); codigoPeca2 = sc.nextInt(); quantidadePeca2 = sc.nextInt();
		 * valorPeca2 = sc.nextDouble();
		 * 
		 * totalPagar = (double) (valorPeca1 * quantidadePeca1) + (valorPeca2 *
		 * quantidadePeca2);
		 * 
		 * System.out.printf("VALOR A PAGAR: U$ %.2f%n", totalPagar);
		 */
		
		double g, u, i,
		   areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		g = sc.nextDouble();
		u = sc.nextDouble();
		i = sc.nextDouble();
		
		areaTriangulo = (g * i) / 2.0;
		areaCirculo = 3.14159 * (Math.pow(i, 2.0));
		areaTrapezio = ((g + u) * i) / 2.0;
		areaQuadrado = Math.pow(u, 2.0);
		areaRetangulo = g * u;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();

	}

}
