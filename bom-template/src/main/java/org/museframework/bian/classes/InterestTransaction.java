/*A transaction which is the result of fulfilment of an interest arrangement*/
package org.museframework.bian.classes;

public class InterestTransaction {
    /*Amount of applied interest*/
    private String interestTransactionAmount;

    /*Description of InterestTransaction*/
    private String interestTransactionDescription;

    /*A classification of InterestTransaction eg., Allocation Transaction, Payment Transaction, adjustment Transaction and etc. */
    private org.museframework.bian.enumerations.Interesttransactiontypevalues interestTransactionType;

    /*The actual interest rate used for the payment of the interest for the specified interest period. (ISO20022)*/
    private String interestRate;

    /*Type of an applied Interest

Specifies the type of interest associated with a trade. (ISO20022)*/
    private String interetType;

    public void setInterestTransactionAmount(String interestTransactionAmount) {
        this.interestTransactionAmount = interestTransactionAmount;
    }

    public String getInterestTransactionAmount() {
        return interestTransactionAmount;
    }

    public void setInterestTransactionDescription(String interestTransactionDescription) {
        this.interestTransactionDescription = interestTransactionDescription;
    }

    public String getInterestTransactionDescription() {
        return interestTransactionDescription;
    }

    public void setInterestTransactionType(org.museframework.bian.enumerations.Interesttransactiontypevalues interestTransactionType) {
        this.interestTransactionType = interestTransactionType;
    }

    public org.museframework.bian.enumerations.Interesttransactiontypevalues getInterestTransactionType() {
        return interestTransactionType;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInteretType(String interetType) {
        this.interetType = interetType;
    }

    public String getInteretType() {
        return interetType;
    }
}