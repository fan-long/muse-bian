/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.poiofser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CashPosition {
    /*The currency being tracked*/
    @MetaField(0)
    private String servicingCurrency;

    /*The current holding by currency/instrument*/
    @MetaField(0)
    private String servicingCashHoldingRecord;

    /*Reference to a cash transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object servicingCashTransactionReference;

    /*Details of the cash transaction (e.g. cash deposited to customer account)*/
    @MetaField(0)
    private String servicingCashTransactionRecord;

    /*The link to the account product instance used to effect payments from the position*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    public void setServicingCurrency(String servicingCurrency) {
        this.servicingCurrency = servicingCurrency;
    }

    public String getServicingCurrency() {
        return servicingCurrency;
    }

    public void setServicingCashHoldingRecord(String servicingCashHoldingRecord) {
        this.servicingCashHoldingRecord = servicingCashHoldingRecord;
    }

    public String getServicingCashHoldingRecord() {
        return servicingCashHoldingRecord;
    }

    public void setServicingCashTransactionReference(org.museframework.bian.classes.Object servicingCashTransactionReference) {
        this.servicingCashTransactionReference = servicingCashTransactionReference;
    }

    public org.museframework.bian.classes.Object getServicingCashTransactionReference() {
        return servicingCashTransactionReference;
    }

    public void setServicingCashTransactionRecord(String servicingCashTransactionRecord) {
        this.servicingCashTransactionRecord = servicingCashTransactionRecord;
    }

    public String getServicingCashTransactionRecord() {
        return servicingCashTransactionRecord;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }
}