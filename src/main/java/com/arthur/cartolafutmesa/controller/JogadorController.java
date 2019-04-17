package com.arthur.cartolafutmesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JogadorController {
	@RequestMapping(value = "/jogador")
	public String index() {
		return "index";
	}
}
