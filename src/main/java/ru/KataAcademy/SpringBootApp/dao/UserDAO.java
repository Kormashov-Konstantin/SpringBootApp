package ru.KataAcademy.SpringBootApp.dao;



import ru.KataAcademy.SpringBootApp.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

    User oneUser(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void removeUserById(int id);
}
