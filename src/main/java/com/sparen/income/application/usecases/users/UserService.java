package com.sparen.income.application.usecases.users;

import com.sparen.income.application.dtos.RegisterUserDto;
import org.apache.catalina.User;

public interface UserService {

    public RegisterUserDto registerUser(User user);

}
