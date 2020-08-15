package entities;

public class Aluno {
	public String Nome;
	public double PrimeiraNota;
	public double SegundaNota;
	public double TerceiraNota;

	private final double NOTA_APROVACAO = 60.00;

	private double calcularFinalGrade() {
		return (PrimeiraNota + SegundaNota + TerceiraNota);
	}

	private Boolean verificarAprovacao() {
		return (calcularFinalGrade() >= NOTA_APROVACAO) ? true : false;
	}

	private double calcularPontuacaoFaltouParaAprovacao() {
		return NOTA_APROVACAO - calcularFinalGrade();
	}

	@Override
	public String toString() {
		double pontuacaoParaPassar = calcularPontuacaoFaltouParaAprovacao();

		return "FINAL GRADE = " + String.format("%.2f%n", calcularFinalGrade())
				+ (verificarAprovacao() ? "PASS" : "FAILED")
				+ (pontuacaoParaPassar > 0 ? "\nMISSING " + String.format("%.2f", pontuacaoParaPassar) + " POINTS" : "");
	}

}
