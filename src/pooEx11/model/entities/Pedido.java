package pooEx11.model.entities;

import pooEx11.model.enums.PedidoStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private PedidoStatus status;

	private Client client;
	private List<PedidoItem> itens = new ArrayList<>();

	public Pedido(Date momento, PedidoStatus status, Client client) {
		this.momento = momento;
		this.status = status;
		this.client = client;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<PedidoItem> getItens() {
		return itens;
	}

	public void addItem(PedidoItem item) {
		itens.add(item);
	}

	public void removeItem(PedidoItem item) {
		itens.remove(item);
	}

	public double total() {
		double soma = 0;
		for (PedidoItem item : itens) {
			soma += item.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hora do pedido: " + sdf.format(momento) + "\n");
		sb.append("Status: " + status + "\n");
		sb.append("Cliente: " + client + "\n");
		for (PedidoItem item : itens) {
			sb.append(item.toString() + "\n");
		}
		sb.append("Total: $" + String.format("%.2f", total()));
			return	sb.toString();
	}
}
