package com.shakanulufer.allocation.springbootallocation.repository;

import com.shakanulufer.allocation.springbootallocation.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>  {

}
