package com.deliciastorcoroma.heladeria.backend.domain.port;

import com.deliciastorcoroma.heladeria.backend.domain.model.Product;

public interface IProductRepository {
    Product  save(Product product);
    Iterable<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);

}
