package com.BackEnd.MathStoreOnline2.controller;


import com.BackEnd.MathStoreOnline2.dto.SingupDTO;
import com.BackEnd.MathStoreOnline2.dto.UserDTO;
import com.BackEnd.MathStoreOnline2.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingUpController {
    @Autowired
    private UserService userService;

    @PostMapping("/sing-up")
    public ResponseEntity<?> singupUser(@RequestBody SingupDTO singupDTO) {
        if (userService.hasUserWithRmail(singupDTO.getEmail())){
            return new ResponseEntity<>("User already exist", HttpStatus.NOT_ACCEPTABLE);
        }
        UserDTO createdUser =userService.createUser(singupDTO);
        createdUser = userService.createUser(singupDTO);
        if (createdUser == null){
            return new ResponseEntity<>("User not created. Come again Later", HttpStatus.BAD_REQUEST);
        }return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

}
