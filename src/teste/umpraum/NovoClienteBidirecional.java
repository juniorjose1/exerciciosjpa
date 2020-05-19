package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteBidirecional {
	
	public static void main(String[] args) {
		
		Assento assento1 = new Assento(null, "3N");
		
		Cliente cli1 = new Cliente(null, "Robinho", assento1);
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		//daoCliente.inclusaoTotal(cli1);
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		
		//Obtendo Nome do Cliente a partir do Assento
		System.out.println(daoAssento.obter(Assento.class, 2L).getCliente().getNome());
		daoAssento.fechar();
		
	}

}
