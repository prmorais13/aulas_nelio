package model.aula163.services;

public class PagamentoService {
	
	public Double taxaPagamento(Double valor) {
		return valor += valor * 0.02;
	}
	
	public Double juroMensal(Double valor, int parcela) {
		valor += valor * 0.01 * parcela;
		return valor;
	}
}
