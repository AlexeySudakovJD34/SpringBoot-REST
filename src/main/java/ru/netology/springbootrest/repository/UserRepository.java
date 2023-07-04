package ru.netology.springbootrest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springbootrest.model.Authorities;
import ru.netology.springbootrest.model.User;

import java.util.*;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(User user) {

        //для тестирования
        List<User> testUsers = List.of(
                new User("Alexey", "123456", List.of(Authorities.READ, Authorities.DELETE)),
                new User("Sergey", "1231111", List.of(Authorities.WRITE, Authorities.DELETE)),
                new User("Semen", "123456", List.of(Authorities.DELETE))
        );

        for (User testUser : testUsers) {
            if (testUser.getUser().equals(user.getUser()) & testUser.getPassword().equals(user.getPassword())) {
                return testUser.getAuthoritiesList();
            }
        }
        return Collections.emptyList();
    }
}
