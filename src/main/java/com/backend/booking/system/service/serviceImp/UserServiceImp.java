package com.backend.booking.system.service.serviceImp;

import com.backend.booking.system.dto.UserDto;
import com.backend.booking.system.model.User;
import com.backend.booking.system.repository.UserRepository;
import com.backend.booking.system.service.UserService;
import com.backend.booking.system.util.response_template.EntityMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.modelmapper.ModelMapper;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {


    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    @Override
    public void createUser(UserDto userDTO) {

        User user = modelMapper.map(userDTO, User.class);
        user.setPassword(
                BCrypt.hashpw(
                        userDTO.getPassword(),
                        BCrypt.gensalt(12)
                )
        );
        userRepository.save(user);

    }


    @Override
    public void deleteUser(String email) {
        try {
            userRepository.deleteByEmail(email);
        } catch (EmptyResultDataAccessException e) {
            throw new EntityNotFoundException("User not found with that email: " + email);
        }
    }
}
