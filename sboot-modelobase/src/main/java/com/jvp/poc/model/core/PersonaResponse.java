package com.jvp.poc.model.core;

import java.io.Serializable;
import java.math.BigDecimal;

public class PersonaResponse implements Serializable {

	private static final long serialVersionUID = -8715696400984506915L;
	private BigDecimal personaId;
	private String apellido;
	private String nombre;
	private String direccion;

	public PersonaResponse() {
	}

	public BigDecimal getPersonaId() {
		return personaId;
	}

	public void setPersonaId(BigDecimal personaId) {
		this.personaId = personaId;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
