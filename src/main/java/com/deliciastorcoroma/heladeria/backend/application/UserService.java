package com.deliciastorcoroma.heladeria.backend.application;

import com.deliciastorcoroma.heladeria.backend.domain.model.User;
import com.deliciastorcoroma.heladeria.backend.domain.port.IUserRepository;

public class UserService {
    private final IUserRepository iUserRepository;

    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }
    public User save(User user){
        return this.iUserRepository.save(user);
    }
    public User findById (Integer id){
        return this.iUserRepository.findById(id);
    }

}
