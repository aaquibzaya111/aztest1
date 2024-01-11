package com.mynobroker.service.impl;

import com.mynobroker.entity.User;
import com.mynobroker.payload.UserDto;
import com.mynobroker.repository.UserRepo;
import com.mynobroker.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UserRepo userRepo;
   @Autowired
   private ModelMapper modelMapper;
    @Override
    public long createUser(UserDto userDto) {
        User user = mapToEntity(userDto);
        User save = userRepo.save(user);
        return save.getId();
    }
    User mapToEntity(UserDto userDto){
        User map = modelMapper.map(userDto, User.class);
        return map;
    }
}
