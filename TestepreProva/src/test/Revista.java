package test;

public class Revista extends Produto {

	public Revista(String titulo, String autor, double preco) {
		super(titulo, autor, preco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculaDesconto(double desconto) {
		// TODO Auto-generated method stub
		setPreco(getPreco()+desconto);
	}

}
