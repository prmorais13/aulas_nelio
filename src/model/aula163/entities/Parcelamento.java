package model.aula163.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelamento {
	private Date dataVencimento;
	private Double valor;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcelamento() {
		
	}

	public Parcelamento(Date dataVencimento, Double valor) {
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return sdf.format(getDataVencimento())
				+ " - "
				+ getValor();
	}
	
	
	
}
