package uz.temur.effectivejava.chapter2.item1.advantage5;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal orqali to'lov amalga oshirildi: " + amount);
    }
}
