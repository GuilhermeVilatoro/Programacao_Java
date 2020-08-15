package entities;

import entities.exceptions.DomainException;

public class ContaBancaria {
	private int numeroConta;
	private String titularConta;
	private double saldoConta;
	private double limiteSaque;
	
	private final double TAXA_SAQUE = 5.00;

	public ContaBancaria(int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}
	
	public ContaBancaria(int numeroConta, String titularConta, double saldoConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		depositar(saldoConta);
	}
	
	public ContaBancaria(int numeroConta, String titularConta, double saldoConta, double limiteSaque) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.limiteSaque = limiteSaque;
		depositar(saldoConta);
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}
	
	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void depositar(double deposito) {
		saldoConta += deposito;
	}

	public void sacar(double saque) {
		if (saque > saldoConta)
			throw new DomainException("Not enough balance");
		
		if (saque > limiteSaque)
			throw new DomainException("The amount exceds withdraw limit");
		
		saldoConta -= saque;
	}

	@Override
	public String toString() {
		return "Account " + numeroConta
				+ ", Holder: " + titularConta
				+ ", Balance: $ " + String.format("%.2f", saldoConta);
	}

}
