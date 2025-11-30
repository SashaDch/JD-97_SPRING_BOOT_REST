package ru.netology.authorization.repository;

import ru.netology.authorization.data.User;
import ru.netology.authorization.user.Authorities;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    private final Map<User, List<Authorities>> users = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(User user) {
        var debug = users.containsKey(user);
        return users.get(user);
    }

    public Map<User, List<Authorities>> getUsers() {
        return users;
    }
}