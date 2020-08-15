package entities;

public final class PessoaJuridica extends Pessoa {
	private int quantidadeFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, int quantidadeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	@Override
	public final Double calcularImposto() {

		Double percentual = 0.16;
		if (quantidadeFuncionarios >= 10)
			percentual = 0.14;

		return (getRendaAnual() * percentual);
	}
}