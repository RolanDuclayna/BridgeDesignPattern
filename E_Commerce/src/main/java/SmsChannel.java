public class SmsChannel extends E_CommerceCompany{

    public SmsChannel(PaymentType payment) {
        this.payment = payment;
    }

    @Override
    public void printMessage() {
        System.out.println("This is the SMS Channel.");
        payment.paymentMessage();
    }
}
