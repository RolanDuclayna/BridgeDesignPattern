public class BitcoinPayment implements PaymentType {
    @Override
    public void paymentMessage() {
        System.out.println("Paid with Bitcoin");
    }
}
