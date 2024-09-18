package uz.temur.effectivejava.chapter2.item1.advantage5;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = PaymentServiceFactory.getPaymentService("PayPal");
        paymentService.processPayment(100);

        PaymentService anotherService = PaymentServiceFactory.getPaymentService("Stripe");
        anotherService.processPayment(200.0);
    }
}
