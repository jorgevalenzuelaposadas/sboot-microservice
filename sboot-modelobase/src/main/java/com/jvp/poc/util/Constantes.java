package com.jvp.poc.util;

import java.math.BigDecimal;

public class Constantes {

	public static final String BLANK_SPACE = " ";
	public static final String GUION = "-";
	public static final Boolean HABILITADO = true;
	public static final Boolean INHABILITADO = false;
	public static final String CERO = "0";
	public static final Long PAGINATION_SIZE = 20L;
	public static final String EMPTY = "";
	public static final String DATE_SHORT_FORMAT = "dd/MM/yyyy";
	public static final String DATE_SQL_FORMAT = "yyyy-MM-dd";
	public static final String SUCCESS = "success";
	public static final String TIME_ZONE = "America/Bogota";
	public static final String TIME_FORMAT = "HH:mm:ss.SSS";
	public static final Integer LONGUITUD_CODIGO_CATALOGO = 8;
	public static final BigDecimal INCREMENTO = new BigDecimal(1);

	public static final Integer LONGITUD_SUFIJO_DOCUMENTO = 6;

	private Constantes() {
	}

	public static class MessageCodigo {

		public static final String TX = "TX";
		public static final String CNX = "CONEXION";
		public static final String NGX = "NEGOCIO";
		public static final String OK = "SUCCESS";

		private MessageCodigo() {
		}
	}

	public static class Message {

		public static final String SAVE = "Se guardo correctamente";
		public static final String UPDATE = "Se actualizo correctamente";
		public static final String DELETE = "Se elimno correctamente";
		public static final String UPLOAD = "Se Adjunto el Documento correctamente";
		public static final String GENERATE = "Se ha generado Correctamente";
		public static final String SMS_TEXTO = "Se ha enviado el mensaje de texto correctamente";
		public static final String ENVIO = "Se ha enviado los documentos de forma correcta";
		public static final String FIRMA = "El/Los Documentos fueron firmados de forma correcta";
		public static final String AUDIT_TRAIL = "Se agregdo el registro de auditoria";

		private Message() {
		}
	}

}
