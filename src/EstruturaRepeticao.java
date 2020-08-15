import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * int diaSemana = sc.nextInt();
		 * 
		 * switch (diaSemana) { case 1: { System.out.println("Domingo"); break; } case
		 * 2: { System.out.println("Segunda"); break; } case 3: {
		 * System.out.println("Terça"); break; } case 4: { System.out.println("Quarta");
		 * break; } case 5: { System.out.println("Quinta"); break; } case 6: {
		 * System.out.println("Sexta"); break; } case 7: { System.out.println("Sabado");
		 * break; } default: throw new
		 * IllegalArgumentException("Dia da semana inválido: " + diaSemana); }
		 */

		/*
		 * int entrada = sc.nextInt(); int soma = 0; while (entrada != 0) { soma +=
		 * entrada; entrada = sc.nextInt(); }
		 * 
		 * System.out.println(soma);
		 */

		/*
		 * int senhaCorreta = 2002; int senhaDigitada = sc.nextInt();
		 * 
		 * while (senhaDigitada != senhaCorreta) { System.out.println("Senha Inválida");
		 * senhaDigitada = sc.nextInt(); }
		 * 
		 * System.out.println("Acesso Permitido");
		 */
		/*
		 * int coordenadaX = sc.nextInt(); int coordenadaY = sc.nextInt();
		 * 
		 * while (coordenadaX != 0 && coordenadaY != 0) { if (coordenadaX > 0 &&
		 * coordenadaY > 0) System.out.println("Primeiro");
		 * 
		 * if (coordenadaX < 0 && coordenadaY > 0) System.out.println("Segundo");
		 * 
		 * if (coordenadaX < 0 && coordenadaY < 0) System.out.println("Terceiro");
		 * 
		 * if (coordenadaX > 0 && coordenadaY < 0) System.out.println("Quarto");
		 * 
		 * coordenadaX = sc.nextInt(); coordenadaY = sc.nextInt(); }
		 */

		/*
		 * int tipoCombustivel = sc.nextInt(); int condicaoParada = 4; int somaAlcool =
		 * 0, somaGasolina = 0, somaDiesel = 0;
		 * 
		 * while (tipoCombustivel != condicaoParada) { switch (tipoCombustivel) { case
		 * 1: somaAlcool++; break; case 2: somaGasolina++; break; case 3: somaDiesel++;
		 * break; default: break; }
		 * 
		 * tipoCombustivel = sc.nextInt(); }
		 * 
		 * System.out.println("MUITO OBRIGADO"); System.out.println("Alcool: " +
		 * somaAlcool); System.out.println("Gasolina: " + somaGasolina);
		 * System.out.println("Diesel: " + somaDiesel);
		 */

		/*
		 * int quantidadeNumerosSoma = sc.nextInt(); int soma = 0; for (int contador =
		 * 0; contador < quantidadeNumerosSoma; contador++) { soma += sc.nextInt(); }
		 * 
		 * System.out.println(soma);
		 */

		/*
		 * int entradaImpar = sc.nextInt();
		 * 
		 * for (int contador = 1; contador <= entradaImpar ; contador++) { if ((contador
		 * % 2) != 0) System.out.println(contador); }
		 */

		/*
		 * int entradaIntervalo = sc.nextInt(); int quantidadeIn = 0, quantidadeOut = 0,
		 * valorIntervalo = 0; int intervaloInicial = 10; int intervaloFinal = 20;
		 * 
		 * for (int contador = 0; contador < entradaIntervalo; contador++) {
		 * valorIntervalo = sc.nextInt(); if (valorIntervalo >= intervaloInicial &&
		 * valorIntervalo <= intervaloFinal) { quantidadeIn++; continue; }
		 * quantidadeOut++; }
		 * 
		 * System.out.println(quantidadeIn + " In"); System.out.println(quantidadeOut +
		 * " Out");
		 */

		/*
		 * int quantidadeMediaPonderada = sc.nextInt(); int peso1 = 2; int peso2 = 3;
		 * int peso3 = 5; int divisor = peso1 + peso2 + peso3;
		 * 
		 * double mediaPonderada, primeiro, segundo, terceiro;
		 * 
		 * for (int contador = 1; contador <= quantidadeMediaPonderada; contador++) {
		 * primeiro = sc.nextDouble(); segundo = sc.nextDouble(); terceiro =
		 * sc.nextDouble();
		 * 
		 * mediaPonderada = ((primeiro * peso1) + (segundo * peso2) + (terceiro *
		 * peso3)) / divisor;
		 * 
		 * System.out.printf("%.1f%n", mediaPonderada); }
		 */

		/*
		 * int quantidadeDivisores = sc.nextInt(); int dividendo, denominador;
		 * 
		 * for (int contador = 0; contador < quantidadeDivisores; contador++) {
		 * dividendo = sc.nextInt(); denominador = sc.nextInt();
		 * 
		 * if (denominador == 0) { System.out.println("Divisão impossível"); continue; }
		 * 
		 * System.out.println((double) dividendo / denominador); }
		 */

		/*
		 * int fatorial = sc.nextInt();
		 * 
		 * for (int contador = fatorial - 1; contador > 0; contador--) { fatorial *=
		 * contador; }
		 * 
		 * System.out.println((fatorial == 0) ? 1 : (fatorial < 0) ? "Inválido!" :
		 * fatorial);
		 */

		/*
		 * int divisor = sc.nextInt();
		 * 
		 * for (int contador = divisor; contador > 0; contador--) { if (divisor %
		 * contador == 0) System.out.println(contador); }
		 */
		
		int quantidadeLinhas = sc.nextInt();
		
		for (int contador = 1; contador <= quantidadeLinhas; contador++) {
			System.out.printf("%d %d %d%n", contador, (int)Math.pow(contador, 2.0), (int)Math.pow(contador, 3.0));
		}

		sc.close();
	}

}
