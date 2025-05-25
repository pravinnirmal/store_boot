package pnd.pravin.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pnd.pravin.store.model.NotificationManager;
import pnd.pravin.store.model.OrderService;
import pnd.pravin.store.repository.InMemoryUserRepository;
import pnd.pravin.store.repository.UserRepository;
import pnd.pravin.store.service.UserService;
import pnd.pravin.store.service.notification.NotificationService;
import pnd.pravin.store.service.payment.PaymentService;
import pnd.pravin.store.serviceImpl.notification.EmailNotification;
import pnd.pravin.store.serviceImpl.notification.SMSNotification;
import pnd.pravin.store.serviceImpl.payment.PayTmService;
import pnd.pravin.store.serviceImpl.payment.PaypalService;

@Configuration
public class AppConfig {

    @Value("${order.payment-service}")
    private String paymentMethod;

    @Value("${notification.channel}")
    private String notificationSource;

    private NotificationService notificationService;


    @Bean
    public PaymentService paypal(){
        return new PaypalService();
    }

    @Bean
    public PaymentService paytm(){
        return new PayTmService();
    }

    @Bean
    public OrderService order(){
        if (paymentMethod.equals("paypal")){
            return new OrderService(paypal());
        }
        return new OrderService(paytm());
    }

    @Bean
    public UserRepository inMemoryUserRepository(){
        return new InMemoryUserRepository();
    }

    @Bean
    public NotificationManager notificationManager(){
        if (notificationSource.equals("sms")) {
            notificationService = new SMSNotification();
            return new NotificationManager(sms());
        }
        notificationService = new EmailNotification();
        return new NotificationManager(email());
    }

    @Bean
    public SMSNotification sms(){
        return new SMSNotification();
    }

    @Bean
    public EmailNotification email(){
        return new EmailNotification();
    }

    @Bean
    public UserService userService(){
        return new UserService(notificationService, inMemoryUserRepository());
    }
}
