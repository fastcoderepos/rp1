package com.fastcode.example.domain.extended.authorization.user;

import com.fastcode.example.domain.core.authorization.user.IUserRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepositoryExtended")
public interface IUserRepositoryExtended extends IUserRepository {
    //Add your custom code here
}
