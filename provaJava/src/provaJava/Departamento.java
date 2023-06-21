package provaJava;

import java.util.List;

public class Departamento {
	private List<Funcionario>funcionarios;
	private String nome;
	
	public Departamento(List<Funcionario> funcionarios, String nome) {
		super();
		this.funcionarios = funcionarios;
		this.nome = nome;
	}
	public Departamento(String nome) {
		super();
		this.nome = nome;
		
	}
	public Departamento() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
