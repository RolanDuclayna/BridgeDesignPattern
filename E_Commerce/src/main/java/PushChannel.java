public class PushChannel extends E_CommerceCompany {

    public PushChannel(PaymentType payment) {
        this.payment = payment;
    }

    @Override
    public void printMessage() {
        System.out.print("This is the Push Channel. ");
        payment.paymentMessage();
    }
}
