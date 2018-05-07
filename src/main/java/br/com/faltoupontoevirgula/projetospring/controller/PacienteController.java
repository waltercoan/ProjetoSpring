package br.com.faltoupontoevirgula.projetospring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.faltoupontoevirgula.projetospring.model.Paciente;


@Controller
@RequestMapping("/paciente")
public class PacienteController {

	@GetMapping("")
	public ModelAndView index() {
		List<Paciente> listaPaciente = new ArrayList<Paciente>();
		
		Paciente p1 = new Paciente();
		p1.setNome("Zezinho");
		p1.setSexo("Masculino");
		
		listaPaciente.add(p1);
		
		return new ModelAndView("paciente/index","listapac",listaPaciente);
	}
}
