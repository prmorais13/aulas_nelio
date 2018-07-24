package model.aula159.services;

import model.aula159.entities.AluguelCarro;
import model.aula159.entities.Fatura;

public class AluguelService {
	
	private Double precoPorDia;
	private Double precoPorHora;
	private TaxaBrasilService taxaBrasilService;
	
	public AluguelService(Double precoPorDia, Double precoPorHora, TaxaBrasilService taxaBrasilService) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaBrasilService = taxaBrasilService;
	}
	
	public void ProcessarFatura(AluguelCarro aluguelCarro ) {
		long t1 = aluguelCarro.getInicio().getTime();
		long t2 = aluguelCarro.getRetorno().getTime();	
		double horas = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double pagamentoBasico;
		
		if (horas <= 12.00) {
			pagamentoBasico = Math.ceil(horas) * precoPorHora;
		}
		else {
			pagamentoBasico = Math.ceil(horas / 24) * precoPorDia;
		}
		
		double taxaImposto = taxaBrasilService.taxa(pagamentoBasico);
		
		aluguelCarro.setFatura(new Fatura(pagamentoBasico, taxaImposto));
		
	}
	

}
