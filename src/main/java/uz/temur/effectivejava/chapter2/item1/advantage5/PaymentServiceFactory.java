package uz.temur.effectivejava.chapter2.item1.advantage5;

public class PaymentServiceFactory {
    public static PaymentService getPaymentService(String provider) {
        return switch (provider) {
            case "PayPal" -> new PayPalPaymentService();
            case "Stripe" -> new StripePaymentService();
            default -> throw new IllegalArgumentException("Not known provider: " + provider);
        };
    }
}
