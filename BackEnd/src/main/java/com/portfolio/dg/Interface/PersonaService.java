package com.portfolio.dg.Interface;

import java.util.List;

import com.portfolio.dg.Entity.Persona;

public interface PersonaService {
	
	//Traer una lista de persona
	public List<Persona> getPersona();
	
	//Guardar un objeto de tipo persona
	public void savePersona(Persona persona);
	
	//Eliminar un usuario buscandolo por ID
	public void deletePersona(Long id);
	
	//Buscar persona por id
	public Persona findPersona(Long id);
}
