package com.deliciastorcoroma.heladeria.backend.infrastructure.config;

import com.deliciastorcoroma.heladeria.backend.application.CategoryService;
import com.deliciastorcoroma.heladeria.backend.application.OrderService;
import com.deliciastorcoroma.heladeria.backend.application.ProductService;
import com.deliciastorcoroma.heladeria.backend.application.UserService;
import com.deliciastorcoroma.heladeria.backend.domain.port.ICategoryRepository;
import com.deliciastorcoroma.heladeria.backend.domain.port.IOrderRepository;
import com.deliciastorcoroma.heladeria.backend.domain.port.IProductRepository;
import com.deliciastorcoroma.heladeria.backend.domain.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration  {
    @Bean
    public UserService userService(IUserRepository iUserRepository){
        return new UserService(iUserRepository);

    }
    @Bean
    public CategoryService categoryService(ICategoryRepository iCategoryRepository){
        return new CategoryService(iCategoryRepository);
    }
    @Bean
    public ProductService productService(IProductRepository iProductRepository){
        return new ProductService(iProductRepository);
    }

    @Bean
    public OrderService orderService(IOrderRepository iOrderRepository){
        return new OrderService(iOrderRepository);
    }
}
