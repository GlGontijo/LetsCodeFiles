
package com.letscode.usuarios.springmysql.service;

import com.letscode.usuarios.springmysql.converter.UserConverter;
import com.letscode.usuarios.springmysql.model.client.User;
import com.letscode.usuarios.springmysql.model.client.UserRequest;
import com.letscode.usuarios.springmysql.model.db.UserModel;
import com.letscode.usuarios.springmysql.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class UserService {

    @Autowired
    UserConverter userConverter;

    @Autowired
    IUserRepository userRepository;

    public User save(final UserRequest userRequest) {
        UserModel userModel = userConverter.requestToModel(userRequest);
        userModel.setDataCadastro(new Date());
        return userConverter.modelToResponse(userRepository.save(userModel));
    }
}