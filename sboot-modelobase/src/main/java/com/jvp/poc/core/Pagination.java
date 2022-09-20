package com.jvp.poc.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jvp.poc.util.Constantes;

public class Pagination implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5053391243711706478L;
	private Long start;
	private String sort;
	private Long limit = Constantes.PAGINATION_SIZE;
	private Long totalCount;
	private String fieldNameSort;
	private String directionSort = "ASC";
	private Map<String, Object> filter;
	private String search;
	private String criterionByDefault;
	private List<Object> parametersDefaultFilter;

	/**
	 * Constructor por defecto
	 */
	public Pagination() {
	}

	/**
	 * Constructor cuando se quiere utilizar solo el ordenamiento
	 * 
	 * @param sort campo a ordenar
	 * @param dir  "ASC" o "DESC"
	 */
	public Pagination(String sort, String dir) {
		super();
		this.fieldNameSort = sort;
		this.directionSort = dir;
	}

	public void setStart(Object start) {
		this.start = Long.valueOf(String.valueOf(start));
	}

	public void setLimit(Object limit) {
		this.limit = Long.valueOf(String.valueOf(limit));
	}

	/**
	 * @return el start
	 */
	public Long getStart() {
		return start;
	}

	/**
	 * @param start el start a establecer
	 */
	public void setStart(Long start) {
		this.start = start;
	}

	/**
	 * @return el limit
	 */
	public Long getLimit() {
		return limit;
	}

	/**
	 * @param limit el limit a establecer
	 */
	public void setLimit(Long limit) {
		this.limit = limit;
	}

	/**
	 * @return el totalCount
	 */
	public Long getTotalCount() {
		return totalCount;
	}

	/**
	 * @return el fieldNameSort
	 */
	public String getFieldNameSort() {
		return fieldNameSort;
	}

	/**
	 * @param fieldNameSort el fieldNameSort a establecer
	 */
	public void setFieldNameSort(String fieldNameSort) {
		this.fieldNameSort = fieldNameSort;
	}

	/**
	 * @return el directionSort
	 */
	public String getDirectionSort() {
		return directionSort;
	}

	/**
	 * @param directionSort el directionSort a establecer
	 */
	public void setDirectionSort(String directionSort) {
		this.directionSort = directionSort;
	}

	/**
	 * @return el filter
	 */
	public Map<String, Object> getFilter() {
		return filter;
	}

	/**
	 * @param filter el filter a establecer
	 */
	public void setFilter(Map<String, Object> filter) {
		this.filter = filter;
	}

	/**
	 * @return el search
	 */
	public String getSearch() {
		return search;
	}

	/**
	 * @param search el search a establecer
	 */
	public void setSearch(String search) {
		this.search = search;
	}

	/**
	 * @return el criterionByDefault
	 */
	public String getCriterionByDefault() {
		return criterionByDefault;
	}

	/**
	 * @param criterionByDefault el criterionByDefault a establecer
	 */
	public void setCriterionByDefault(String criterionByDefault) {
		this.criterionByDefault = criterionByDefault;
	}

	/**
	 * @return el parametersDefaultFilter
	 */
	public List<Object> getParametersDefaultFilter() {
		return parametersDefaultFilter;
	}

	/**
	 * @param parametersDefaultFilter el parametersDefaultFilter a establecer
	 */
	public void setParametersDefaultFilter(List<Object> parametersDefaultFilter) {
		this.parametersDefaultFilter = parametersDefaultFilter;
	}

	public List<Object> addParameterDefaultFilter(Object parameter) {
		if (this.parametersDefaultFilter == null) {
			this.parametersDefaultFilter = new ArrayList<Object>();
			;
		}
		this.parametersDefaultFilter.add(parameter);
		return this.parametersDefaultFilter;
	}

	// public List<SortField> getSort() {
	public String getSort() {
		return sort;
	}

	// public void setSort(List<SortField> sort) {
	public void setSort(String sort) {
		this.sort = sort;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}

class SortField {
	private String property;
	private String direction;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}