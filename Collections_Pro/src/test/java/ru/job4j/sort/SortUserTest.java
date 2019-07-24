
package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {

    @Test
    public void whenSortListThenTreeSet() {
        List<User> list = List.of(new User("Andrey", 27),
                new User("Alex", 25));
        Set<User> expect = Set.of(new User("Andrey", 27),
                new User("Alex", 25));
        assertThat(new SortUser().sort(list), is(expect));
    }
}