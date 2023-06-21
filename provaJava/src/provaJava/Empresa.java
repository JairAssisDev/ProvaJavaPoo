package provaJava;

public class Empresa {
	private String nome;
	private int cnpj;
	
	public Empresa(String nome, int cnpj) {
		super();
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
	
}
