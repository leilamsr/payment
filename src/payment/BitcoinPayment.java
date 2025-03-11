package payment;

public class BitcoinPayment implements PaymentStrategy {
    String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println(walletAddress + ": Paying Bitcoin");
    }

    @Override
    public String getPaymentDetails() {
        return "Paid by Bitcoin. Wallet address: " + walletAddress;
    }
}
