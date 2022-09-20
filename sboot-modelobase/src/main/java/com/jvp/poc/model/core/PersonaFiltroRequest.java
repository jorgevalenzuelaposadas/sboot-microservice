package com.jvp.poc.model.core;

import java.io.Serializable;

import com.jvp.poc.model.BaseRequest;

public class PersonaFiltroRequest extends BaseRequest implements Serializable {

	private static final long serialVersionUID = 4539050677804278345L;
	private String nombre;

	public PersonaFiltroRequest() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
