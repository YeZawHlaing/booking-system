package com.backend.booking.system.controller;


import com.backend.booking.system.dto.AuthDto;
import com.backend.booking.system.dto.UserDto;
import com.backend.booking.system.model.Room;
import com.backend.booking.system.model.User;
import com.backend.booking.system.service.UserService;
import com.backend.booking.system.util.response_template.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend/meikhtilar/")
@CrossOrigin
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/user/register")
    public ResponseEntity<ApiResponse<Object>> userRegister(@Valid @RequestBody UserDto userDTO) {

        userService.createUser(userDTO);

        return new ResponseEntity<>(
                new ApiResponse<>(HttpStatus.OK, "Successfully registered.", null),
                HttpStatus.OK
        );
    }


}
