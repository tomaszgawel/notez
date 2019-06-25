package com.tomaszgawel.notez.core.components.repositories;

import com.tomaszgawel.notez.core.components.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity getByLogin(String login);
    UserEntity getByLoginAndPassword(String login, String password);
}
