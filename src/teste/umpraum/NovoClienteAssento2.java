package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento assento2 = new Assento(null, "39B");
		
		Cliente cli2 = new Cliente(null, "Robertinho", assento2);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		dao.inclusaoTotal(cli2);
		
	}

}
