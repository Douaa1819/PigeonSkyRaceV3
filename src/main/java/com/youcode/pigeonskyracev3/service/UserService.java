package com.youcode.pigeonskyracev3.service;

import com.youcode.pigeonskyracev3.dto.User.request.UserRegisterRequest;
import com.youcode.pigeonskyracev3.dto.User.response.UserResponse;
import com.youcode.pigeonskyracev3.entity.User;

public interface UserService{
    User createUser(UserRegisterRequest user);
    User findUserByUsername(String username);
    UserResponse getUserById(Long userId);
}
