package ru.job4j.list;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserConvertTest {

    @Test
    public void whenListUserThenHashMapUser() {
        UserConvert userConvert = new UserConvert();
        User man = new User(3, "Andrey", "Moscow");
        User woman = new User(5, "Elena", "New York");
        User girl = new User(1, "Maria", "London");
        List<User> users = Arrays.asList(man, woman, girl);
        HashMap<Integer, User> result = userConvert.process(users);
        HashMap<Integer, User> expect = new HashMap<>(Map.of(3, man, 5, woman, 1, girl));
        assertThat(result, is(expect));
    }

}