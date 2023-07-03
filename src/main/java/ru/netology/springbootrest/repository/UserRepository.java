package ru.netology.springbootrest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springbootrest.model.Authorities;

import java.util.*;

@Repository
public class UserRepository {
    public Map<String,String> credentials = new HashMap<>();
    public Map<String, List<Authorities>> authorities = new HashMap<>();
    public List<Authorities> getUserAuthorities(String user, String password) {

        //для тестирования
        String testUsername = "Alexey";
        String testPassword = "12345";
        List<Authorities> testAuthorities = new ArrayList<>();
        testAuthorities.add(Authorities.READ);
        testAuthorities.add(Authorities.WRITE);
        testAuthorities.add(Authorities.DELETE);
        credentials.put(testUsername, testPassword);
        authorities.put(testUsername, testAuthorities);

        if(credentials.get(user).equals(password)) {
            return authorities.get(user);
        }
        return Collections.emptyList();
    }
}
