public class E_CommerceDriver {
    public static void main(String[] args) {
        EmailChannel emailWithOnline = new EmailChannel(new OnlinePaymentNotification());
        SmsChannel smsWithOnline = new SmsChannel(new OnlinePaymentNotification());
        EmailChannel emailWithCash = new EmailChannel(new CashOnDeliveryPayment());
        SmsChannel smsWithCash = new SmsChannel(new CashOnDeliveryPayment());
        EmailChannel emailWithBitcoin = new EmailChannel(new BitcoinPayment());
        SmsChannel smsWithBitcoin = new SmsChannel(new BitcoinPayment());

        emailWithCash.printMessage();
        smsWithOnline.printMessage();
        emailWithCash.printMessage();
        smsWithCash.printMessage();
        emailWithBitcoin.printMessage();
        smsWithBitcoin.printMessage();
    }
}
