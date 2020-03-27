package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Truyum;
import com.example.demo.service.TruyumService;

@Controller
public class TruyumController {
	TruyumService service;

	@Autowired
	public TruyumController(TruyumService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String showHome(Model model) {
		List<Truyum> carts = service.getCarts();
		model.addAttribute("carts", carts);
		return "index";
	}

	@GetMapping("/edit")
	public String showForm(@RequestParam("sno") int sno, Model model) {
		Truyum t = service.getCart(sno);
		model.addAttribute(t);
		return "cart-form";
	}

	@GetMapping("/add")
	public String showCartForm(Model model) {
		Truyum t = new Truyum();
		model.addAttribute(t);
		return "cart-form-1";
	}

	@GetMapping("/save")
	public String addCart(@ModelAttribute("cart") Truyum t, Model model) {
		boolean b = service.save(t);
		if (b)
			return "redirect:/";
		else
			return "redirect:/add";
	}

	@GetMapping("/update")
	public String update(@ModelAttribute("cart") Truyum t, Model model) {
		boolean b = service.updateCart(t);
		if (b)
			return "redirect:/";
		else
			return "redirect:/edit";
	}

	@GetMapping("/delete/{sno}")
	public String delete(@PathVariable("sno") int sno) {
		boolean b = service.delete(sno);
		String viewName = null;
		if (b) {
			viewName = "redirect:/";
		}
		return viewName;
	}
}
