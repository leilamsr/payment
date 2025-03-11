import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer customer1 = new RegularCustomer("Laila");
        RegularCustomer customer2 = new RegularCustomer("Faegheh");
        RegularCustomer customer3 = new RegularCustomer("Goli");

        PayPalPayment payPalPayment = new PayPalPayment("Leila.m2006131@gmail.com");
        BitcoinPayment bitcoinPayment = new BitcoinPayment("leilamsr");
        CreditCardPayment creditCardPayment = new CreditCardPayment("1234", "Faegheh");

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        customer1.makePayment(bitcoinPayment,100);
        customer1.makePayment(creditCardPayment,200);
        customer2.makePayment(creditCardPayment,300);
        customer2.makePayment(payPalPayment,400);
        customer3.makePayment(payPalPayment,500);
        customer3.makePayment(bitcoinPayment,600);

        customer1.showPaymentHistory();
        customer2.showPaymentHistory();
        customer3.showPaymentHistory();
    }

}