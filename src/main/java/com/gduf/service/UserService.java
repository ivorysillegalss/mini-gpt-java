package com.gduf.service;

import com.gduf.pojo.user.UserValue;
import com.gduf.pojo.user.UserWithValue;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {
    String login(String username, String password);

    int register(String username, String password, String email);

    boolean picUpload(String base64ImageData, String token);

    UserWithValue showUser(String token);

    boolean updateUser(UserValue userValue, String token);

    boolean userInitialization(String email,String code);

    boolean resetPasswordCode(String email,String code);

    boolean resetPassword(String token,String passwordReset);

    boolean verifyAccount(String token, String beforePassword, String afterPassword);

    UserWithValue showUser(Integer userId);
}
