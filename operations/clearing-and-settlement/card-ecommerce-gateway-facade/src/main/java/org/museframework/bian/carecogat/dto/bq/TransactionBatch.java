/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.carecogat.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.TransactionBatch
@MetaDto
public class TransactionBatch {
    /*Significant dates and times associated with the batch transaction*/
    @MetaField
    private String eCommerceBatchTransactionDateTime;

    /*Refers to the merchant initiating the batch*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object transactionMerchantReference;

    /*Batch record contains multiple Card Transactions*/
    @MetaField
    private String eCommerceBatchTransactionRecord;

    public void seteCommerceBatchTransactionDateTime(String eCommerceBatchTransactionDateTime) {
        this.eCommerceBatchTransactionDateTime = eCommerceBatchTransactionDateTime;
    }

    public String geteCommerceBatchTransactionDateTime() {
        return eCommerceBatchTransactionDateTime;
    }

    public void setTransactionMerchantReference(org.museframework.bian.classes.Object transactionMerchantReference) {
        this.transactionMerchantReference = transactionMerchantReference;
    }

    public org.museframework.bian.classes.Object getTransactionMerchantReference() {
        return transactionMerchantReference;
    }

    public void seteCommerceBatchTransactionRecord(String eCommerceBatchTransactionRecord) {
        this.eCommerceBatchTransactionRecord = eCommerceBatchTransactionRecord;
    }

    public String geteCommerceBatchTransactionRecord() {
        return eCommerceBatchTransactionRecord;
    }
}