package pnd.pravin.store.serviceImpl.payment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pnd.pravin.store.service.payment.PaymentService;

import java.util.List;

//@Service("paytm")
//@Primary
public class PayTmService implements PaymentService {

    @Value("${paytm.apiUrl}")
    private String apiUrl;

    @Value("${paytm.enabled}")
    private boolean enabled;

    @Value("${paytm.supported-currencies}")
    private List<String> supportedCurrencies;

    @Value("${paytm.timeout}")
    private long timeout;

    public final void processPayment(int amount){
        System.out.println("PayTM");
        System.out.println("Amount: " + amount);
        System.out.println("Timeout: " + timeout);
        System.out.println("API URL: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("SupportedCurrencies: " + supportedCurrencies);
    }
}
