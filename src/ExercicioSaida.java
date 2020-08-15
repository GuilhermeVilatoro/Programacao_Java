import java.util.Locale;

public class ExercicioSaida {
	public static void main(String[] args) {
		String primeiroProduto = "Computer";
	    String segundoProduto = "Office desk";
	
	    int idade = 30;
	    int codigoUsuario = 5290;
	    char sexo = 'F';
	
	    double precoPrimeiroProduto = 2100.0;
	    double precoSegundoProduto = 650.50;
	    double measure = 53.234567;
	    
	    System.out.println("Products:");
	    System.out.printf("%s, which price is $ %.2f%n", primeiroProduto, precoPrimeiroProduto);
	    System.out.printf("%s, which price is $ %.2f%n", segundoProduto, precoSegundoProduto);
	    System.out.println();
	    System.out.printf("Record: %d years old, code %d and gender: %s%n", idade, codigoUsuario, sexo);
	    System.out.println();
	    System.out.printf("Measue with eight decimal places: %.8f%n", measure);
	    System.out.printf("Rounded (three decimal places): %.3f%n", measure);
	    System.out.printf(Locale.US, "US decimal point: %.3f", measure);	
	}

}
