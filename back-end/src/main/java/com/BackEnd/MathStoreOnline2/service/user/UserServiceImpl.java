package com.BackEnd.MathStoreOnline2.service.user;

import com.BackEnd.MathStoreOnline2.dto.SingupDTO;
import com.BackEnd.MathStoreOnline2.dto.UserDTO;
import com.BackEnd.MathStoreOnline2.entities.User;
import com.BackEnd.MathStoreOnline2.enums.UserRole;
import com.BackEnd.MathStoreOnline2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(SingupDTO singupDTO){
        User user = new User();
        user.setName(singupDTO.getName());
        user.setEmail(singupDTO.getEmail());
        user.setUserRole(UserRole.USER_ROLE);
        user.setPassword(new BCryptPasswordEncoder().encode(singupDTO.getPassword()));
        User createdUser = userRepository.save(user);
        UserDTO userDTO = new UserDTO();
        userDTO.setId(createdUser.getId());
        userDTO.setName(createdUser.getName());
        userDTO.setEmail(createdUser.getEmail());
        userDTO.setUserRole(createdUser.getUserRole());
        return userDTO;
    }

    @Override
    public boolean hasUserWithRmail(String email) {
        return userRepository.findFirstByEmail(email)!=null;
    }
}
