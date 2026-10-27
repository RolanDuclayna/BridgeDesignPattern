public class OnlinePaymentNotification implements PaymentType{
    @Override
    public void paymentMessage() {
        System.out.println("Paid online");
    }
}
