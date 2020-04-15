package teste.basico;

import java.util.ArrayList;
import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> listaProdutos = new ArrayList<>();
		
		listaProdutos = dao.obterTodos();
		
		for(Produto produto: listaProdutos) {
			System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
		}
		
	}

}
