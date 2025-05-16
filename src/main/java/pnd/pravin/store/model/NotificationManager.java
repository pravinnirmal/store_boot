package pnd.pravin.store.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pnd.pravin.store.service.notification.NotificationService;

@Service
public class NotificationManager {

    private final NotificationService notificationService;

    public NotificationManager (NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void sendNotification(String message, String email) {
        notificationService.sendNotification(message, email);
    }
}
