package com.portfolio.dg.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.dg.Entity.Persona;
import com.portfolio.dg.Interface.PersonaService;
import com.portfolio.dg.Repository.PersonaRepository;

@Service
public class ImpPersonaService implements PersonaService {
	
	@Autowired PersonaRepository personaRepository;
	
	@Override
	public List<Persona> getPersona() {
		List<Persona> persona = personaRepository.findAll();
		return persona;
	}

	@Override
	public void savePersona(Persona persona) {
		personaRepository.save(persona);
		
	}

	@Override
	public void deletePersona(Long id) {
		personaRepository.deleteById(id);
		
	}

	@Override
	public Persona findPersona(Long id) {
		Persona persona = personaRepository.findById(id).orElse(null);
		return persona;
	}

}
