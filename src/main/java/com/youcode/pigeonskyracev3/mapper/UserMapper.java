package com.youcode.pigeonskyracev3.mapper;

import com.youcode.pigeonskyracev3.dto.User.request.UserRegisterRequest;
import com.youcode.pigeonskyracev3.dto.User.response.UserResponse;
import com.youcode.pigeonskyracev3.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserRegisterRequest userRequest);

    UserResponse toUserResponse(User user);
}
