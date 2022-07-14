package com.portfolio.dg.Security.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.dg.Security.Entity.Rol;
import com.portfolio.dg.Security.Enums.RolNombre;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
