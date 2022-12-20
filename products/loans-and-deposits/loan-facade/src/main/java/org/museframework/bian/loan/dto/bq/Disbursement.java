/**/
package org.museframework.bian.loan.dto.bq;

public class Disbursement {
    /*Reference to the party to whom the payment is made*/
    private org.museframework.bian.classes.Object disbursementPayeeReference;

    /*Reference to the account to which the payment is made*/
    private org.museframework.bian.classes.Object disbursementPayeeProductInstanceReference;

    /*Reference to the bank where the payee account is held*/
    private org.museframework.bian.classes.Object disbursementPayeeBankReference;

    /*The amount of the payment*/
    private String disbursementAmount;

    /*The currency of the payment*/
    private String disbursementCurrency;

    /*The value date for the payment transaction*/
    private String disbursementValueDate;

    public void setDisbursementPayeeReference(org.museframework.bian.classes.Object disbursementPayeeReference) {
        this.disbursementPayeeReference = disbursementPayeeReference;
    }

    public org.museframework.bian.classes.Object getDisbursementPayeeReference() {
        return disbursementPayeeReference;
    }

    public void setDisbursementPayeeProductInstanceReference(org.museframework.bian.classes.Object disbursementPayeeProductInstanceReference) {
        this.disbursementPayeeProductInstanceReference = disbursementPayeeProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getDisbursementPayeeProductInstanceReference() {
        return disbursementPayeeProductInstanceReference;
    }

    public void setDisbursementPayeeBankReference(org.museframework.bian.classes.Object disbursementPayeeBankReference) {
        this.disbursementPayeeBankReference = disbursementPayeeBankReference;
    }

    public org.museframework.bian.classes.Object getDisbursementPayeeBankReference() {
        return disbursementPayeeBankReference;
    }

    public void setDisbursementAmount(String disbursementAmount) {
        this.disbursementAmount = disbursementAmount;
    }

    public String getDisbursementAmount() {
        return disbursementAmount;
    }

    public void setDisbursementCurrency(String disbursementCurrency) {
        this.disbursementCurrency = disbursementCurrency;
    }

    public String getDisbursementCurrency() {
        return disbursementCurrency;
    }

    public void setDisbursementValueDate(String disbursementValueDate) {
        this.disbursementValueDate = disbursementValueDate;
    }

    public String getDisbursementValueDate() {
        return disbursementValueDate;
    }
}