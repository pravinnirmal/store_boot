package pnd.pravin.store.serviceImpl.notification;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pnd.pravin.store.service.notification.NotificationService;

@Service("email")
@Primary
public class EmailNotification implements NotificationService {

    private static final Logger log = LogManager.getLogger(EmailNotification.class);

    @Value("${spring.application.host}")
    private String host;
    @Value("${spring.application.port}")
    private String port;

    public void sendNotification(String message, String email) {
        log.info("Sending Email Notification");
        log.info("Email Message: {}", message);
        log.info("Email Recipient: {}", email);
        System.out.println("Email Sent from: " + host + ":" + port);
    }
}
