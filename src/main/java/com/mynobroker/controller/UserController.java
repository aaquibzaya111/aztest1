package com.mynobroker.controller;

import com.mynobroker.payload.UserDto;
import com.mynobroker.repository.UserRepo;
import com.mynobroker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
   @Autowired
   private UserService userService;

  @PostMapping
  public ResponseEntity<String> createUser(@RequestBody UserDto userDto){
      long userId = userService.createUser(userDto);
      return new ResponseEntity<>("User is Created & user id is:"+userId, HttpStatus.CREATED);


  }

}
