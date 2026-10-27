public class SmsChannel extends E_CommerceCompany{

    public SmsChannel(PaymentType payment) {
        this.payment = payment;
    }

    @Override
    public void printMessage() {
        System.out.print("This is the SMS Channel. ");
        payment.paymentMessage();
    }
}
