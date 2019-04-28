package com.srm.credito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srm.credito.business.ClienteCreditoBusiness;
import com.srm.credito.entity.ClienteCredito;
import com.srm.credito.repository.ClienteCreditoRepository;



@Service
public class ClienteCreditoService {
	
	@Autowired
	private ClienteCreditoRepository repository;
	
	
	@Autowired
	private ClienteCreditoBusiness business;
	
	public ClienteCredito createClienteCredito(ClienteCredito clienteCredito){
		clienteCredito.setTaxa(business.obterTaxaClienteCredito(clienteCredito));
		return this.repository.save(clienteCredito);
	}

	public List<ClienteCredito> findAll() {
		return repository.findAll();
	}


	public ClienteCredito findOne(Long id) {
		return repository.findOne(id);
	}

	
	public void excluirClienteCredito(Long id) {
		repository.delete(id);
	}
	
}
