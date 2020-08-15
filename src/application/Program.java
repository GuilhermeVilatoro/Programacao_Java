package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;
import entities.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Informe os lados do triângulo X: "); Triangle triangleX =
		 * new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		 * 
		 * System.out.println("Informe os lados do triângulo Y: "); Triangle triangleY =
		 * new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		 * 
		 * double areaX = triangleX.calcularArea(); double areaY =
		 * triangleY.calcularArea();
		 * 
		 * System.out.printf("Area do triângulo X: %.4f%n", areaX);
		 * System.out.printf("Area do triângulo Y: %.4f%n", areaY);
		 * 
		 * System.out.printf("O triângulo %s tem a maior area!", (areaX > areaY) ? "X" :
		 * "Y");
		 */

		/*
		 * Products produto = new Products();
		 * 
		 * System.out.println("Informe o produto: "); System.out.printf("Name: ");
		 * produto.Name = sc.nextLine(); System.out.printf("Price: "); produto.Price =
		 * sc.nextDouble(); System.out.printf("Quantity in stock: "); produto.Quantity =
		 * sc.nextInt();
		 * 
		 * System.out.printf("%nProduto: %s%n%n", produto.toString());
		 * 
		 * System.out.
		 * print("Informe a quantidade de produtos para adicionar no estoque: ");
		 * 
		 * produto.addProducts(sc.nextInt());
		 * 
		 * System.out.printf("%nDados do produto atualizado: %s%n%n",
		 * produto.toString());
		 * 
		 * System.out.print("Informe a quantidade de produtos para remover do estoque: "
		 * );
		 * 
		 * produto.removeProducts(sc.nextInt());
		 * 
		 * System.out.printf("%nDados do produto atualizado: %s%n", produto.toString());
		 */

		/*
		 * System.out.println("Enter rectangle width and height:"); Retangulo retangulo
		 * = new Retangulo(sc.nextDouble(), sc.nextDouble());
		 * 
		 * System.out.printf("AREA = %.2f%n", retangulo.calcularArea());
		 * System.out.printf("PERIMETER = %.2f%n", retangulo.calcularPerimetro());
		 * System.out.printf("DIAGONAL = %.2f%n", retangulo.calcularDiagonal());
		 */

		/*
		 * Funcionario funcionario = new Funcionario();
		 * 
		 * System.out.print("Nome: "); funcionario.Nome = sc.nextLine();
		 * System.out.print("Salário bruto: "); funcionario.SalarioLiquido =
		 * sc.nextDouble(); System.out.print("Desconto: "); funcionario.Taxa =
		 * sc.nextDouble();
		 * 
		 * System.out.println(); System.out.println("Funcionário: " +
		 * funcionario.toString());
		 * 
		 * System.out.printf("%nInforme o percentual de aumento: ");
		 * funcionario.aumentarSalario(sc.nextDouble());
		 * 
		 * System.out.printf("%nFuncionário alterado: " + funcionario.toString());
		 */

		/*
		 * Aluno aluno = new Aluno(); aluno.Nome = sc.nextLine(); aluno.PrimeiraNota =
		 * sc.nextDouble(); aluno.SegundaNota = sc.nextDouble(); aluno.TerceiraNota =
		 * sc.nextDouble();
		 * 
		 * System.out.println(aluno.toString());
		 */

		/*
		 * System.out.print("What is the dollar price? "); double valorUnitarioDollar =
		 * sc.nextDouble(); System.out.printf("%nHow many dolllars will be bought? ");
		 * double totalDollar = sc.nextDouble();
		 * System.out.printf("%nAmount to be paid in reais = %.2f",
		 * CurrencyConverter.converterDolarEmReais(valorUnitarioDollar, totalDollar));
		 */
		try {
			System.out.print("Enter account number: ");
			int numeroConta = sc.nextInt();

			System.out.print("Enter account holder: ");
			sc.nextLine();
			String titularConta = sc.nextLine();

			// System.out.print("Is there an initial deposit (y/n)? ");

			// char isDepositoInicial = sc.next().charAt(0);

			// ContaBancaria contaBancaria = new ContaBancaria(numeroConta, titularConta);

			// if (isDepositoInicial == 'y') {
			System.out.print("Enter initial balance: ");
			double saldoConta = sc.nextDouble();

			System.out.print("Enter withdraw limite: ");
			double limiteSaque = sc.nextDouble();

			ContaBancaria contaBancaria = new ContaBancaria(numeroConta, titularConta, saldoConta, limiteSaque);
			// }

			System.out.printf("%nAccount data:%n");
			System.out.println(contaBancaria);

			/*
			 * System.out.printf("%nEnter a deposit value: ");
			 * contaBancaria.depositar(sc.nextDouble());
			 * 
			 * System.out.print("Updated account data:"); System.out.printf("%n" +
			 * contaBancaria + "%n");
			 */

			System.out.printf("%nEnter a withdraw value: ");
			contaBancaria.sacar(sc.nextDouble());

			System.out.println("Updated account data:");
			System.out.print(contaBancaria);
		} catch (DomainException ex) {
			System.out.println("Withdraw error: " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("Erro de execução!");
		}
		// int quantidadeAlturas = sc.nextInt();

		/*
		 * double[] alturas = new double[quantidadeAlturas]; double somaAlturas = 0.0;
		 * for (int contador = 0; contador < quantidadeAlturas; contador++) {
		 * alturas[contador] = sc.nextDouble(); somaAlturas += alturas[contador]; }
		 */

		/*
		 * Products[] produtos = new Products[quantidadeAlturas]; double
		 * somaPrecosProdutos = 0.0; for (int contador = 0; contador <
		 * quantidadeAlturas; contador++) { Products produto = new Products();
		 * sc.nextLine(); produto.Name = sc.nextLine(); produto.Price = sc.nextDouble();
		 * produtos[contador] = produto;
		 * 
		 * somaPrecosProdutos += produtos[contador].Price; }
		 * 
		 * System.out.printf("Média dos preços dos produtos: %.2f", somaPrecosProdutos /
		 * produtos.length);
		 */

		sc.close();
	}

}
