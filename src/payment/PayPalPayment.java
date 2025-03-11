package payment;

public class PayPalPayment implements PaymentStrategy {
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " to PayPal");
    }

    @Override
    public String getPaymentDetails() {
        return "Paid by PayPal. email : " + email;
    }

}

