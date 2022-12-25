/**/
package org.museframework.bian.consumerloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Repayment {
    /*The type of repayment (e.g. scheduled repayment, balloon/early termination)*/
    @MetaField(0)
    private String repaymentTransactionType;

    /*Reference to the payer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object repaymentTransactionPayerReference;

    /*Reference to the account where the payment is made from*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object repaymentTransactionPayerProductInstanceReference;

    /*Reference to the payer's bank*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object repaymentTransactionPayerBankReference;

    /*The amount of the repayment*/
    @MetaField(0)
    private String repaymentTransactionAmount;

    /*The currency used for the repayment*/
    @MetaField(0)
    private String repaymentTransactionCurrency;

    /*The value date for the repayment transaction*/
    @MetaField(0)
    private String repaymentTransactionValueDate;

    public void setRepaymentTransactionType(String repaymentTransactionType) {
        this.repaymentTransactionType = repaymentTransactionType;
    }

    public String getRepaymentTransactionType() {
        return repaymentTransactionType;
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