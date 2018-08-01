package model.aula163.services;

import java.util.Calendar;
import java.util.Date;

import model.aula163.entities.Contrato;
import model.aula163.entities.Parcelamento;

public class ContratoService {
	
	private PagamentoService pagamentoService;
	
	public ContratoService() {
		
	}
	
	public ContratoService(PagamentoService pagamentoService) {
		this.pagamentoService = pagamentoService;
	}

/*	public void processarContrato(Contrato contrato, int meses) {
		long dataContrato = contrato.getData().getTime();
		for (int i = 1; i <= meses; i++) {
		
			double juros = pagamentoService.juroMensal(contrato.getValorTotal(), i);
			double valorComJuros = contrato.getValorTotal() + juros;
			double taxa = pagamentoService.taxaPagamento(valorComJuros);
			double valorTotal = valorComJuros + taxa;
			
			contrato.setParcelamento(new Parcelamento(new Date(dataContrato), valorTotal));
			System.out.println(contrato.getData() + " - " + contrato.getParcelamento().getValor());
		}
		
	}*/
	
	public void processarContrato2(Contrato contrato, int numParcelas) {
		
		//Calendar dataVencimento = Calendar.getInstance();
		//dataVencimento.setTime(contrato.getData());
		
		//List<Parcelamento> lista = new ArrayList<>();
		double valor = contrato.getValorTotal() / numParcelas;

		for (int i = 1; i <= numParcelas; i++) {
			//dataVencimento.add(Calendar.MONTH, 1);
			Date data = this.retornaData(contrato.getData(), i);
			double valorComJuros = pagamentoService.juroMensal(valor, i);
			double valorTotal = pagamentoService.taxaPagamento(valorComJuros);
			contrato.addLista(new Parcelamento(data, valorTotal));
			
			//lista.add(new Parcelamento(dataVencimento.getTime(), valorTotal));
		}
		
		//contrato.setParcelamento(lista);
		
	}
	
	private Date retornaData(Date data, int mes) {
		Calendar dataVencimento = Calendar.getInstance();
		dataVencimento.setTime(data);
		dataVencimento.add(Calendar.MONTH, mes);
		return dataVencimento.getTime();
	}

}
