package modelo.basico;

import javax.persistence.Embeddable;

@Embeddable
public class Pagamento {
	
	private String transferencia;
	
	private Double valor;
	
	public Pagamento() {
		
	}

	public Pagamento(String transferencia, Double valor) {
		super();
		this.transferencia = transferencia;
		this.valor = valor;
	}

	public String getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(String transferencia) {
		this.transferencia = transferencia;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	

}
