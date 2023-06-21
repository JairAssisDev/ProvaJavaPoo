package provaJava;

public abstract class Pessoa {

	private String nome;
	private int idade;
	private String genero;
	public abstract String falar();
	
	public Pessoa(String nome, int idade, String genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String pessoa) {
		this.nome = pessoa;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
