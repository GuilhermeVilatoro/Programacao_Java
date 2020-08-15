package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment = new Date();
	private OrderStatus status;

	private Client client;

	private ArrayList<OrderItem> items = new ArrayList<>();

	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public ArrayList<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double total = 0.0;
		for (OrderItem orderItem : items) {
			total += orderItem.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ORDER SUMMARY: \n");
		sb.append("Order moment: " + SDF.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append(client.toString() + "\n");
		sb.append("Order items: \n");

		for (OrderItem orderItem : items) {
			sb.append(orderItem.toString() + "\n");
		}

		sb.append("Total price: $" + String.format("%.2f", total()));

		return sb.toString();
	}
}
