package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.ProductHeranca;
import entities.UsedProduct;

public class ExercicioAbstract {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número de fornecedores: ");
		int quantidadeFornecedores = sc.nextInt();

		ArrayList<Pessoa> pessoas = new ArrayList<>();

		for (int i = 1; i <= quantidadeFornecedores; i++) {
			System.out.println("Fornecedor #" + i + " dados:");
			System.out.print("Física, Jurídica (F/J)? ");
			char tipoPessoa = sc.next().charAt(0);

			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();

			switch (tipoPessoa) {
			case 'F':
				System.out.print("Gasto saúde: ");
				Double gastoSaude = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
				break;
			case 'J':
				System.out.print("Quantidade funcionários: ");
				int quantidadeFuncionarios = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, rendaAnual, quantidadeFuncionarios));
				break;
			}
		}

		if (!pessoas.isEmpty()) {
			System.out.println();
			System.out.println("TAXAS PAGAS:");

			Double somaImpostos = 0.0;

			for (Pessoa pessoa : pessoas) {
				Double imposto = pessoa.calcularImposto();
				System.out.println(pessoa.getNome() + " $ " + String.format("%.2f", imposto));
				somaImpostos += imposto;
			}
			System.out.println();
			System.out.printf("Total: %.2f", somaImpostos);
		}

		sc.close();
	}
}
