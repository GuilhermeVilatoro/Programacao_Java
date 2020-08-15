package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends ProductHeranca {
	private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy"); 
	
	private Date dataFabricacao;

	public UsedProduct(String nome, Double preco, Date dataFabricacao) {
		super(nome + " (used)", preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	@Override
	public String priceTag() {
		return super.priceTag() 
		       + " (Data Importação: "
		       + SDF.format(dataFabricacao)
		       + ")";
	}
}