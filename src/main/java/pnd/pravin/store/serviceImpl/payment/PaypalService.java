package pnd.pravin.store.serviceImpl.payment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pnd.pravin.store.service.payment.PaymentService;

import java.util.List;

//@Service("paypal")
public class PaypalService implements PaymentService {

    @Value("${paypal.apiUrl}")
    private String apiUrl;

    @Value("${paypal.enabled}")
    private boolean enabled;

    @Value("${paypal.supported-currencies}")
    private List<String> supportedCurrencies;

    @Value("${paypal.timeout}")
    private long timeout;

    public final void processPayment(int amount){
        System.out.println("PayPal");
        System.out.println("Amount: " + amount);
        System.out.println("Timeout: " + timeout);
        System.out.println("API URL: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("SupportedCurrencies: " + supportedCurrencies);
    }
}
