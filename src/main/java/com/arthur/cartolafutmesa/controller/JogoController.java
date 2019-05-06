package com.arthur.cartolafutmesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JogoController {

	@RequestMapping(value = "/jogo")
	public String index() {
		return "index";
	}
}
