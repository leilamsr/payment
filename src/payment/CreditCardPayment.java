package payment;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount){
        System.out.println(amount + " paid for " + cardHolderName);
    }

    @Override
    public String getPaymentDetails() {
        return "Paid by Creaditcart. cardNumber : " + cardNumber + "Name : " + cardHolderName;
    }
}
