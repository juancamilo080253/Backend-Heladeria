package com.deliciastorcoroma.heladeria.backend.infrastructure.adapter;

import com.deliciastorcoroma.heladeria.backend.infrastructure.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface IProductCrudRepository extends CrudRepository<ProductEntity,Integer> {

}

