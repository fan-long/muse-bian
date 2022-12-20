/*The operation of a payment rail for a bounded period of time.*/
package org.museframework.bian.classes;

public class PaymentRailOperatingSession {
    /**/
    private Function paymentRailOperatingSessionFunction;

    public void setPaymentRailOperatingSessionFunction(Function paymentRailOperatingSessionFunction) {
        this.paymentRailOperatingSessionFunction = paymentRailOperatingSessionFunction;
    }

    public Function getPaymentRailOperatingSessionFunction() {
        return paymentRailOperatingSessionFunction;
    }
}