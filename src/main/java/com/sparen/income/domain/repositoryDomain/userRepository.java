package com.sparen.income.domain.repositoryDomain;

import com.sparen.income.domain.models.People;
import com.sparen.income.domain.models.Users;

public interface userRepository {
    public Users saveUser(People people);
    public Users updateUser(Users users);

}
