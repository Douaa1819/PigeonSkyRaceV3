package com.youcode.pigeonskyracev3.service.Impl;
import com.youcode.pigeonskyracev3.entity.User;
import com.youcode.pigeonskyracev3.mapper.UserMapper;
import com.youcode.pigeonskyracev3.repository.UserRepository;
import com.youcode.pigeonskyracev3.service.RoleService;
import com.youcode.pigeonskyracev3.entity.enums.Role;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class RoleServiceImpl implements RoleService {


    private final UserRepository userRepository;
    private final UserMapper userMapper;


    public RoleServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public String updateUserRole(Long userId, Role newRole) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));


        user.setRole(newRole);

        return "User " + user.getUsername() + " updated to " + newRole;

    }
}