package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_funcionario")
public class Gerente extends Funcionario {
	private static final long serialVersionUID = 1L;
	
	private String area;

	public Gerente() {
	}

	public Gerente(Integer id, String nome, Double salario, String area) {
		super(id, nome, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
	
}
