package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private Date dataPedido;
	private StatusPedido status;
	private List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido() {
		
	}

	public Pedido(Date dataPedido, StatusPedido status) {
		this.dataPedido = dataPedido;
		this.status = status;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}
	
	public void adicionarItem(ItemPedido itemPedido) {
		this.itens.add(itemPedido);
	}
	
	public void removerItem(ItemPedido itemPedido) {
		this.itens.remove(itemPedido);
	}

	public Double total() {
		double total = 0.0;
		for (ItemPedido item : itens) {
			total += item.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Pedido [dataPedido=" + dataPedido + ", status=" + status + ", itens=" + itens + "]";
	}
	
}
