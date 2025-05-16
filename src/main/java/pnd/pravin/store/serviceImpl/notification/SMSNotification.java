package pnd.pravin.store.serviceImpl.notification;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import pnd.pravin.store.service.notification.NotificationService;

@Service("sms")
public class SMSNotification implements NotificationService {
    private static final Logger log = LogManager.getLogger(SMSNotification.class);

    public void sendNotification(String message, String email) {
        log.info("Sending SMS Notification");
        log.info("SMS Sent: {}", message);
    }
}
