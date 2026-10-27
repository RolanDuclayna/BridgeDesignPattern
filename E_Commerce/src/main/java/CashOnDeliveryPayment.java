public class CashOnDeliveryPayment implements PaymentType{
    @Override
    public void paymentMessage() {
        System.out.println("Paid with Cash on Delivery");
    }
}
