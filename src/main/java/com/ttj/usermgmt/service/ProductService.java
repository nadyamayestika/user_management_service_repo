package com.ttj.usermgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ttj.usermgmt.domain.Product;
import com.ttj.usermgmt.domain.ProductDTO;
import com.ttj.usermgmt.repo.ProductDao;


@Service
public class ProductService {
	
	 @Autowired
	 private ProductDao productDao;
	 
	 public Product save(ProductDTO productDTO) {
		 
	        Product newProduct = new Product();
	        newProduct.setName(productDTO.getName());
	        newProduct.setPrice(productDTO.getPrice());

	        return productDao.save(newProduct);
	 } 

	
	 public Iterable<Product> getProductByList() {
		 return productDao.findAll();
	 }
	
	 public Product getByid(Integer id) {
		return productDao.findById(id).get();
		
	 }
	 
	 public Product update(ProductDTO productDTO) {
		 
	        Product editProduct = new Product();
	        editProduct.setId(productDTO.getIdProduct());
	        editProduct.setName(productDTO.getName());
	        editProduct.setPrice(productDTO.getPrice());

	        return productDao.save(editProduct);
	 } 

	public void delete(int id) {
		productDao.deleteById(id);
		
	}
	 
}
