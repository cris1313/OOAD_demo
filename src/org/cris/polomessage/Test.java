package org.cris.polomessage;

/**
 * Created by owen on 2017/4/25.
 */
public class Test {
    public static void main(String[] args) {
        Register register = new Register();
        register.setPayment(new CreditPayment());
        register.doX();
        register.setPayment(new DebitPayment());
        register.doX();
    }
}
