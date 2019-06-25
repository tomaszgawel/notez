package com.tomaszgawel.notez.core.components.controllers;

import com.tomaszgawel.notez.core.components.entities.UserEntity;
import com.tomaszgawel.notez.core.components.services.UserService;
import com.tomaszgawel.notez.models.CodeResponse;
import com.tomaszgawel.notez.models.CreateUserRequestModel;
import com.tomaszgawel.notez.models.SigninRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("signin")
    public ResponseEntity signIn(@RequestBody SigninRequestModel signinRequestModel){
        UserEntity user = userService.signIn(signinRequestModel);
        if(user != null)
            return new ResponseEntity<>(new CodeResponse("ACCEPT"), HttpStatus.ACCEPTED);
        return new ResponseEntity<>(new CodeResponse("REJECT"), HttpStatus.FORBIDDEN);
    }

    @PostMapping("signup")
    public ResponseEntity signUp(@RequestBody CreateUserRequestModel createUserRequestModel){
        UserEntity newUser = userService.addUser(createUserRequestModel);
        if(newUser != null)
            return new ResponseEntity<>(new CodeResponse("CREATED"), HttpStatus.ACCEPTED);
        return new ResponseEntity<>(new CodeResponse("REJECT"), HttpStatus.FORBIDDEN);
    }

}
