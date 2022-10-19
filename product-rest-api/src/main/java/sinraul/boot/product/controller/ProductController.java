package sinraul.boot.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sinraul.boot.product.model.Product;
import sinraul.boot.product.service.ProductService;

@RestController
@RequestMapping("/rest-api")
// To enable spring boot application to communicate with angular application 
@CrossOrigin
public class ProductController {

	@Autowired
	ProductService prodServ;
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product prod) {
	  return prodServ.saveProduct(prod);
	}
	
	
	@GetMapping("/product")
	public List<Product> getAllProduct(){
		return prodServ.getAllProduct();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") long id) {
	  return prodServ.getProductById(id);
	}
	
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product prod) {
		return prodServ.updateProduct(prod);
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable("id") long id) {
	   prodServ.deleteProduct(id);
	}
	
}
