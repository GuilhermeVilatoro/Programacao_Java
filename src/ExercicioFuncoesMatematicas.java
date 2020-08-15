
public class ExercicioFuncoesMatematicas {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 2;
		b = 3;
		c = 4;
		d = -5;

		System.out.println("A raiz quadrada de " + a + " = " + Math.sqrt(a));
		System.out.println("A raiz quadrada de " + b + " = " + Math.sqrt(b));
		System.out.println("A raiz quadrada de " + c + " = " + Math.sqrt(c));
		System.out.println("A raiz quadrada de " + Math.abs(d) + " = " + Math.sqrt(Math.abs(d)));

		System.out.println();

		System.out.println(b + " elevado ao " + c + " = " + Math.pow(b, c));
		System.out.println(c + " elevado ao quadrado = " + Math.pow(c, 2));
		System.out.println(d + " elevado ao quadrado = " + Math.pow(d, 2));

		System.out.println();

		System.out.println(Math.abs(d));
	}

}
