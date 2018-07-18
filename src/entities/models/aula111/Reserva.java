package entities.models.aula111;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numQuarto;
	private Date entrada;
	private Date saida;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva(Integer numQuarto, Date entrada, Date saida) {
		this.numQuarto = numQuarto;
		this.entrada = entrada;
		this.saida = saida;
	}

	public Integer getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}

	public Date getEntrada() {
		return entrada;
	}

	public Date getSaida() {
		return saida;
	}
	
	public long duracao() {
		long diff = this.saida.getTime() - this.entrada.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void atualizaDatas(Date entrada, Date saida) {
		this.entrada = entrada;
		this.saida = saida;
	}
	
	@Override
	public String toString() {
		return "Quarto "
				+ this.numQuarto
				+ ", Entrada: "
				+ sdf.format(this.entrada)
				+ ", Saída: "
				+ sdf.format(this.saida)
				+ ", "
				+ this.duracao()
				+ " Noites";
	}
	
}
