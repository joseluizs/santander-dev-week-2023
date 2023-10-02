package com.br.luiz.service;

import com.br.luiz.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);


}
