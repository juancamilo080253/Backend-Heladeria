package com.deliciastorcoroma.heladeria.backend.domain.port;

import com.deliciastorcoroma.heladeria.backend.domain.model.User;

public interface IUserRepository {
    User save(User user);
    User findByEmail(String email);
    User findById(Integer id);
}
