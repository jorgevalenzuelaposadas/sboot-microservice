package com.jvp.poc.model;

import java.io.Serializable;
import java.util.List;

import com.jvp.poc.util.Constantes;

public class CollectionResponse<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9200305032387823549L;
	private List<T> elements;
	private Long start;
	private String sort;
	private Long limit = Constantes.PAGINATION_SIZE;
	private Long totalCount;
	public CollectionResponse() {
		
	}
	
	public CollectionResponse(List<T> elements) {
		super();
		this.elements = elements;
	}
	 

	public CollectionResponse(List<T> elements, Long start, Long limit, Long totalCount) {
		super();
		this.elements = elements;
		this.start = start;
		this.limit = limit;
		this.totalCount = totalCount;
	}


	/**
	 * @return the elements
	 */
	public List<T> getElements() {
		return elements;
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
	public void setElements(List<T> elements) {
		this.elements = elements;
	}
 
	
}
