package com.BackEnd.MathStoreOnline2.service.user;

import com.BackEnd.MathStoreOnline2.dto.SingupDTO;
import com.BackEnd.MathStoreOnline2.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    UserDTO createUser(SingupDTO singupDTO);

    boolean hasUserWithRmail(String email);
}
