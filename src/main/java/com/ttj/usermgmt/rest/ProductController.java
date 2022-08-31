package com.ttj.usermgmt.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ttj.usermgmt.domain.ProductDTO;
import com.ttj.usermgmt.repo.ProductDao;
import com.ttj.usermgmt.service.ProductService;

@RestController
public class ProductController{

	public static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	 ProductDao productDao;
	
    @Autowired
    private ProductService productDetailService;

    
    @RequestMapping(value = "/createProduct", method = RequestMethod.POST, produces="application/json")
    public ResponseEntity<?> createNewProduct(@RequestBody ProductDTO productDTO){

       logger.info("Create Product");
       
       productDetailService.save(productDTO);

        return new ResponseEntity<>(productDTO, HttpStatus.CREATED);
    }
    
    @RequestMapping(value="/getProductByList", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<?> getProductByList(){
    	productDetailService.getProductByList();
    	return new ResponseEntity<>(productDetailService, HttpStatus.CREATED);
    
    }
    
    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<?> getByid(@PathVariable("id")Integer id){
        return new ResponseEntity<>(productDetailService.getByid(id), HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST, produces="application/json")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDTO productDTO){

       logger.info("Update Product");
       productDetailService.update(productDTO);
       return new ResponseEntity<>(productDTO, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<?> deleteProductById(@PathVariable (value = "id")Integer id){

       logger.info("Product is Deleted");
       productDetailService.delete(id);
       return new ResponseEntity<>("Product is Deleted", HttpStatus.CREATED);
    }
    
	
}
