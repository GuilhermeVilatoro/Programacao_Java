import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicionais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// int entradaInteiro = sc.nextInt();

		// System.out.println(entradaInteiro < 0 ? "NEGATIVO" : "POSITIVO");

		// int entradaParImpar = sc.nextInt();

		// System.out.println((entradaParImpar % 2 == 0) ? "PAR" : "IMPAR");

		// ArrayList<Integer> multiplos = new ArrayList<Integer>();
		// multiplos.add(sc.nextInt());
		// multiplos.add(sc.nextInt());

		// Collections.sort(multiplos, Collections.reverseOrder());

		// System.out.println((multiplos.get(0) % multiplos.get(1) == 0) ? "Multiplos" :
		// "Não Multiplos");
		/*
		 * int horaInicial = sc.nextInt(); int horaFinal = sc.nextInt();
		 * 
		 * if (horaInicial == horaFinal) System.out.println("O JOGO DUROU 24 HORAS");
		 * 
		 * if (horaInicial > horaFinal) System.out.println("O JOGO DUROU " + ((24 -
		 * horaInicial) + horaFinal) + " HORA(S)");
		 * 
		 * if (horaInicial < horaFinal) { int diferencaHoras = horaFinal - horaInicial;
		 * int duracaoJogo = diferencaHoras > 0 ? diferencaHoras : 24 + diferencaHoras;
		 * 
		 * System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)"); }
		 */
		/*
		 * Produto cachorroQuente = new Produto(); cachorroQuente.setCodigo(1);
		 * cachorroQuente.setEspecificacao("Cachorro Quente");
		 * cachorroQuente.setPreco(4.0);
		 * 
		 * Produto xSalada = new Produto(); xSalada.setCodigo(2);
		 * xSalada.setEspecificacao("X-Salada"); xSalada.setPreco(4.50);
		 * 
		 * Produto xBacon = new Produto(); xBacon.setCodigo(3);
		 * xBacon.setEspecificacao("X-Bacon"); xBacon.setPreco(5.0);
		 * 
		 * Produto torradaSimples = new Produto(); torradaSimples.setCodigo(4);
		 * torradaSimples.setEspecificacao("Torrada simples");
		 * torradaSimples.setPreco(2.0);
		 * 
		 * Produto refrigerante = new Produto(); torradaSimples.setCodigo(5);
		 * torradaSimples.setEspecificacao("Refrigerante");
		 * torradaSimples.setPreco(1.50);
		 * 
		 * ArrayList<Produto> produtos = new ArrayList<Produto>();
		 * produtos.add(cachorroQuente); produtos.add(xSalada); produtos.add(xBacon);
		 * produtos.add(torradaSimples); produtos.add(refrigerante);
		 * 
		 * int codigoProduto = sc.nextInt(); int quantidadeProduto = sc.nextInt();
		 * Boolean existeProduto = false;
		 * 
		 * for (Produto produto : produtos) { if (produto.getCodigo() == codigoProduto)
		 * { System.out.printf("Total: %.2f%n", (produto.getPreco() *
		 * quantidadeProduto)); existeProduto = true; break; } }
		 * 
		 * if (!existeProduto)
		 * System.out.println("O produto com o código informado não existe!");
		 */

		/*
		 * double valorIntervalo = sc.nextDouble();
		 * 
		 * ArrayList<Intervalo> intervalos = new ArrayList<Intervalo>();
		 * intervalos.add(new Intervalo(0, 25)); intervalos.add(new Intervalo(25, 50));
		 * intervalos.add(new Intervalo(50, 75)); intervalos.add(new Intervalo(75,
		 * 100));
		 * 
		 * Boolean isIntervalo = false;
		 * 
		 * for (Intervalo intervalo : intervalos) { int inicioIntervalo =
		 * intervalo.getInicioIntervalo(); int fimIntervalo =
		 * intervalo.getFimIntervalo();
		 * 
		 * if (valorIntervalo >= inicioIntervalo && valorIntervalo <= fimIntervalo) {
		 * System.out.println("Intervalo [" + inicioIntervalo + ", " + fimIntervalo +
		 * "]"); isIntervalo = true; break; } }
		 * 
		 * if (!isIntervalo) System.out.
		 * println("O valor informado não esta em nenhum intervalo!");
		 */

		/*
		 * double x = sc.nextDouble(); double y = sc.nextDouble();
		 * 
		 * if (x == y && x == 0) System.out.println("Origem");
		 * 
		 * if (y == 0 && x != 0) System.out.println("Eixo x");
		 * 
		 * if (x == 0 && y != 0) System.out.println("Eixo y");
		 * 
		 * if (x > 0 && y > 0) System.out.println("Q1");
		 * 
		 * if (x < 0 && y > 0) System.out.println("Q2");
		 * 
		 * if (x < 0 && y < 0) System.out.println("Q3");
		 * 
		 * if (x > 0 && y < 0) System.out.println("Q4");
		 */

		double renda = sc.nextDouble();
		ArrayList<ImpostoRenda> impostos = new ArrayList<ImpostoRenda>();
		impostos.add(new ImpostoRenda(0.00, 2000.00, null));
		impostos.add(new ImpostoRenda(2000.01, 3000.00, 8.00));
		impostos.add(new ImpostoRenda(3000.01, 4500.00, 18.00));
		impostos.add(new ImpostoRenda(4500.01, Double.MAX_VALUE, 28.00));

		double valorImposto = 0.0;

		for (ImpostoRenda impostoRenda : impostos) {
			double valorInicial = impostoRenda.getValorInicial();
			double valorFinal = impostoRenda.getValorFinal();
			Double percentual = impostoRenda.getPercentual();

			if (percentual != null) {
				double maiorValor = 0.0;
				if (renda > valorFinal)
					maiorValor = valorFinal;

				if (renda >= valorInicial && renda <= valorFinal)
					maiorValor = renda;

				if (maiorValor > 0)
					valorImposto += (maiorValor - (valorInicial - 0.01)) * (percentual / 100);
			}
		}

		System.out.printf((valorImposto > 0) ? "R$ %.2f" : "Isento", valorImposto);

		sc.close();
	}
}
