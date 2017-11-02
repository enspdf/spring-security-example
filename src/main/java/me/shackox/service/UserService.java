package me.shackox.service;

import me.shackox.model.User;

/**
 * Created by SHACKOX on 31/10/17.
 */

public interface UserService {
    public User findUserByEmail (String email);
    public void saveUser (User user);
}
