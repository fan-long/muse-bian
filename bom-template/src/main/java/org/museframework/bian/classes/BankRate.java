/*A reference value for a price variable, defined by the Bank 

A BankRate is used to define the actual rate to apply in transactions and in negotiations for product sales agreements. */
package org.museframework.bian.classes;

public class BankRate {
    /*Classification of the BankRate according to 
- the role the Rate plays in product features, such as Interest rate, currency or Stock price... 
- mean over a period (for bookkeeping), fixed for a day (for retail use), instantaneous (for corporate transactions) ...


to be elaborated... */
    private String bankRateType;

    /**/
    private String attribute;

    /*Value or value range of the BankRate*/
    private String bankRateValue;

    public void setBankRateType(String bankRateType) {
        this.bankRateType = bankRateType;
    }

    public String getBankRateType() {
        return bankRateType;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setBankRateValue(String bankRateValue) {
        this.bankRateValue = bankRateValue;
    }

    public String getBankRateValue() {
        return bankRateValue;
    }
}