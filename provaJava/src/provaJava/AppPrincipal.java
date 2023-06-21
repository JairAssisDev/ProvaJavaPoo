package provaJava;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Funcionario>funcionarios= new ArrayList<Funcionario>();
		
		Empresa empresa = new Empresa("LeoSoft S/A", 2323232);
		
		Departamento departamento = new Departamento("TI", empresa);
		
		Funcionario funcionario1 = new Funcionario("jair", 22,"homen","DEV" , 3000.0, departamento);
		
		Funcionario funcionario2 = new Funcionario("maria", 21,"homen","Estagiaria" , 3000.0, departamento);
		
		Funcionario funcionario3 = new Funcionario("mario", 27,"homen","DEV" , 3000.0, departamento);
		
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		
	 for (Funcionario funcionario : funcionarios) {
		 System.out.println(funcionario.getCargo());
		 System.out.println(funcionario.getNome());
		 System.out.println(funcionario.getIdade());
		 System.out.println(funcionario.getGenero());
		 System.out.println(funcionario.departamento.getNome());
		 System.out.println(funcionario.departamento.empresa.getNome());
		 System.out.println(funcionario.departamento.empresa.getCnpj());
		 System.out.println("-------------");
	}
	}

}
