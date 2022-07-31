package com.portfolio.dg.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreEd;
    private String descripcionEd;
    
    
	public Educacion() {
	}

	public Educacion(String nombreEd, String descripcionEd) {
		this.nombreEd = nombreEd;
		this.descripcionEd = descripcionEd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreEd() {
		return nombreEd;
	}

	public void setNombreEd(String nombreEd) {
		this.nombreEd = nombreEd;
	}

	public String getDescripcionEd() {
		return descripcionEd;
	}

	public void setDescripcionEd(String descripcionEd) {
		this.descripcionEd = descripcionEd;
	}
    
    
    
}
