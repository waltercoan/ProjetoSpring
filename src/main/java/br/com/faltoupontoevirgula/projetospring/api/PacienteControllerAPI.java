package br.com.faltoupontoevirgula.projetospring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.faltoupontoevirgula.projetospring.model.Paciente;
import br.com.faltoupontoevirgula.projetospring.repository.PacienteRepository;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteControllerAPI {
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Paciente>> listarPacientes() {
		List<Paciente> lista = pacienteRepository.findAll();
		return new ResponseEntity<List<Paciente>>(lista,HttpStatus.OK);
	}
}
