package com.arthur.cartolafutmesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RodadaController {

	@RequestMapping(value = "/rodada")
	public String index() {
		return "index";
	}
}
