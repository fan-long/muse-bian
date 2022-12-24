/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Currency Exchange. 
Example: Execute a payment transaction.*/
package org.museframework.bian.currencyexchange.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CurrencyExchangeTransaction
@MetaDto
public class CurrencyExchangeTransaction {
    /*A Classification value that distinguishes between business service transaction within Currency Exchange Transaction*/
    @MetaField
    private String currencyExchangeTransactionParameterType;

    /*A selected optional business service as subject matter of Currency Exchange Transaction*/
    @MetaField
    private String currencyExchangeTransactionSelectedOption;

    /*The status of Currency Exchange Transaction*/
    @MetaField
    private String currencyExchangeTransactionStatus;

    /*A Classification value that specifies type of business action for this  Currency Exchange Transaction*/
    @MetaField
    private String currencyExchangeTransactionType;

    /*A Classification value that specifies type of transaction for this  Currency Exchange Transaction*/
    @MetaField
    private String currencyExchangeTransactionTransactionType;

    /*Reference to Currency Exchange Transaction*/
    @MetaField
    private String currencyExchangeTransactionTransaction;

    public void setCurrencyExchangeTransactionParameterType(String currencyExchangeTransactionParameterType) {
        this.currencyExchangeTransactionParameterType = currencyExchangeTransactionParameterType;
    }

    public String getCurrencyExchangeTransactionParameterType() {
        return currencyExchangeTransactionParameterType;
    }

    public void setCurrencyExchangeTransactionSelectedOption(String currencyExchangeTransactionSelectedOption) {
        this.currencyExchangeTransactionSelectedOption = currencyExchangeTransactionSelectedOption;
    }

    public String getCurrencyExchangeTransactionSelectedOption() {
        return currencyExchangeTransactionSelectedOption;
    }

    public void setCurrencyExchangeTransactionStatus(String currencyExchangeTransactionStatus) {
        this.currencyExchangeTransactionStatus = currencyExchangeTransactionStatus;
    }

    public String getCurrencyExchangeTransactionStatus() {
        return currencyExchangeTransactionStatus;
    }

    public void setCurrencyExchangeTransactionType(String currencyExchangeTransactionType) {
        this.currencyExchangeTransactionType = currencyExchangeTransactionType;
    }

    public String getCurrencyExchangeTransactionType() {
        return currencyExchangeTransactionType;
    }

    public void setCurrencyExchangeTransactionTransactionType(String currencyExchangeTransactionTransactionType) {
        this.currencyExchangeTransactionTransactionType = currencyExchangeTransactionTransactionType;
    }

    public String getCurrencyExchangeTransactionTransactionType() {
        return currencyExchangeTransactionTransactionType;
    }

    public void setCurrencyExchangeTransactionTransaction(String currencyExchangeTransactionTransaction) {
        this.currencyExchangeTransactionTransaction = currencyExchangeTransactionTransaction;
    }

    public String getCurrencyExchangeTransactionTransaction() {
        return currencyExchangeTransactionTransaction;
    }
}