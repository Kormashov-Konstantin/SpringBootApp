package ru.KataAcademy.SpringBootApp.service;



import ru.KataAcademy.SpringBootApp.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User oneUser(int id);

    void saveUser(User user);

    void updateUserById(int id, User updatedUser);

    void removeUserById(int id);

}
