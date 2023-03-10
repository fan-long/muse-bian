/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Commissions. 
Example: Execute a payment transaction.*/
package org.museframework.bian.commissions.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CommissionTransaction
@MetaDto
public class CommissionTransaction {
    /*A Classification value that distinguishes between business service transaction within Commission Transaction*/
    @MetaField(0)
    private String commissionTransactionParameterType;

    /*A selected optional business service as subject matter of Commission Transaction*/
    @MetaField(0)
    private String commissionTransactionSelectedOption;

    /*The status of Commission Transaction*/
    @MetaField(0)
    private String commissionTransactionStatus;

    /*A Classification value that specifies type of business action for this  Commission Transaction*/
    @MetaField(0)
    private String commissionTransactionType;

    /*A Classification value that specifies type of transaction for this  Commission Transaction*/
    @MetaField(0)
    private String commissionTransactionTransactionType;

    /*Reference to Commission Transaction*/
    @MetaField(0)
    private String commissionTransactionTransaction;

    public void setCommissionTransactionParameterType(String commissionTransactionParameterType) {
        this.commissionTransactionParameterType = commissionTransactionParameterType;
    }

    public String getCommissionTransactionParameterType() {
        return commissionTransactionParameterType;
    }

    public void setCommissionTransactionSelectedOption(String commissionTransactionSelectedOption) {
        this.commissionTransactionSelectedOption = commissionTransactionSelectedOption;
    }

    public String getCommissionTransactionSelectedOption() {
        return commissionTransactionSelectedOption;
    }

    public void setCommissionTransactionStatus(String commissionTransactionStatus) {
        this.commissionTransactionStatus = commissionTransactionStatus;
    }

    public String getCommissionTransactionStatus() {
        return commissionTransactionStatus;
    }

    public void setCommissionTransactionType(String commissionTransactionType) {
        this.commissionTransactionType = commissionTransactionType;
    }

    public String getCommissionTransactionType() {
        return commissionTransactionType;
    }

    public void setCommissionTransactionTransactionType(String commissionTransactionTransactionType) {
        this.commissionTransactionTransactionType = commissionTransactionTransactionType;
    }

    public String getCommissionTransactionTransactionType() {
        return commissionTransactionTransactionType;
    }

    public void setCommissionTransactionTransaction(String commissionTransactionTransaction) {
        this.commissionTransactionTransaction = commissionTransactionTransaction;
    }

    public String getCommissionTransactionTransaction() {
        return commissionTransactionTransaction;
    }
}