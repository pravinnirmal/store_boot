package pnd.pravin.store.repository;

import org.springframework.stereotype.Repository;
import pnd.pravin.store.entity.User;

import java.lang.annotation.Annotation;

public interface UserRepository{
    void save(User user);

}
