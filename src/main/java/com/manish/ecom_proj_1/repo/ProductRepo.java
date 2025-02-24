package com.manish.ecom_proj_1.repo;

import com.manish.ecom_proj_1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
//    JPQL - java persistence query language
@Query("SELECT p from Product p WHERE "+
        "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
        "LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
        "LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
        "LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Product> searchProduct(String keyword);
}
