package pnd.pravin.store.repository;

import pnd.pravin.store.entity.User;

import java.util.HashMap;


public class InMemoryUserRepository implements UserRepository {

    HashMap<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.putIfAbsent(user.getEmail(), user);
        System.out.println("Saved user: " + users.get(user.getEmail()));
    }
}
