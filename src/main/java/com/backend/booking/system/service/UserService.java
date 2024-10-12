package com.backend.booking.system.service;

import com.backend.booking.system.dto.UserDto;

import java.util.List;

public interface UserService {

    void createUser(UserDto userDTO);
    void bulkCreateUser(List<UserDto> userDTO);

    void deleteUser(String email);

}
