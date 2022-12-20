/*The money in the form of coins or banknotes-that can be used to exchange goods, debt, or services. 

Comment:
Cash is the legally recognized money within a given political jurisdiction. (Investopedia)*/
package org.museframework.bian.classes;

public class Cash {
    /**/
    private String cashAmount;

    /**/
    private String cashCurrency;

    /**/
    private String cashDenomination;

    public void setCashAmount(String cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getCashAmount() {
        return cashAmount;
    }

    public void setCashCurrency(String cashCurrency) {
        this.cashCurrency = cashCurrency;
    }

    public String getCashCurrency() {
        return cashCurrency;
    }

    public void setCashDenomination(String cashDenomination) {
        this.cashDenomination = cashDenomination;
    }

    public String getCashDenomination() {
        return cashDenomination;
    }
}