package entities;

public final class PessoaFisica extends Pessoa {

	private Double gastoSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	@Override
	public final Double calcularImposto() {
		Double rendaAnual = getRendaAnual();
		Double percentual = 0.25;
		if (rendaAnual < 20000.00)
			percentual = 0.15;
		
		return (rendaAnual * percentual) - (gastoSaude * 0.5);		
	}
}