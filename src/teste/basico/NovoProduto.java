package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto produto1 = new Produto("Playstation 5", 5000.0);
		
		Produto produto2 = new Produto("Salgado", 2341.0);
		
		Produto produto3 = new Produto("Computador", 1314.5);
		
		dao.inclusaoTotal(produto1);
		dao.inclusaoTotal(produto2);
		dao.inclusaoTotal(produto3);
		
		
	}

}
