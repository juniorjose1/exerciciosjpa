package teste.umpramuitos;

import java.util.Arrays;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		DAO<Pedido> daoPedido = new DAO<>(Pedido.class);
		DAO<ItemPedido> daoItemPedido = new DAO<>(ItemPedido.class);

		
		Pedido pedido1 = new Pedido(null, "Alexandre");
		
		ItemPedido item1 = new ItemPedido(null, "Geladeira", 1, 2500.24, pedido1);
		
		ItemPedido item2 = new ItemPedido(null, "Computador", 1, 1200.76, pedido1);
		
		ItemPedido item3 = new ItemPedido(null, "Celular", 1, 700.36, pedido1);

		
		pedido1.setItensPedido(Arrays.asList(item1, item2, item3));
		
		Pedido pedido = daoPedido.obter(Pedido.class, 1L);
		
		//Pegando do Banco
//		for(ItemPedido item: pedido.getItensPedido()) {
//			System.out.println(item.getNome());
//		}
		
		//Pegando da Lista
//		for(ItemPedido pedido: pedido1.getItensPedido()) {
//			System.out.println(pedido.getNome());
//		}

		
//		dao.abrirT()
//			.incluir(pedido1)
//			.incluir(item1)
//			.incluir(item2)
//			.incluir(item3)
//			.fecharT()
//			.fechar();
//		
		
		
	}

}
