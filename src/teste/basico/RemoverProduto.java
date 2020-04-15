package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class RemoverProduto {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.abrirT();
		System.out.println(dao.remover(Produto.class, 1L));
		dao.fecharT();
		
	}

}
