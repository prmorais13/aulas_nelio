package model.aula159.services;

public class TaxaBrasilService {
	
	public double taxa(double valor) {
		if (valor <= 100.00) {
			return valor * 0.2;
		}
		else {
			return valor * 0.15;
		}
	}

}
