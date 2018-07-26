package br.com.faltoupontoevirgula.projetospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.faltoupontoevirgula.projetospring.model.ItemListaCompra;
import br.com.faltoupontoevirgula.projetospring.model.ListaCompras;
import br.com.faltoupontoevirgula.projetospring.model.Produto;

@Controller
@RequestMapping("/carrinho")
public class ListaComprasController {

	@Autowired
	private ListaCompras listaCompras;
	
	@RequestMapping("/add/{id}")
	public ModelAndView add(@PathVariable("id") Produto produto) {
		
		ItemListaCompra novoItem = new ItemListaCompra();
		novoItem.setProduto(produto);
		listaCompras.getItens().add(novoItem);
		
		return new ModelAndView("redirect:/");
	}
}
