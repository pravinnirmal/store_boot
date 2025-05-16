package pnd.pravin.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pnd.pravin.store.entity.User;
import pnd.pravin.store.service.UserService;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//
//        OrderService orderService = new OrderService(new PaypalServiceImpl());
        ApplicationContext ctx = SpringApplication.run(StoreApplication.class, args);
//        var orderService = ctx.getBean(OrderService.class);
//        orderService.processOrder();

        var userService = ctx.getBean(UserService.class);
        userService.registerUser(
                new User(
                        "Pravin",
                        "pnd",
                        "abc@gmail.com",
                        0
                )
        );

        userService.registerUser(
                new User(
                        "Pravin",
                        "pnd",
                        "abc@gmail.com",
                        0
                )
        );

//        NotificationManager notificationManager = ctx.getBean(NotificationManager.class);
//        notificationManager.sendNotification("Hello Pravin");
    }

}
