/*The operation of a Trade Matching system*/
package org.museframework.bian.classes;

public class TradeMatchingOperatingSession {
    /**/
    private Function tradeMatchingOperatingSessionFunction;

    /**/
    private org.museframework.bian.enumerations.Tradematchingoperatingsessionfunctiontype tradeMatchingOperatingSessionFunctionType;

    public void setTradeMatchingOperatingSessionFunction(Function tradeMatchingOperatingSessionFunction) {
        this.tradeMatchingOperatingSessionFunction = tradeMatchingOperatingSessionFunction;
    }

    public Function getTradeMatchingOperatingSessionFunction() {
        return tradeMatchingOperatingSessionFunction;
    }

    public void setTradeMatchingOperatingSessionFunctionType(org.museframework.bian.enumerations.Tradematchingoperatingsessionfunctiontype tradeMatchingOperatingSessionFunctionType) {
        this.tradeMatchingOperatingSessionFunctionType = tradeMatchingOperatingSessionFunctionType;
    }

    public org.museframework.bian.enumerations.Tradematchingoperatingsessionfunctiontype getTradeMatchingOperatingSessionFunctionType() {
        return tradeMatchingOperatingSessionFunctionType;
    }
}