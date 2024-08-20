package com.example.demo.model.dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.entidades.Cliente;





@Repository("clienteDaoJPA")// bean de  acceso a datos 

public class ClienteDaoImple implements InterfazClienteDao {
	
	@PersistenceContext
	private EntityManager em ; // maneja las clase de entidades  

    @SuppressWarnings("unchecked") 
	@Transactional(readOnly = true) // metodo solo de lectura
	@Override
	public List<Cliente> finAll() {
	
		return  em.createQuery("from Cliente").getResultList();
		
	}

}
