package provaJava;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario1 = new Funcionario("jair", 22,"homen","DEV" , 3000.0);

		Funcionario funcionario2 = new Funcionario("maria", 21,"mulher","Estagiaria" , 1000.0);

		Funcionario funcionario3 = new Funcionario("mario", 27,"homen","DEV" , 5000.0);

		Funcionario funcionario4 = new Funcionario("claudio", 22,"homen","psicologo" , 3000.0);

		Funcionario funcionario5 = new Funcionario("fernanda", 21,"mulher","Estagiaria" , 1000.0);

		Funcionario funcionario6 = new Funcionario("paulo", 27,"homen","gestão" , 5000.0);

		List<Funcionario>listafuncionarios= new ArrayList<Funcionario>();
		listafuncionarios.add(funcionario1);
		listafuncionarios.add(funcionario2);
		listafuncionarios.add(funcionario3);
		List<Funcionario>listafuncionarios2= new ArrayList<Funcionario>();
		listafuncionarios2.add(funcionario4);
		listafuncionarios2.add(funcionario5);
		listafuncionarios2.add(funcionario6);

		Departamento departamento = new Departamento(listafuncionarios,"TI");

		Departamento departamento2 = new Departamento(listafuncionarios2,"RH");
		

		List<Departamento>departamentos = new ArrayList<Departamento>();
		departamentos.add(departamento);
		departamentos.add(departamento2);

		Empresa empresa = new Empresa(departamentos,"LeoSoft S/A", 2323232);
		

		
		System.out.println("Empresa: "+empresa.getNome());
		System.out.println("Cnpj: "+empresa.getCnpj());
		for (Departamento Listadepartamento : empresa.getDepartamentos()) {
			System.out.println("Nome do Departamento: "+Listadepartamento.getNome());
			System.out.println("---------------------------------");
			for (Funcionario funcionario : Listadepartamento.getFuncionarios()) {
				if (funcionario.getSalario()>= 1500 ) {

					System.out.println(funcionario.getCargo());
					System.out.println(funcionario.getNome());
					System.out.println(funcionario.getIdade());
					System.out.println(funcionario.getGenero());
					System.out.println("---------------------------------");

				}

			}
		}

	}

}