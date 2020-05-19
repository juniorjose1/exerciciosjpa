package teste.basico;

import infra.DAO;
import modelo.basico.Desenvolvedor;
import modelo.basico.Funcionario;
import modelo.basico.Gerente;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		
		Funcionario func1 = new Desenvolvedor(1, "Alexandre", 2346.00, "Java", "Junior");
		
		Funcionario func2 = new Gerente(2, "Vitor", 5400.43, "TI");
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		   .incluir(func1)
		   .incluir(func2)
		   .fecharT()
		   .fechar();
		
	}

}
