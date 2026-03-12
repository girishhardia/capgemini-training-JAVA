package org.tyss.service;

import org.tyss.model.User;
import java.util.List;

public interface UserService {
    List<User> listUsers();
    User getUserById(Long id);
    void addUser(User user);
}
