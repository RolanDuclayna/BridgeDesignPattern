import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E_CommerceCompanyTesting {

    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @BeforeEach
    void setUp() {
        originalOutput = System.out;
        output = new ByteArrayOutputStream();

        System.setOut(new PrintStream(output));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOutput);
    }
    EmailChannel email = new EmailChannel(new CashOnDeliveryPayment());
    SmsChannel sms = new SmsChannel(new OnlinePaymentNotification());
    OnlinePaymentNotification online = new OnlinePaymentNotification();
    CashOnDeliveryPayment cash = new CashOnDeliveryPayment();
    BitcoinPayment bitcoin = new BitcoinPayment();

    @Test
    public void testEmail() {
        String expected = "This is the Email Channel. Paid with Cash on Delivery" + System.lineSeparator();
        email.printMessage();
        assertEquals(expected, output.toString());

    }

    @Test
    public void testSms() {
        String expected = "This is the SMS Channel. Paid online" + System.lineSeparator();
        sms.printMessage();
        assertEquals(expected, output.toString());
    }

    @Test
    public void testOnlinePayment() {
        String expected = "Paid online" + System.lineSeparator();
        online.paymentMessage();
        assertEquals(expected, output.toString());
    }

    @Test
    public void testCashPayment() {
        String expected = "Paid with Cash on Delivery" + System.lineSeparator();
        cash.paymentMessage();
        assertEquals(expected, output.toString());
    }

    @Test
    public void testBitcoinPayment() {
        String expected = "Paid with Bitcoin" + System.lineSeparator();
        bitcoin.paymentMessage();
        assertEquals(expected, output.toString());
    }
}
