package com.portfolio.dg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.dg.Entity.Persona;
import com.portfolio.dg.Interface.PersonaService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PersonaController {
	@Autowired PersonaService personaService;
	
	@GetMapping("personas/traer")
	public List<Persona> getPersona(){
		return personaService.getPersona();
	}
	
	@PostMapping("/personas/crear")
	public String createPersona(@RequestBody Persona persona) {
		personaService.savePersona(persona);
		return "La persona fue creada correctamente.";
	}
	
	@DeleteMapping("/personas/borrar/{id}")
	public String deletePersona(@PathVariable Long id) {
		personaService.deletePersona(id);
		return "La persona fue eliminada correctamente.";
	}
	
	@PutMapping("/personas/editar/{id}")
	public Persona editPersona(@PathVariable Long id, @RequestParam("nombre") String nuevoNombre, @RequestParam("apellido") String nuevoApellido, @RequestParam("img") String nuevaImg) {
		Persona persona = personaService.findPersona(id);
		persona.setNombre(nuevoNombre);
		persona.setApellido(nuevoApellido);
		persona.setImg(nuevaImg);
		
		personaService.savePersona(persona);
		
		return persona;
	}
	
	@GetMapping("/personas/traer/perfil")
	public Persona findPersona() {
		return personaService.findPersona((long)1);
	}
	
}
