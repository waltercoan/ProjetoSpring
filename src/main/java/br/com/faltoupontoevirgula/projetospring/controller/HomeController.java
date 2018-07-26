package br.com.faltoupontoevirgula.projetospring.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.faltoupontoevirgula.projetospring.model.ListaCompras;
import br.com.faltoupontoevirgula.projetospring.model.Produto;
import br.com.faltoupontoevirgula.projetospring.repository.ProdutoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private ListaCompras listaCompras;
	
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest request, HttpSession session) {
		//return new ModelAndView("index","id",RequestContextHolder.getRequestAttributes().getSessionId());
		request.getSession().putValue("walter", "eunaoacredito");
		List<Produto> listProdutos = produtoRepository.findAll();
		
		HashMap<String, Object> models = new HashMap<String, Object>();
		models.put("listProdutos",listProdutos);
		models.put("numProdutos",listaCompras.getItens().size());
		
		
		return new ModelAndView("index",models);
	}
}
