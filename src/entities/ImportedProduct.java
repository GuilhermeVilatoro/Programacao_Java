package entities;

public class ImportedProduct extends ProductHeranca {

	private Double taxaImportacao;

	public ImportedProduct(String nome, Double preco, Double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	@Override
	public String priceTag() {
		return getNome()
		      + " $ " 
		      + String.format("%.2f", totalPrice())
		      + " (Taxa: $ "
		      + String.format("%.2f", taxaImportacao)
		      + ")";
	}

	private Double totalPrice() {
		return getPreco() + taxaImportacao;
	}
}
