/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.corporatetreasury.dto.bq;

public class BankRates {
    /*The type of bank interest or currency rate that is to be applied in production (e.g. bank's consumer mortgage rate)*/
    private String bankRateType;

    /*The current value (value range if appropriate) to apply*/
    private String bankRateValue;

    /*The key date and time values associated with the rate*/
    private String bankRateValueDate;

    /*Historical values (maintained for back testing, corrections etc.)*/
    private String bankRateValueHistory;

    /*Reference to the distributed record containing the prevailing bank rates*/
    private org.museframework.bian.classes.Object bankRateRecordReference;

    /*The record of the prevailing bank rates*/
    private String bankRateRecord;

    /*Date and time stamp for rate value record*/
    private String bankRateRecordDate;

    public void setBankRateType(String bankRateType) {
        this.bankRateType = bankRateType;
    }

    public String getBankRateType() {
        return bankRateType;
    }

    public void setBankRateValue(String bankRateValue) {
        this.bankRateValue = bankRateValue;
    }

    public String getBankRateValue() {
        return bankRateValue;
    }

    public void setBankRateValueDate(String bankRateValueDate) {
        this.bankRateValueDate = bankRateValueDate;
    }

    public String getBankRateValueDate() {
        return bankRateValueDate;
    }

    public void setBankRateValueHistory(String bankRateValueHistory) {
        this.bankRateValueHistory = bankRateValueHistory;
    }

    public String getBankRateValueHistory() {
        return bankRateValueHistory;
    }

    public void setBankRateRecordReference(org.museframework.bian.classes.Object bankRateRecordReference) {
        this.bankRateRecordReference = bankRateRecordReference;
    }

    public org.museframework.bian.classes.Object getBankRateRecordReference() {
        return bankRateRecordReference;
    }

    public void setBankRateRecord(String bankRateRecord) {
        this.bankRateRecord = bankRateRecord;
    }

    public String getBankRateRecord() {
        return bankRateRecord;
    }

    public void setBankRateRecordDate(String bankRateRecordDate) {
        this.bankRateRecordDate = bankRateRecordDate;
    }

    public String getBankRateRecordDate() {
        return bankRateRecordDate;
    }
}