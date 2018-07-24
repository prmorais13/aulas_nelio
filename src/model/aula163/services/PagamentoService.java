package model.aula163.services;

public class PagamentoService {
	
	public Double taxaPagamento(Double valor) {
		return valor += valor * 0.02;
	}
	
	public Double juroMensal(Double valor, int prestacao) {
		valor += valor * 0.01 * prestacao;
		//valor += valor * 0.02;
		return valor;
	}
}
