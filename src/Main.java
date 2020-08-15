import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 36;		
		double x = 10.35456;
		
		System.out.println(y);
		System.out.println(x);		
		
		//System.out.printf("%.2f%n", x);
		
		//System.out.printf("%.4f\n", x);
		
	//	System.out.printf(Locale.US, "%.2f\n", x);
		
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		
		System.out.println("RESULTADO = " + x + " METROS");
		//System.out.printf("Resultado = %.2f metros%n", x, x);
		
		int idade = 30;
		double salario = 4000.0;
		String nome = "João";
		
		//System.out.printf("%s tem %d anos e ganha R$%.2f%n", nome, idade, salario);	
	}
}