package com.tomaszgawel.notez.core.components.services;

import com.tomaszgawel.notez.core.components.entities.UserEntity;
import com.tomaszgawel.notez.core.components.repositories.UserRepository;
import com.tomaszgawel.notez.models.CreateUserRequestModel;
import com.tomaszgawel.notez.models.SigninRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity addUser(@RequestBody CreateUserRequestModel createUserRequestModel){
        if(userRepository.getByLogin(createUserRequestModel.getLogin()) != null)
            return null;

        UserEntity userEntity = new UserEntity();
        userEntity.setLogin(createUserRequestModel.getLogin());
        userEntity.setPassword(createUserRequestModel.getPassword());
        userEntity.setFirstName(createUserRequestModel.getFirstName());
        userEntity.setLastName(createUserRequestModel.getLastName());
        userEntity.setEmail(createUserRequestModel.getEmail());

        userRepository.save(userEntity);
        return userEntity;

    }

    public UserEntity signIn(@RequestBody SigninRequestModel signinRequestModel){
        return userRepository.getByLoginAndPassword(signinRequestModel.getLogin(), signinRequestModel.getPassword());
    }
}
