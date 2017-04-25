package org.cris.polomessage;

/**
 * Created by owen on 2017/4/25.
 */
public class Register {
    private Payment payment;
    public void setPayment(Payment payment){
        this.payment = payment;
    }
    public void doX(){
        payment.authorize();
    }
}
