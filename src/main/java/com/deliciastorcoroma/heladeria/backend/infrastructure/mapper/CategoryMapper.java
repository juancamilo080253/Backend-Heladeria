package com.deliciastorcoroma.heladeria.backend.infrastructure.mapper;

import com.deliciastorcoroma.heladeria.backend.domain.model.Category;
import com.deliciastorcoroma.heladeria.backend.infrastructure.entity.CategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings(
            {
                @Mapping(source ="id",target="id"),
                @Mapping(source ="name",target="name"),
                @Mapping(source ="dateCreated",target = "dateCreated"),
                 @Mapping(source ="dateUpdated",target = "dateUpdated")
            }
            )

    Category toCategory(CategoryEntity categoryEntity);
    Iterable<Category> toCategoryList(Iterable<CategoryEntity>categoryEntities);
    @InheritInverseConfiguration
    CategoryEntity toCategoryEntity(Category category);

}
