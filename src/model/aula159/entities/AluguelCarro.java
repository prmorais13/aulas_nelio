package model.aula159.entities;

import java.util.Date;

public class AluguelCarro {
	
	private Date inicio;
	private Date retorno;
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelCarro() {
		
	}

	public AluguelCarro(Date inicio, Date retorno, Veiculo veiculo) {
		this.inicio = inicio;
		this.retorno = retorno;
		this.veiculo = veiculo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getRetorno() {
		return retorno;
	}

	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

}
