package sinraul.boot.product.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import sinraul.boot.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
