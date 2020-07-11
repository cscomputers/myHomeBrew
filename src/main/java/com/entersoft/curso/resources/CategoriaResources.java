package com.entersoft.curso.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResources {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Serviço Rest Ok!";
	}
}
