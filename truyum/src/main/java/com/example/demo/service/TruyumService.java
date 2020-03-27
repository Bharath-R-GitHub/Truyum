package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Truyum;

@Service
public class TruyumService {
	private List<Truyum> carts;

	public TruyumService() {
		carts = new ArrayList<Truyum>();
		carts.add(new Truyum(1, "Sandwich", "Rs.99.00", "Yes", "Main Course", "Yes"));
		carts.add(new Truyum(2, "Burger", "Rs.129.00", "Yes", "Starter", "No"));
		carts.add(new Truyum(3, "Chocolates", "Rs.199.00", "Yes", "Dessert", "Yes"));
		carts.add(new Truyum(4, "Pizza", "Rs.159.00", "Yes", "Main Course", "Yes"));
		carts.add(new Truyum(5, "French Fries", "Rs.175.00", "No", "Starter", "No"));
	}

	public List<Truyum> getCarts() {
		return carts;
	}

	public Truyum getCart(int sno) {
		Truyum t1 = null;
		for (Truyum t : carts) {
			if (t.getSno() == sno) {
				t1 = t;
			}
		}
		return t1;
	}

	public boolean updateCart(Truyum t) {
		Truyum t2 = carts.set(t.getSno(), t);
		if (t2 != null)
			return true;
		else
			return false;
	}

	public boolean delete(int sno) {
		Truyum t = getCart(sno);
		boolean b = carts.remove(t);
		return b;
	}

	public boolean save(Truyum t) {
		return carts.add(t);
	}
}
