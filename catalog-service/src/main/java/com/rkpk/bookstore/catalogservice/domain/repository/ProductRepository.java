package com.rkpk.bookstore.catalogservice.domain.repository;

import com.rkpk.bookstore.catalogservice.domain.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByCode(String code);
}
