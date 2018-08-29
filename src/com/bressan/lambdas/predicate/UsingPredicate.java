package com.bressan.lambdas.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UsingPredicate {
    public static void main(String[] args) {
        User u1 = new User("Mario Bressan", 150);
        User u2 = new User("Jose da Silva", 120);
        User u3 = new User("Renata Oliveira", 190);

        List<User> users = Arrays.asList(u1, u2, u3);

        Consumer<User> showMessage = u -> System.out.println("before printing the names");

        Consumer<User> printName = u -> System.out.println(u.getName());

        users.forEach(showMessage.andThen(printName));

        List<User> users2 = new ArrayList<>();

        users2.addAll(users);


        Predicate<User> predicate = new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return user.getPoints() > 160;
            }
        };

        users2.removeIf(predicate);

        users2.forEach(u -> System.out.println(u));
    }
}
