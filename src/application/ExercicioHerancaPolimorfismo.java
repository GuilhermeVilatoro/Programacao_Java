package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.ProductHeranca;
import entities.UsedProduct;

public class ExercicioHerancaPolimorfismo {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número de produtos: ");
		int quantidadeProdutos = sc.nextInt();

		ArrayList<ProductHeranca> produtos = new ArrayList<>();
		ProductHeranca produto = null;

		for (int i = 1; i <= quantidadeProdutos; i++) {
			System.out.println("Produto #" + i + " dados:");
			System.out.print("Comum, Usado ou Importado (c/u/i)? ");
			char tipoProduto = sc.next().charAt(0);

			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.print("Preço: ");
			Double preco = sc.nextDouble();

			switch (tipoProduto) {
			case 'c':
				produto = new ProductHeranca(nome, preco);
				break;
			case 'u':
				System.out.print("Data importação: ");
				Date dataFabricacao = sdf.parse(sc.next());
				produto = new UsedProduct(nome, preco, dataFabricacao);
				break;
			case 'i':
				System.out.print("Taxa importação: ");
				Double taxaImportacao = sc.nextDouble();
				produto = new ImportedProduct(nome, preco, taxaImportacao);
				break;
			}

			if (produto != null)
				produtos.add(produto);
		}

		if (!produtos.isEmpty()) {
			System.out.println();
			System.out.println("ETIQUETAS DE PREÇOS:");		
			
			for (ProductHeranca produtoHeranca : produtos) {
               System.out.println(produtoHeranca.priceTag());
			}
		}
		
		sc.close();
	}
}