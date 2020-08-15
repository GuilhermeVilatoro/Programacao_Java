package entities;

public class Employee {
	private long id;
	private String nome;
	private double salario;	
	
	public Employee(long id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public long getId() {
		return id;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario += salario * (percentual / 100); 
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}

}
