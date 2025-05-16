package pnd.pravin.store.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pnd.pravin.store.entity.User;
import pnd.pravin.store.repository.UserRepository;
import pnd.pravin.store.service.notification.NotificationService;

@Service
public class UserService {

    private final NotificationService notificationService;
    private final UserRepository userRepository;


    public UserService(@Qualifier("email") NotificationService notificationService,
                       UserRepository userRepository) {
        this.notificationService = notificationService;
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        userRepository.save(user);
        notificationService.sendNotification("User added", user.getEmail());
    }
}
