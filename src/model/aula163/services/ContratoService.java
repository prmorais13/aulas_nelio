package model.aula163.services;

import java.util.Date;

import model.aula163.entities.Contrato;
import model.aula163.entities.Parcelamento;

public class ContratoService {
	
	private PagamentoService pagamentoService;
	
	public void processarContrato(Contrato contrato, int meses) {
		long dataContrato = contrato.getData().getTime();
		
		double taxa = pagamentoService.taxaPagamento(contrato.getValorTotal());
		double juros = pagamentoService.juroMensal(contrato.getValorTotal(), meses);
		
		contrato.setParcelamento(new Parcelamento(new Date(dataContrato), taxa + juros));
	}

}
