package uz.temur.effectivejava.chapter2.item1.advantage5;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe orqali to'lov amalga oshirildi: " + amount);
    }
}
