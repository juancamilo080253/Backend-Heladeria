package com.deliciastorcoroma.heladeria.backend.domain.port;

import com.deliciastorcoroma.heladeria.backend.domain.model.Category;

public interface ICategoryRepository {
    Category save (Category category);
    Iterable<Category>findAll();
    Category findById(Integer id);
    void deleteById(Integer id);

}
