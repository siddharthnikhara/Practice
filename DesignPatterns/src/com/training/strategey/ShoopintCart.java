package com.training.strategey;

import java.util.ArrayList;
import java.util.List;

public class ShoopintCart {
	List<Item> list;

	public ShoopintCart() {
		this.list = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		this.list.add(item);
	}

	
	public void addItem1(List<Item> list) {
		this.list.addAll(list);
	}
	public void removeItem(Item item) {
		this.list.remove(item);
	}

	public void modifyItemCount(Item item) {

	}

	public int calculateTotal() {
		int sum = 0;
		for (Item item : list) {
			sum = sum + item.getPrice() * item.getQty();

		}
		return sum;
	}

	public void checkOut(Payment paymentStrategey) {
		paymentStrategey.pay(calculateTotal());
	}
}
