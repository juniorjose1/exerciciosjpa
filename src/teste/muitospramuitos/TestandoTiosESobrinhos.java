package teste.muitospramuitos;

import java.util.Arrays;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class TestandoTiosESobrinhos {
	
	public static void main(String[] args) {
		
		Tio tio1 = new Tio(null, "Tico", 44);
		Tio tio2 = new Tio(null, "Sandoval", 35);
		
		Sobrinho sobrinho1 = new Sobrinho(null, "João", 12);
		Sobrinho sobrinho2 = new Sobrinho(null, "Tathi Cruz", 21);
		
		tio1.setSobrinhos(Arrays.asList(sobrinho1, sobrinho2));
		tio2.setSobrinhos(Arrays.asList(sobrinho1, sobrinho2));
		
		sobrinho1.setTios(Arrays.asList(tio1, tio2));
		sobrinho2.setTios(Arrays.asList(tio1, tio2));
		
//		tio1.getSobrinhos().addAll(Arrays.asList(sobrinho1, sobrinho2));
//		tio2.getSobrinhos().addAll(Arrays.asList(sobrinho1, sobrinho2));
//		
//		sobrinho1.getTios().addAll(Arrays.asList(tio1, tio2));
//		sobrinho2.getTios().addAll(Arrays.asList(tio1, tio2));
		
		DAO<Object> dao = new DAO<Object>();
		
		dao.abrirT().incluir(tio1)
			.incluir(tio2)
			.incluir(sobrinho1)
			.incluir(sobrinho2)
			.fecharT()
			.fechar();

		
	}
	
}
