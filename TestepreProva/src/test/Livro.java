package test;

public class Livro extends Produto {

	public Livro(String titulo, String autor, double preco) {
		super(titulo, autor, preco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculaDesconto(double desconto) {
		// TODO Auto-generated method stub
		setPreco(getPreco()+desconto);
	}

}
