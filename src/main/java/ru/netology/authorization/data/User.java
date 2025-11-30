package ru.netology.authorization.data;

import ru.netology.authorization.user.Authorities;

import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Authorities> authorities;

    public User(String username, String password,  List<Authorities> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authorities> authorities) {
        this.authorities = authorities;
    }
}
