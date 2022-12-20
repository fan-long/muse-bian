/**/
package org.museframework.bian.creditcard.dto.bq;

public class Repayment {
    /*The billing instance*/
    private String repaymentTransaction;

    /*The type of repayment (e.g. scheduled repayment linked to associated billing record, ad-hoc repayment)*/
    private String repaymentTransactionType;

    /*Reference to the associated bill for which this can be full or partial repayment)*/
    private org.museframework.bian.classes.Object billingInstanceReference;

    /*Reference to the payer*/
    private org.museframework.bian.classes.Object repaymentTransactionPayerReference;

    /*Reference to the account where the payment is made from*/
    private org.museframework.bian.classes.Object repaymentTransactionPayerProductInstanceReference;

    /*Reference to the payer's bank*/
    private org.museframework.bian.classes.Object repaymentTransactionPayerBankReference;

    /*The amount of the repayment*/
    private String repaymentTransactionAmount;

    /*The currency used for the repayment*/
    private String repaymentTransactionCurrency;

    /*The value date for the repayment transaction*/
    private String repaymentTransactionValueDate;

    public void setRepaymentTransaction(String repaymentTransaction) {
        this.repaymentTransaction = repaymentTransaction;
    }

    public String getRepaymentTransaction() {
        return repaymentTransaction;
    }

    public void setRepaymentTransactionType(String repaymentTransactionType) {
        this.repaymentTransactionType = repaymentTransactionType;
    }

    public String getRepaymentTransactionType() {
        return repaymentTransactionType;
    }

    public void setBillingInstanceReference(org.museframework.bian.classes.Object billingInstanceReference) {
        this.billingInstanceReference = billingInstanceReference;
    }

    public org.museframework.bian.classes.Object getBillingInstanceReference() {
        return billingInstanceReference;
    }

    public void setRepaymentTransactionPayerReference(org.museframework.bian.classes.Object repaymentTransactionPayerReference) {
        this.repaymentTransactionPayerReference = repaymentTransactionPayerReference;
    }

    public org.museframework.bian.classes.Object getRepaymentTransactionPayerReference() {
        return repaymentTransactionPayerReference;
    }

    public void setRepaymentTransactionPayerProductInstanceReference(org.museframework.bian.classes.Object repaymentTransactionPayerProductInstanceReference) {
        this.repaymentTransactionPayerProductInstanceReference = repaymentTransactionPayerProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getRepaymentTransactionPayerProductInstanceReference() {
        return repaymentTransactionPayerProductInstanceReference;
    }

    public void setRepaymentTransactionPayerBankReference(org.museframework.bian.classes.Object repaymentTransactionPayerBankReference) {
        this.repaymentTransactionPayerBankReference = repaymentTransactionPayerBankReference;
    }

    public org.museframework.bian.classes.Object getRepaymentTransactionPayerBankReference() {
        return repaymentTransactionPayerBankReference;
    }

    public void setRepaymentTransactionAmount(String repaymentTransactionAmount) {
        this.repaymentTransactionAmount = repaymentTransactionAmount;
    }

    public String getRepaymentTransactionAmount() {
        return repaymentTransactionAmount;
    }

    public void setRepaymentTransactionCurrency(String repaymentTransactionCurrency) {
        this.repaymentTransactionCurrency = repaymentTransactionCurrency;
    }

    public String getRepaymentTransactionCurrency() {
        return repaymentTransactionCurrency;
    }

    public void setRepaymentTransactionValueDate(String repaymentTransactionValueDate) {
        this.repaymentTransactionValueDate = repaymentTransactionValueDate;
    }

    public String getRepaymentTransactionValueDate() {
        return repaymentTransactionValueDate;
    }
}