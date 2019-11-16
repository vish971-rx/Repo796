package com.lti.repository;  //it is a dao

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;

//instead of @Component,suggestion is to use @Repository


@Repository
public class CustomerRepository {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	/* (non-Javadoc)
	 * @see com.lti.dao.IncomeupdateDaoInterface#addNewRecord(java.lang.Object)
	 */
	@Transactional
	public void addNewRecord(Customer customer ) {
		entitymanager.merge(customer);
			
		
			}
	
	

}
