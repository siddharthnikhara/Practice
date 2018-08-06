package com.training.strategey;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
	public static void main(String[] args) {
		ShoopintCart st = new ShoopintCart();
		Payment cd = new CreditCard("sid", "325555", "333", "sda", 200.0, "hdfc");
		
		 st.addItem(new Item("jeans", 2000, 1));
		 st.addItem(new Item("shirt", 500, 6));
		
		// st.removeItem();
		// System.out.println(st.calculateTotal());
		// st.checkOut(cd);

		List<Item> items = Stream.of(new Item("jjj", 30, 5), new Item("5555", 50, 9)).collect(Collectors.toList());
		st.addItem1(items);
		System.out.println(st.calculateTotal());
		st.checkOut(cd);
	}

}
