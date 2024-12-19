package com.youcode.pigeonskyracev3.service;

import com.youcode.pigeonskyracev3.entity.enums.Role;

public interface RoleService {

    String updateUserRole(Long userId, Role newRole);
}
