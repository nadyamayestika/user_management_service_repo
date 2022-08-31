package com.ttj.usermgmt.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ttj.usermgmt.domain.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer>{
	
}
