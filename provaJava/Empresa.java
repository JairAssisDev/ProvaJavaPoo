package provaJava;

import java.util.List;

public class Empresa {
	private List<Departamento>departamentos;
	private String nome;
	private int cnpj;
	
	
	public Empresa(List<Departamento> departamentos, String nome, int cnpj) {
		super();
		this.departamentos = departamentos;
		this.nome = nome;
		this.cnpj = cnpj;
		
	}
	public Empresa() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
}
