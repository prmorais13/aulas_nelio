package entities;

public class ProdutoImportado extends Produto {
	
	private Double taxaImportacao;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(Double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	@Override
	public String precoTag() {
		return nome + " $ " + String.format("%.2f", precoTotal()) + " (Taxa de importação: $ " + 
				String.format("%.2f", taxaImportacao) + ")";
	}
	
	public Double precoTotal() {
		return preco + taxaImportacao;
	}

}
