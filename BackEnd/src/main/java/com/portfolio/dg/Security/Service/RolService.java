package com.portfolio.dg.Security.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.dg.Security.Entity.Rol;
import com.portfolio.dg.Security.Enums.RolNombre;
import com.portfolio.dg.Security.Repository.iRolRepository;

@Service
@Transactional
public class RolService {
	@Autowired
	iRolRepository irolrepository;
	
	public Optional<Rol> getByRolNombre(RolNombre rolNombre){
		return irolrepository.findByRolNombre(rolNombre);
	}
	
	public void save(Rol rol) {
		irolrepository.save(rol);
	}
	
}
