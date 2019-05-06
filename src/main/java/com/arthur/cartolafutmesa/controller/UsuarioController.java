package com.arthur.cartolafutmesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {

	@RequestMapping(value = "/usuario")
	public String index() {
		return "index";
	}
}
