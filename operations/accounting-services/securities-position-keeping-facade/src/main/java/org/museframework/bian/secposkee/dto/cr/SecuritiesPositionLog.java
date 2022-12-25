/*Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Securities Position Keeping. */
package org.museframework.bian.secposkee.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.SecuritiesPositionLog
@MetaDto
public class SecuritiesPositionLog {
    /*The type of securities transaction log (e.g. equities, derivatives, all)*/
    @MetaField(0)
    private String securitiesTransactionLogType;

    /*The product/service investment account for which this is the securities transaction log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the product or service account holder/customer for the log if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to a counterparty for the log if appropriate (e.g. merchant reference, corporate reference)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object counterpartyReference;

    /*Details the range of instruments that are tracked by the log (each instrument has its own transaction record/holding position*/
    @MetaField(0)
    private String securitiesPositionLogInstrumentProfile;

    /*Details for an individual tracked instrument type - (the log track transactions for multiple securities/instruments)*/
    @MetaField(0)
    private String securitiesPositionLogInstrumentRecord;

    /*Reference to the type of investment instrument being tracked (e.g. equity, commodity, FX/MM, derivative)*/
    @MetaField(0)
    private String securitiesInstrumentType;

    /*The specific instrument trading identifier (e.g. NASDAQ Id)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object securitiesInstrumentReference;

    /*Basic position limits that are maintained as an aspect of the log (these can include securities holdings and related instrument properties such as associated dividends entitlements)*/
    @MetaField(0)
    private String securitiesPositionLimits;

    /*The type of position maintained for the log (e.g. cumulative balance)*/
    @MetaField(0)
    private String securitiesPositionLimitType;

    /*The position definition, associated limit settings and rules*/
    @MetaField(0)
    private String securitiesPositionLimitSettings;

    /*The current calculated position*/
    @MetaField(0)
    private String securitiesPositionLimitValue;

    /*Support for recording blocks on the log position (handling is by the associated investment account fulfillment service domain)*/
    @MetaField(0)
    private String securitiesAmountBlock;

    /*The type of block applied to the tracked securities position (e.g. pending, final)*/
    @MetaField(0)
    private String securitiesAmountBlockType;

    /*Priority classification for the block*/
    @MetaField(0)
    private String priority;

    /*The amount of the block*/
    @MetaField(0)
    private String amount;

    /*The type of key dates associated with the block  (e.g. start, expiry)*/
    @MetaField(0)
    private String dateType;

    /*Value of the specific date type*/
    @MetaField(0)
    private String date;

    /*The date and time the log was initiated. Note the log will have a complex internal calendar structure for extract and reporting*/
    @MetaField(0)
    private String initiationDate;

    /*The status of the log entry (e.g. active, in-suspense etc.)*/
    @MetaField(0)
    private String status;

    public void setSecuritiesTransactionLogType(String securitiesTransactionLogType) {
        this.securitiesTransactionLogType = securitiesTransactionLogType;
    }

    public String getSecuritiesTransactionLogType() {
        return securitiesTransactionLogType;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCounterpartyReference(org.museframework.bian.classes.Object counterpartyReference) {
        this.counterpartyReference = counterpartyReference;
    }

    public org.museframework.bian.classes.Object getCounterpartyReference() {
        return counterpartyReference;
    }

    public void setSecuritiesPositionLogInstrumentProfile(String securitiesPositionLogInstrumentProfile) {
        this.securitiesPositionLogInstrumentProfile = securitiesPositionLogInstrumentProfile;
    }

    public String getSecuritiesPositionLogInstrumentProfile() {
        return securitiesPositionLogInstrumentProfile;
    }

    public void setSecuritiesPositionLogInstrumentRecord(String securitiesPositionLogInstrumentRecord) {
        this.securitiesPositionLogInstrumentRecord = securitiesPositionLogInstrumentRecord;
    }

    public String getSecuritiesPositionLogInstrumentRecord() {
        return securitiesPositionLogInstrumentRecord;
    }

    public void setSecuritiesInstrumentType(String securitiesInstrumentType) {
        this.securitiesInstrumentType = securitiesInstrumentType;
    }

    public String getSecuritiesInstrumentType() {
        return securitiesInstrumentType;
    }

    public void setSecuritiesInstrumentReference(org.museframework.bian.classes.Object securitiesInstrumentReference) {
        this.securitiesInstrumentReference = securitiesInstrumentReference;
    }

    public org.museframework.bian.classes.Object getSecuritiesInstrumentReference() {
        return securitiesInstrumentReference;
    }

    public void setSecuritiesPositionLimits(String securitiesPositionLimits) {
        this.securitiesPositionLimits = securitiesPositionLimits;
    }

    public String getSecuritiesPositionLimits() {
        return securitiesPositionLimits;
    }

    public void setSecuritiesPositionLimitType(String securitiesPositionLimitType) {
        this.securitiesPositionLimitType = securitiesPositionLimitType;
    }

    public String getSecuritiesPositionLimitType() {
        return securitiesPositionLimitType;
    }

    public void setSecuritiesPositionLimitSettings(String securitiesPositionLimitSettings) {
        this.securitiesPositionLimitSettings = securitiesPositionLimitSettings;
    }

    public String getSecuritiesPositionLimitSettings() {
        return securitiesPositionLimitSettings;
    }

    public void setSecuritiesPositionLimitValue(String securitiesPositionLimitValue) {
        this.securitiesPositionLimitValue = securitiesPositionLimitValue;
    }

    public String getSecuritiesPositionLimitValue() {
        return securitiesPositionLimitValue;
    }

    public void setSecuritiesAmountBlock(String securitiesAmountBlock) {
        this.securitiesAmountBlock = securitiesAmountBlock;
    }

    public String getSecuritiesAmountBlock() {
        return securitiesAmountBlock;
    }

    public void setSecuritiesAmountBlockType(String securitiesAmountBlockType) {
        this.securitiesAmountBlockType = securitiesAmountBlockType;
    }

    public String getSecuritiesAmountBlockType() {
        return securitiesAmountBlockType;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setInitiationDate(String initiationDate) {
        this.initiationDate = initiationDate;
    }

    public String getInitiationDate() {
        return initiationDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}