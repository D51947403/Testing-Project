package sinraul.boot.product.service;

import java.util.List;

import sinraul.boot.product.model.Product;

public interface ProductService {
	// product CRUD services 
	// Create  service 
	Product saveProduct(Product prod);
	// Read Service
	List<Product>	getAllProduct() ;
	// Read by Id 
	Product getProductById(long id) ;
	// Update service 
	Product updateProduct(Product prod);
	// Delete service 
	void deleteProduct(long id);
}
