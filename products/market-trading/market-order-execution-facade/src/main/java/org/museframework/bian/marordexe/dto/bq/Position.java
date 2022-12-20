/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.marordexe.dto.bq;

public class Position extends org.museframework.bian.classes.Position {
    /*The security that the bank position is traded for*/
    private String bankSecurityPositionSecurityType;

    /*Reference to market trades impacting the position during the current trading period*/
    private org.museframework.bian.classes.Object positionMarketOrderTradeInitiationInstanceReference;

    /*The consolidated record of trading activity against the position during the trading period, including the derived position P&L*/
    private String bankSecurityPositionSecurityPAndLRecord;

    /*The record of trades made in the wholesale markets by the bank to manage its net security position. Note for larger market orders/trades there may be a corresponding wholesale transaction as appropriate)*/
    private String wholesaleTrade;

    /*The traded security*/
    private String wholesaleTradeSecurityType;

    /*The volume of share bought/sold*/
    private String wholesaleTradeVolume;

    /*The security and cash flow details of the trade*/
    private String wholesaleTradePrice;

    /*The terms covering the clearing and settlement of the trade*/
    private String wholesaleTradeClearingandSettlementTerms;

    /*The document reference for the trade confirmation notice*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to the correspondence generated for the trade confirmation*/
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*Status tracking for the wholesale trade*/
    private String wholesaleTradeStatus;

    public void setBankSecurityPositionSecurityType(String bankSecurityPositionSecurityType) {
        this.bankSecurityPositionSecurityType = bankSecurityPositionSecurityType;
    }

    public String getBankSecurityPositionSecurityType() {
        return bankSecurityPositionSecurityType;
    }

    public void setPositionMarketOrderTradeInitiationInstanceReference(org.museframework.bian.classes.Object positionMarketOrderTradeInitiationInstanceReference) {
        this.positionMarketOrderTradeInitiationInstanceReference = positionMarketOrderTradeInitiationInstanceReference;
    }

    public org.museframework.bian.classes.Object getPositionMarketOrderTradeInitiationInstanceReference() {
        return positionMarketOrderTradeInitiationInstanceReference;
    }

    public void setBankSecurityPositionSecurityPAndLRecord(String bankSecurityPositionSecurityPAndLRecord) {
        this.bankSecurityPositionSecurityPAndLRecord = bankSecurityPositionSecurityPAndLRecord;
    }

    public String getBankSecurityPositionSecurityPAndLRecord() {
        return bankSecurityPositionSecurityPAndLRecord;
    }

    public void setWholesaleTrade(String wholesaleTrade) {
        this.wholesaleTrade = wholesaleTrade;
    }

    public String getWholesaleTrade() {
        return wholesaleTrade;
    }

    public void setWholesaleTradeSecurityType(String wholesaleTradeSecurityType) {
        this.wholesaleTradeSecurityType = wholesaleTradeSecurityType;
    }

    public String getWholesaleTradeSecurityType() {
        return wholesaleTradeSecurityType;
    }

    public void setWholesaleTradeVolume(String wholesaleTradeVolume) {
        this.wholesaleTradeVolume = wholesaleTradeVolume;
    }

    public String getWholesaleTradeVolume() {
        return wholesaleTradeVolume;
    }

    public void setWholesaleTradePrice(String wholesaleTradePrice) {
        this.wholesaleTradePrice = wholesaleTradePrice;
    }

    public String getWholesaleTradePrice() {
        return wholesaleTradePrice;
    }

    public void setWholesaleTradeClearingandSettlementTerms(String wholesaleTradeClearingandSettlementTerms) {
        this.wholesaleTradeClearingandSettlementTerms = wholesaleTradeClearingandSettlementTerms;
    }

    public String getWholesaleTradeClearingandSettlementTerms() {
        return wholesaleTradeClearingandSettlementTerms;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setCorrespondenceInstanceReference(org.museframework.bian.classes.Object correspondenceInstanceReference) {
        this.correspondenceInstanceReference = correspondenceInstanceReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceInstanceReference() {
        return correspondenceInstanceReference;
    }

    public void setWholesaleTradeStatus(String wholesaleTradeStatus) {
        this.wholesaleTradeStatus = wholesaleTradeStatus;
    }

    public String getWholesaleTradeStatus() {
        return wholesaleTradeStatus;
    }
}