package entities;

public class Retangulo {
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
	
	public double calcularPerimetro() {
		return 2.0 * (largura + altura);
	}
	
	public double calcularDiagonal() {
		return Math.sqrt(Math.pow(largura, 2.0) + Math.pow(altura, 2.0));
	}

	
}
