package ru.KataAcademy.SpringBootApp.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.KataAcademy.SpringBootApp.dao.UserDAO;
import ru.KataAcademy.SpringBootApp.model.User;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public User oneUser(int id) {
        return userDAO.oneUser(id);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.save(user);
    }

    @Transactional
    @Override
    public void updateUserById(int id, User updatedUser) {
        userDAO.update(id,updatedUser);
    }

    @Transactional
    @Override
    public void removeUserById(int id) {
        userDAO.removeUserById(id);
    }
}
