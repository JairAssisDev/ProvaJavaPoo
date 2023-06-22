package test;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Produto>produtos = new ArrayList<Produto>();
		
		Produto ebook = new Ebook("eseasea", "dsdasd", 3233);
		Produto livro = new Livro("dasdasdw", "fsdf", 2345);
		Produto revista = new Revista("dasdwd", "sdad", 2323);
		
		Produto ebook2 = new Ebook("ese32asea", "ds3dasd", 32333);
		Produto livro2 = new Livro("das3dasdw", "fsd3f", 23845);
		Produto revista2 = new Revista("das3dwd", "sd3ad", 23823);
		
		Ebook ebooknovo = (Ebook) ebook ;
	
		produtos.add(livro);
		produtos.add(ebooknovo);
		produtos.add(revista);
		produtos.add(livro2);
		produtos.add(ebook2);
		produtos.add(revista2);
		
		Client client = new Client("jair", produtos);
		
		for (Produto produto : client.getProdutos()) {
			if(produto instanceof Revista) {
			System.out.println(produto.getAutor());
			System.out.println(produto.getTitulo());
			System.out.println(produto.getPreco());
			System.out.println("---------------------");
			}
		}
	}

}
