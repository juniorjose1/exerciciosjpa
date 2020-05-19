package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_funcionario")
public class Desenvolvedor extends Funcionario {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "linguagem_programacao")
	private String linguagemProgramacao;
	
	private String senioridade;

	public Desenvolvedor() {
	}

	public Desenvolvedor(Integer id, String nome, Double salario, String linguagemProgramacao, String senioridade) {
		super(id, nome, salario);
		this.linguagemProgramacao = linguagemProgramacao;
		this.senioridade = senioridade;
	}

	public String getLinguagemProgramacao() {
		return linguagemProgramacao;
	}

	public void setLinguagemProgramacao(String linguagemProgramacao) {
		this.linguagemProgramacao = linguagemProgramacao;
	}

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	
	
	
}
