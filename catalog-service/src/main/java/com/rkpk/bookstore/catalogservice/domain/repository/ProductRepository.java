package com.rkpk.bookstore.catalogservice.domain.repository;

import com.rkpk.bookstore.catalogservice.domain.entity.ProductEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByCode(String code);
}
