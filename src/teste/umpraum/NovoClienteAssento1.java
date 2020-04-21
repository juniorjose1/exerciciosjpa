package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		Assento assento1 = new Assento(null, "10A");
		
		Cliente cliente1 = new Cliente(null, "Tathi Cruz", assento1);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(assento1)
			.incluir(cliente1)
			.fecharT()
			.fechar();
		
	}

}
