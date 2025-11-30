package ru.netology.authorization.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.authorization.data.User;
import ru.netology.authorization.repository.UserRepository;
import ru.netology.authorization.user.Authorities;

import java.util.List;
import java.util.Map;

@Configuration
public class JavaConfig {
    @Bean
    public UserRepository userRepository() {
        var rep = new UserRepository();
        rep.getUsers().putAll(Map.of(
                "admin", new User("admin", "admin", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE)),
                "user", new User("user", "password", List.of(Authorities.READ)),
                "aboba", new User("aboba", "zigota", List.of())
        ));
        return rep;
    }
}
