package org.cris.polomessage;

/**
 * Created by owen on 2017/4/25.
 */
public class CreditPayment extends Payment {
    private Bar bar;
    public void authorize(){
        bar = new Bar();
        bar.doX();
    }
}
