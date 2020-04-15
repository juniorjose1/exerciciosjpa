package teste.basico;

import infra.ProdutoDAO;

public class AlterarProduto {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.abrirT();
		System.out.println(dao.alterarProduto(2L, "Celular", 1200.54));
		dao.fecharT();
		
	}

}
