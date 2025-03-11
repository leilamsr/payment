package payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer(String name) {}
    public abstract void displayCustomerInfo();
    public void makePayment(PaymentStrategy paymentStrategy, double amount) {}
    public  void showPaymentHistory() {}
}
