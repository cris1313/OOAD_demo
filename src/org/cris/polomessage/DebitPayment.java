package org.cris.polomessage;

/**
 * Created by owen on 2017/4/25.
 */
public class DebitPayment extends Payment {
    private Foo foo;
    public void authorize(){
        foo = new Foo();
        foo.doA();
        foo.doB();
    }
}
