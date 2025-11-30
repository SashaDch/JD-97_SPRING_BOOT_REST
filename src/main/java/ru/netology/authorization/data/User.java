package ru.netology.authorization.data;

import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

public class User {
    @NotBlank
    private String user;

    @NotBlank
    private String password;

    public User() {
    }

    public User(String user, String password) {
        if (user == null || password == null) throw new NullPointerException();
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        if (user == null) throw new NullPointerException();
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) throw new NullPointerException();
        this.password = password;
    }

    @Override
    public String toString() {
        return user;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ((User)obj).getUser().equals(this.getUser()) && ((User)obj).getPassword().equals(this.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password);
    }
}
