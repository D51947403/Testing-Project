package sinraul.boot.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sinraul.boot.product.model.Product;
import sinraul.boot.product.repos.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository prodRepo;

	@Override
	public Product saveProduct(Product prod) {

		return prodRepo.save(prod);
	}

	@Override
	public List<Product> getAllProduct() {

		return prodRepo.findAll();
	}

	@Override
	public Product getProductById(long id) {

		return prodRepo.findById(id).get();
	}

	@Override
	public Product updateProduct(Product prod) {

		return prodRepo.save(prod);
	}

	@Override
	public void deleteProduct(long id) {
		prodRepo.deleteById(id);
	}

}
