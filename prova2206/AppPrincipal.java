package prova2206;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Forma>formas1=new ArrayList<Forma>();
		

		List<Desenho>listaDesenhos =new ArrayList<Desenho>();
		
		Forma forma1 = new Triangulo(5, 3);
		Forma forma2 = new Retangulo(4, 2);
		
		formas1.add(forma1);
		formas1.add(forma2);
		Desenho desenho1 = new Desenho(formas1);
		
		Forma forma3 = new Triangulo(5, 3);
		Forma forma4 = new Quadrado(4);
		
		formas1.add(forma3);
		formas1.add(forma4);
		
		Desenho desenho2 = new Desenho(formas1);
		
		listaDesenhos.add(desenho1);
		listaDesenhos.add(desenho2);
		
		for (Desenho desenho : listaDesenhos) {
			System.out.println(desenho.calcularAreaTotal());
		
			for (Forma forma:desenho.getFormas()) {
				
				if(forma instanceof Triangulo) {
					System.out.println("area Tringulo "+forma.calcularArea());
				lkkkk
					System.out.println("-------------------------------");
					
				}
				
			}
		}
		
		
	}

}
