package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(long id);
    void saveUser(User user);
    void deleteUser(User user);
    User updateUser(User user);
    //void deleteUserById(Long id);
}
