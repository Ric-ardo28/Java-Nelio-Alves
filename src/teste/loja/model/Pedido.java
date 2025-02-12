package teste.loja.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	public static final SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
	List<ItemPedido> itens = new ArrayList<>();

	private Date momento;

	public Pedido(Date momento) {
		this.momento = momento;

	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void adicionarItem(ItemPedido item) {
		itens.add(item);
	}

	public void removerItem(ItemPedido item) {
		itens.remove(item);
	}

	public Date getMomento() {
		return momento;
	}
	double somaTotal() {
		double soma = 0;
		for (ItemPedido item : itens) {
			soma += item.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (ItemPedido item : itens) {
			sb.append(item.toString() + "\n");

		}
		sb.append("Hora do pedido: " + sd.format(momento) + "\n");
		sb.append("Valor Total dos items: $" + somaTotal() + "\n");
		return sb.toString();
	}
}
