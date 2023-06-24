package test;

import java.util.List;

public class Client {
	private String nome;
	private List<Produto>produtos;
	public Client(String nome, List<Produto> produtos) {
		super();
		this.nome = nome;
		this.produtos = produtos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String  falar(){
		System.out.println("oi galera");
	}
	
	
}
