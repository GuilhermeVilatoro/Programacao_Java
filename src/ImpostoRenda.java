
public class ImpostoRenda {
	private double valorInicial;
	private double valorFinal;
	private Double percentual;

	public ImpostoRenda(double valorInicial, double valorFinal, Double percentual) {
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
		this.percentual = percentual;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public Double getPercentual() {
		return percentual;
	}

	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}
}
