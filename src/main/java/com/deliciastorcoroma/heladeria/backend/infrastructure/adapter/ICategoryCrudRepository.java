package com.deliciastorcoroma.heladeria.backend.infrastructure.adapter;

import com.deliciastorcoroma.heladeria.backend.infrastructure.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryCrudRepository extends CrudRepository<CategoryEntity, Integer> {

}
