package com.jvp.poc.sgc.core.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvp.poc.model.BaseOperacionResponse;
import com.jvp.poc.model.CollectionResponse;
import com.jvp.poc.model.core.PersonaFiltroRequest;
import com.jvp.poc.model.core.PersonaRequest;
import com.jvp.poc.model.core.PersonaResponse;
import com.jvp.poc.sgc.core.facade.PersonaFacade;

import java.io.IOException;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/persona")
public class PersonaRestController {

	@Autowired
	private PersonaFacade personaFacade;

	
	@PostMapping("/start")
	public String create() {
		return "start";
	}

	@PostMapping(value="/find",
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
	        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public CollectionResponse<PersonaResponse> find(@RequestBody PersonaFiltroRequest request) {
		
		//return personaFacade.find(request);
		if (request.getNombre()!=null)
			return personaFacade.findByKeywordIgnoreCase(request.getNombre());
		else
			return personaFacade.find(request);
	}
	/*
	@PostMapping("/find")
	public CollectionResponse<PersonaResponse> find(@RequestBody PersonaFiltroRequest request) {
		
		return personaFacade.find(request);
	}
*/
	
	@GetMapping("/initForm")
	public PersonaResponse initForm() {
		return personaFacade.initForm();
	}

	@PutMapping("/saveOrUpdate")
	public BaseOperacionResponse saveOrUpdate(@RequestBody PersonaRequest request) {
		return personaFacade.saveOrUpdate(request);
	}

	@DeleteMapping("/delete/{personaId}")
	public BaseOperacionResponse delete(@PathVariable BigDecimal personaId) {
		return personaFacade.delete(personaId);
	}

	@GetMapping("get/{personaId}")
	public PersonaResponse get(@PathVariable BigDecimal personaId) {
		return personaFacade.get(personaId);
	}
}