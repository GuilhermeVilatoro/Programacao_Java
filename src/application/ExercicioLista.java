package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExercicioLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidadeEmpresas = 0;
		do {
			System.out.print("How many employees will be registered? ");
			quantidadeEmpresas = sc.nextInt();
			if (quantidadeEmpresas <= 0)
				System.out.println("Foi informada uma quantidade de empresas inválida!");
		} while (quantidadeEmpresas <= 0);
		
		ArrayList<Employee> funcionarios = new ArrayList<>();
		String nomeFuncionario;
		double salario;

		for (int contador = 1; contador <= quantidadeEmpresas; contador++) {
			System.out.println();
			System.out.println("Employee #" + contador + ":");
			System.out.print("Id: ");
			long id = sc.nextLong();
			System.out.print("Name: ");
			sc.nextLine();
			nomeFuncionario = sc.nextLine();
			System.out.print("Salary: ");
			salario = sc.nextDouble();

			if (!funcionarios.stream().anyMatch(f -> f.getId() == id))
				funcionarios.add(new Employee(id, nomeFuncionario, salario));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		long id = sc.nextLong();
		Employee funcionario = funcionarios.stream().filter(f -> f.getId() == id).findFirst().orElse(null);

		if (funcionario == null)
			System.out.println("This id does not exists!");

		if (funcionario != null) {
			System.out.print("Enter de percentage: ");
			funcionario.aumentarSalario(sc.nextDouble());
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee funcionarioSelecionado : funcionarios) {
            System.out.println(funcionarioSelecionado);
		}

		sc.close();

	}

}
