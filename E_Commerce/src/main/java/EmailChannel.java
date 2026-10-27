public class EmailChannel extends E_CommerceCompany {

    public EmailChannel(PaymentType payment) {
        this.payment = payment;
    }

    @Override
    public void printMessage() {
        System.out.println("This is the Email Channel.");
        payment.paymentMessage();
    }
}
