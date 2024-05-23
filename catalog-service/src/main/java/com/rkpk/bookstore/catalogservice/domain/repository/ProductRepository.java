package com.rkpk.bookstore.catalogservice.domain.repository;

import com.rkpk.bookstore.catalogservice.domain.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
