package com.srm.credito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srm.credito.entity.ClienteCredito;
import com.srm.credito.service.ClienteCreditoService;

@RestController
@RequestMapping("api/clienteCredito")
public class ClienteCreditoController {

	
	@Autowired
	private ClienteCreditoService clienteCreditoService;
	
	
	@RequestMapping(value = "/cadastra", method = RequestMethod.POST)
	public ResponseEntity<ClienteCredito> cadastra(@RequestBody ClienteCredito ClienteCredito) {
		ClienteCredito userCriado = this.clienteCreditoService.createClienteCredito(ClienteCredito);
		return new ResponseEntity<>(userCriado, HttpStatus.CREATED); 
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public ResponseEntity<List<ClienteCredito>> findAll() {
		List<ClienteCredito> usersFounded = this.clienteCreditoService.findAll();
		return new ResponseEntity<>(usersFounded, HttpStatus.OK); 
	}
	
	@RequestMapping(value = "/findOne/{id}", method = RequestMethod.GET)
	public ResponseEntity<ClienteCredito> findOne(@PathVariable("id") Long id) {
		
		ClienteCredito userFounded = this.clienteCreditoService.findOne(id);
		
		return new ResponseEntity<>(userFounded, HttpStatus.OK); 
	}
	
	@RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ClienteCredito> excluirRestaurante(@PathVariable("id") Long id) {
		this.clienteCreditoService.excluirClienteCredito(id);
		
		return new ResponseEntity<>(null, HttpStatus.OK); 
	}
}
