package prova2206;

public class Retangulo extends Forma {

	private double comprimento;
	private double largura;
	
	
	public Retangulo(double comprimento, double largura) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
			double x =comprimento* largura;
		return x ;
	}


	public double getComprimento() {
		return comprimento;
	}


	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}


	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}

	
}
