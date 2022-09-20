package com.jvp.poc.core;

import java.io.Serializable;
import java.math.BigDecimal;

public class SesionResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3964873876948541443L;

	private String usuario;
	private String nombre;
	private BigDecimal rolId;
	private String rolCodigo;
	private String rol;
	private String email;
	private BigDecimal usuarioId;
	private String ip;

	public SesionResponse() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getRolId() {
		return rolId;
	}

	public void setRolId(BigDecimal rolId) {
		this.rolId = rolId;
	}

	public String getRolCodigo() {
		return rolCodigo;
	}

	public void setRolCodigo(String rolCodigo) {
		this.rolCodigo = rolCodigo;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(BigDecimal usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
 
}
