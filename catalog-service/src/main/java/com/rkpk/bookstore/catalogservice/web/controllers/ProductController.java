package com.rkpk.bookstore.catalogservice.web.controllers;

import com.rkpk.bookstore.catalogservice.domain.PagedResult;
import com.rkpk.bookstore.catalogservice.domain.dto.Product;
import com.rkpk.bookstore.catalogservice.domain.service.ProductService;
import com.rkpk.bookstore.catalogservice.web.exception.ProductNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    PagedResult<Product> getProducts(@RequestParam(name = "page", defaultValue = "1") int pageNo) {
        return productService.getProducts(pageNo);
    }

    @GetMapping("/{code}")
    ResponseEntity<Product> getProductByCode(@PathVariable String code) {
        return productService.getProductByCode(code)
                .map(product -> ResponseEntity.ok(product))
                .orElseThrow(() -> ProductNotFoundException.forCode(code));
    }
}
