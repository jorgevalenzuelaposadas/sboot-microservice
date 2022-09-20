package com.jvp.poc.model.core;

import java.io.Serializable;
import java.math.BigDecimal;

import com.jvp.poc.model.BaseRequest;

public class PersonaRequest extends BaseRequest implements Serializable {

	private static final long serialVersionUID = 4055152370433965060L;

	private BigDecimal personaId;
	private String apellido;
	private String nombre;
	private String direccion;

	public PersonaRequest() {
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
