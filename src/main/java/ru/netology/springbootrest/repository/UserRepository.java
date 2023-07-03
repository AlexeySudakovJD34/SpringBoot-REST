package ru.netology.springbootrest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springbootrest.model.Authorities;
import ru.netology.springbootrest.model.User;

import java.util.*;

@Repository
public class UserRepository {
    public Map<User, List<Authorities>> authorities = new HashMap<>();
    public List<Authorities> getUserAuthorities(User user) {

        //для тестирования
        User testUser = new User();
        testUser.setUser("Alexey");
        testUser.setPassword("123456");

        List<Authorities> testAuthorities = new ArrayList<>();
        testAuthorities.add(Authorities.READ);
        testAuthorities.add(Authorities.WRITE);
        testAuthorities.add(Authorities.DELETE);
        authorities.put(testUser, testAuthorities);

        if(user.getPassword().equals("123456")) {
            return authorities.get(user);
        }
        return Collections.emptyList();
    }
}
