package br.com.faltoupontoevirgula.projetospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.faltoupontoevirgula.projetospring.model.Usuario;
import br.com.faltoupontoevirgula.projetospring.repository.UsuarioRepository;

@Component
public class StartupEventListenerBean {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(usuarioRepository.findByUsername("user") == null) {
			Usuario user = new Usuario();
			user.setUsername("user");
			user.setPassword("user");
			user.setRole("ROLE_ADMIN");
			usuarioRepository.save(user);


		}

		if(usuarioRepository.findByUsername("teste") == null) {
			Usuario user = new Usuario();
			user = new Usuario();
			user.setUsername("teste");
			user.setPassword("teste");
			user.setRole("ROLE_TESTE");
			usuarioRepository.save(user);
		}
		


	}
}