package ru.job4j.sort;

import java.util.*;

public class SortUser {

    public Set<User> sort(List<User> users) {
        return new TreeSet<>(users);
    }

    public List<User> sortNameLength(List<User> users) {
        users.sort((o1, o2) -> Integer.compare(o2.getName().length(), o1.getName().length()));

        return users;
    }

    public List<User> sortByAllFields(List<User> users) {
        users.sort(Comparator.comparing(User::getName).thenComparingInt(User::getAge));
        return users;
    }
}
