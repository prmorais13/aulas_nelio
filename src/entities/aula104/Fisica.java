package entities.aula104;

public class Fisica extends Contribuinte {
	
	private Double despesaSaude;

	public Fisica() {
		
	}

	public Fisica(String nome, Double rendaAnual, Double despesaSaude) {
		super(nome, rendaAnual);
		this.despesaSaude = despesaSaude;
	}
	
	

	public Double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(Double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}

	@Override
	public Double imposto() {
		Double imposto = 0.0;
		Double taxaSaude = this.despesaSaude * 0.50;
		
		if (getRendaAnual() != null && getRendaAnual() > 20000.00) {
			
			imposto = getRendaAnual() * 0.25;
			
			if (this.despesaSaude != null) {
				imposto -= taxaSaude;
			}
		}
		else if (getRendaAnual() != null && getRendaAnual() <= 20000.00){
			imposto = getRendaAnual() * 0.15;
			
			if (this.despesaSaude != null) {
				imposto -= taxaSaude;
			}
		}
		
		return imposto;	
	}
	
	
}
