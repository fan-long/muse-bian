/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture. 
Example: Execute a payment transaction.*/
package org.museframework.bian.cardcapture.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditChargeCardFinancialCaptureTransaction {
    /*A Classification value that distinguishes between business service transaction within Credit/Charge Card Financial Capture Transaction*/
    @MetaField
    private String creditChargeCardFinancialCaptureTransactionParameterType;

    /*A selected optional business service as subject matter of Credit/Charge Card Financial Capture Transaction*/
    @MetaField
    private String creditChargeCardFinancialCaptureTransactionSelectedOption;

    /*The status of Credit/Charge Card Financial Capture Transaction*/
    @MetaField
    private String creditChargeCardFinancialCaptureTransactionStatus;

    /*A Classification value that specifies type of business action for this  Credit/Charge Card Financial Capture Transaction*/
    @MetaField
    private String creditChargeCardFinancialCaptureTransactionType;

    /*A Classification value that specifies type of transaction for this  Credit/Charge Card Financial Capture Transaction*/
    @MetaField
    private String creditChargeCardFinancialCaptureTransactionTransactionType;

    /*Reference to Credit/Charge Card Financial Capture Transaction*/
    @MetaField
    private String creditChargeCardFinancialCaptureTransactionTransaction;

    public void setCreditChargeCardFinancialCaptureTransactionParameterType(String creditChargeCardFinancialCaptureTransactionParameterType) {
        this.creditChargeCardFinancialCaptureTransactionParameterType = creditChargeCardFinancialCaptureTransactionParameterType;
    }

    public String getCreditChargeCardFinancialCaptureTransactionParameterType() {
        return creditChargeCardFinancialCaptureTransactionParameterType;
    }

    public void setCreditChargeCardFinancialCaptureTransactionSelectedOption(String creditChargeCardFinancialCaptureTransactionSelectedOption) {
        this.creditChargeCardFinancialCaptureTransactionSelectedOption = creditChargeCardFinancialCaptureTransactionSelectedOption;
    }

    public String getCreditChargeCardFinancialCaptureTransactionSelectedOption() {
        return creditChargeCardFinancialCaptureTransactionSelectedOption;
    }

    public void setCreditChargeCardFinancialCaptureTransactionStatus(String creditChargeCardFinancialCaptureTransactionStatus) {
        this.creditChargeCardFinancialCaptureTransactionStatus = creditChargeCardFinancialCaptureTransactionStatus;
    }

    public String getCreditChargeCardFinancialCaptureTransactionStatus() {
        return creditChargeCardFinancialCaptureTransactionStatus;
    }

    public void setCreditChargeCardFinancialCaptureTransactionType(String creditChargeCardFinancialCaptureTransactionType) {
        this.creditChargeCardFinancialCaptureTransactionType = creditChargeCardFinancialCaptureTransactionType;
    }

    public String getCreditChargeCardFinancialCaptureTransactionType() {
        return creditChargeCardFinancialCaptureTransactionType;
    }

    public void setCreditChargeCardFinancialCaptureTransactionTransactionType(String creditChargeCardFinancialCaptureTransactionTransactionType) {
        this.creditChargeCardFinancialCaptureTransactionTransactionType = creditChargeCardFinancialCaptureTransactionTransactionType;
    }

    public String getCreditChargeCardFinancialCaptureTransactionTransactionType() {
        return creditChargeCardFinancialCaptureTransactionTransactionType;
    }

    public void setCreditChargeCardFinancialCaptureTransactionTransaction(String creditChargeCardFinancialCaptureTransactionTransaction) {
        this.creditChargeCardFinancialCaptureTransactionTransaction = creditChargeCardFinancialCaptureTransactionTransaction;
    }

    public String getCreditChargeCardFinancialCaptureTransactionTransaction() {
        return creditChargeCardFinancialCaptureTransactionTransaction;
    }
}