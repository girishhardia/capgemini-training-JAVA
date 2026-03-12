package org.tyss.repository;

import org.tyss.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepositoryImpl() {
        users.add(new User(1L, "Girish", "girish@example.com"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void save(User user) {
        if (user.getId() == null) {
            user.setId((long) (users.size() + 1));
        }
        users.add(user);
    }
}
