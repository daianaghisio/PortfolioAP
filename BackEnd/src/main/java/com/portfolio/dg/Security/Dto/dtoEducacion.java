package com.portfolio.dg.Security.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
		@NotBlank
	    private String nombreEd;
	    @NotBlank
	    private String descripcionEd;
	    
	    public dtoEducacion() {
	    }

	    public dtoEducacion(String nombreEd, String descripcionEd) {
	        this.nombreEd = nombreEd;
	        this.descripcionEd = descripcionEd;
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
