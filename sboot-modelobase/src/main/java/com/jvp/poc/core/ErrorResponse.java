package com.jvp.poc.core;

import java.io.Serializable;

public class ErrorResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3092234736937909583L;

	private String codigo;
	private String mensaje;
	private String mensajeTecnico;
	private Throwable trace;

	public ErrorResponse() {
	}

	public ErrorResponse(String codigo, String mensajeTecnico, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensajeTecnico = mensajeTecnico;
		this.mensaje = mensaje;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the mensajeTecnico
	 */
	public String getMensajeTecnico() {
		return mensajeTecnico;
	}

	/**
	 * @param mensajeTecnico the mensajeTecnico to set
	 */
	public void setMensajeTecnico(String mensajeTecnico) {
		this.mensajeTecnico = mensajeTecnico;
	}

	/**
	 * @return the mensajePersonalizado
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensajePersonalizado the mensajePersonalizado to set
	 */
	public void setMensaje(String mensajePersonalizado) {
		this.mensaje = mensajePersonalizado;
	}

	/**
	 * @return the trace
	 */
	public Throwable getTrace() {
		return trace;
	}

	/**
	 * @param trace the trace to set
	 */
	public void setTrace(Throwable trace) {
		this.trace = trace;
	}

}
