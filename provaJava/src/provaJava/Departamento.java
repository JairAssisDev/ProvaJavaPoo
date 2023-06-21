package provaJava;

import java.util.List;

public class Departamento {
	List<Funcionario>funcionarios;
	private String nome;
	Empresa empresa;
	public Departamento(String nome, Empresa empresa) {
		super();
		this.nome = nome;
		this.empresa = empresa;
	}
	public Departamento() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
