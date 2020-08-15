package entities;

public class Funcionario {
	public String Nome;
	public double SalarioLiquido;
	public double Taxa;
	
	public double getSalarioLiquido() {
		return SalarioLiquido - Taxa;
	}
	
	public void aumentarSalario(double porcentagem) {
		SalarioLiquido += SalarioLiquido * (porcentagem / 100.00);		
	}

	@Override
	public String toString() {
		return Nome + ", $ " + String.format("%.2f", getSalarioLiquido());
	}
	
}
