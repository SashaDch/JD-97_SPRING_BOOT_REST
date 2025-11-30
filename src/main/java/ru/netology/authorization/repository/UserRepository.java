package ru.netology.authorization.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorization.data.User;
import ru.netology.authorization.user.Authorities;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    private final Map<String, User> users = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        User usr = users.get(user);
        if (usr == null || !usr.getPassword().equals(password)) {
            return Collections.emptyList();
        }
        return usr.getAuthorities();
    }

    public Map<String, User> getUsers() {
        return users;
    }
}