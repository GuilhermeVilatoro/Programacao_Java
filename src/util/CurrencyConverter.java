package util;

public class CurrencyConverter {
    private static final double PORCENTAGEM_IOF = 0.06;
	
	public static double converterDolarEmReais(double valorUnitarioDolar, double valorDolar) {
    	double valorReais = valorUnitarioDolar * valorDolar; 
		return valorReais + (valorReais * PORCENTAGEM_IOF);
    }
}
