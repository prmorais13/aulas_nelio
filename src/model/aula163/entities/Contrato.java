package model.aula163.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private Integer numero;
	private Date data;
	private Double valorTotal;
	//private Parcelamento parcelamento;
	private List<Parcelamento> parcelamentos = new ArrayList<>();
	
	public Contrato() {
		
	}

	public Contrato(Integer numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelamento> getParcelamentos() {
		return parcelamentos;
	}

	public void addLista(Parcelamento parcelamento) {
		this.parcelamentos.add(parcelamento);
	}
	
	public void removeLista(Parcelamento parcelamento) {
		this.parcelamentos.remove(parcelamento);
	}
	
	/*public void setParcelamento(List<Parcelamento> parcelamento) {
		this.parcelamento = parcelamento;
	}

	public Parcelamento getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(Parcelamento parcelamento) {
		this.parcelamento = parcelamento;
	}*/
	
}
