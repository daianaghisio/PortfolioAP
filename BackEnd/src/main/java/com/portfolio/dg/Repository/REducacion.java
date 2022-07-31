package com.portfolio.dg.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.dg.Entity.Educacion;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer> {

	    public Optional<Educacion> findByNombreEd(String nombreEd);
	    public boolean existsByNombreEd(String nombreEd);
}
