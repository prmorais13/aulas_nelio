package entities;

public class Conta {

	private int conta;
	private String titular;
	private double saldo;

	public Conta(int conta, String titular, double depositoInicial) {
		this.conta = conta;
		this.titular = titular;
		this.depositar(depositoInicial);
	}

	public Conta(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor + 5.0;
	}

	public String toString() {
		return conta + ", " + titular + ", R$" + String.format("%.2f", this.getSaldo());
	}

}
