package com.jvp.poc.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.jvp.poc.util.Constantes;

@JsonInclude(Include.NON_NULL)
public class BaseRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5091564493273851833L;
	private Boolean habilitado;
	private Long start;
	private String sort;
	private Long limit = Constantes.PAGINATION_SIZE;
	private Long totalCount;
	public BaseRequest() {
	}

	public Boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}
 
	public Long getStart() {
		return start;
	}

	public void setStart(Long start) {
		this.start = start;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	 

}
