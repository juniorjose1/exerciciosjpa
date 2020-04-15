package infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {

	
	public ProdutoDAO() {
		super(Produto.class);
	}
	
	public String alterarProduto(Long id, String nome, Double preco) {
		Produto produto = em.find(Produto.class, id);
		produto.setNome(nome);
		produto.setPreco(preco);
		em.merge(produto);
		return String.format("O Produto do ID: %d foi alterado com sucesso.", id);
	}
	
}
