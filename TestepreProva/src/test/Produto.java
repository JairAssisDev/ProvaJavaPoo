package test;


public abstract class Produto {
	 private String titulo; 
	 private String autor;
	 private double preco;
	 
	 public void exibirDetalhe() {
		 System.out.println(titulo);
		 System.out.println(autor);
		 System.out.println(preco);
	 }
	 public abstract  void calculaDesconto(double descoto);
	 
	public Produto(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	 
	 
}
