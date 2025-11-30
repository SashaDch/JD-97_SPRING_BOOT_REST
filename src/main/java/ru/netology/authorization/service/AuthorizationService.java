package ru.netology.authorization.service;

import org.springframework.stereotype.Service;
import ru.netology.authorization.data.User;
import ru.netology.authorization.exception.UnauthorizedUser;
import ru.netology.authorization.repository.UserRepository;
import ru.netology.authorization.user.Authorities;

import java.util.List;

@Service
public class AuthorizationService {
    UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(User user) {
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user \"" + user + "\" or wrong credentials!");
        }
        return userAuthorities;
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
