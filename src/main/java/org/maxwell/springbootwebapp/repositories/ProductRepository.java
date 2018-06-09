package org.maxwell.springbootwebapp.repositories;

import org.maxwell.springbootwebapp.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
