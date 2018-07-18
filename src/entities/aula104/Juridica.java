package entities.aula104;

public class Juridica extends Contribuinte {
	
	private int numeroFuncionario;

	public Juridica() {

	}

	public Juridica(String nome, Double rendaAnual, int numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public Double imposto() {
		
		Double imposto = 0.0;
		Double taxaFuncionario = 0.16;
		
		if (this.numeroFuncionario > 10) {
			taxaFuncionario = 0.14;
			imposto = getRendaAnual() * taxaFuncionario;
		}
		else {
			imposto = getRendaAnual() * taxaFuncionario;
		}
		
		return imposto;
	}

}
