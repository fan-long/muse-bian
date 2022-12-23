/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Investment Account. */
package org.museframework.bian.investmentaccount.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InvestmentAccountFacility {
    /*Reference to the investment account product instance*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The associated investment account number in any suitable format*/
    @MetaField
    private String investmentAccountNumber;

    /*Reference to the account primary party/owner*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Bank branch associated with the account for booking purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankBranchLocationReference;

    /*Definition of the linked cash account used as the source or target of cash to support securities deposits and withdrawals*/
    @MetaField
    private String linkedCashAccount;

    /*The type and purpose for the link (e.g. funding/margin account)*/
    @MetaField
    private String linkType;

    /*Details of the linked cash account*/
    @MetaField
    private String accountDetails;

    /*The type of investment account (e.g. discretionary, retirement, margin, restricted instrument category - securities, off-balance sheet)*/
    @MetaField
    private String investmentAccountType;

    /*Details the range of instruments that are tracked by the facility (each instrument has its own transaction record/holding position*/
    @MetaField
    private String investmentAccountInstrumentProfile;

    /*Details for an individual tracked instrument type - the investment account can track the holdings for multiple securities*/
    @MetaField
    private String investmentAccountInstrumentRecord;

    /*Reference to the type of investment instrument being tracked (e.g. equity, commodity, FX/MM, derivative)*/
    @MetaField
    private String instrumentType;

    /*The specific instrument trading identifier (e.g. NASDAQ Id)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object instrumentReference;

    /*Reference to the market where the instrument is quoted/traded (e.g. ISE Equities Marketplace)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object tradingMarketplaceReference;

    /*Position limits and holding position that are tracked by the account*/
    @MetaField
    private String instrumentPositionRecord;

    /*The type of position maintained for the account (e.g. min/max holdings,)*/
    @MetaField
    private String instrumentPositionLimitType;

    /*The position definition, associated limit settings and rules*/
    @MetaField
    private String instrumentPositionLimitSettings;

    /*The current calculated holding/position*/
    @MetaField
    private String instrumentPositionHolding;

    /*Details of known scheduled events related to the instrument (e.g. dividend payment date)*/
    @MetaField
    private String instrumentProcessingSchedule;

    /*The type of event impacting the state of the instrument (e.g. corporate actions)*/
    @MetaField
    private String instrumentEventType;

    /*Details of the event associated actions or impact*/
    @MetaField
    private String instrumentEventDescription;

    /*The date/time the event is anticipated/occurs*/
    @MetaField
    private String instrumentEventDate;

    /*Reference identifier linking the investment account to appropriate tax handling*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxReference;

    /*The definition of an applicable entitlement option*/
    @MetaField
    private String entitlementOptionDefinition;

    /*The setting for the entitlement option*/
    @MetaField
    private String entitlementOptionSetting;

    /*The definition of an applicable restriction option*/
    @MetaField
    private String restrictionOptionDefinition;

    /*The setting for the restriction option*/
    @MetaField
    private String restrictionOptionSetting;

    /*Definition of the associations to the account*/
    @MetaField
    private String linkedAccounts;

    /*Key dates associated with the investment account (e.g. opening date, closing date)*/
    @MetaField
    private String dateType;

    /*Value of the date type*/
    @MetaField
    private String date;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setInvestmentAccountNumber(String investmentAccountNumber) {
        this.investmentAccountNumber = investmentAccountNumber;
    }

    public String getInvestmentAccountNumber() {
        return investmentAccountNumber;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setBankBranchLocationReference(org.museframework.bian.classes.Object bankBranchLocationReference) {
        this.bankBranchLocationReference = bankBranchLocationReference;
    }

    public org.museframework.bian.classes.Object getBankBranchLocationReference() {
        return bankBranchLocationReference;
    }

    public void setLinkedCashAccount(String linkedCashAccount) {
        this.linkedCashAccount = linkedCashAccount;
    }

    public String getLinkedCashAccount() {
        return linkedCashAccount;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setAccountDetails(String accountDetails) {
        this.accountDetails = accountDetails;
    }

    public String getAccountDetails() {
        return accountDetails;
    }

    public void setInvestmentAccountType(String investmentAccountType) {
        this.investmentAccountType = investmentAccountType;
    }

    public String getInvestmentAccountType() {
        return investmentAccountType;
    }

    public void setInvestmentAccountInstrumentProfile(String investmentAccountInstrumentProfile) {
        this.investmentAccountInstrumentProfile = investmentAccountInstrumentProfile;
    }

    public String getInvestmentAccountInstrumentProfile() {
        return investmentAccountInstrumentProfile;
    }

    public void setInvestmentAccountInstrumentRecord(String investmentAccountInstrumentRecord) {
        this.investmentAccountInstrumentRecord = investmentAccountInstrumentRecord;
    }

    public String getInvestmentAccountInstrumentRecord() {
        return investmentAccountInstrumentRecord;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentReference(org.museframework.bian.classes.Object instrumentReference) {
        this.instrumentReference = instrumentReference;
    }

    public org.museframework.bian.classes.Object getInstrumentReference() {
        return instrumentReference;
    }

    public void setTradingMarketplaceReference(org.museframework.bian.classes.Object tradingMarketplaceReference) {
        this.tradingMarketplaceReference = tradingMarketplaceReference;
    }

    public org.museframework.bian.classes.Object getTradingMarketplaceReference() {
        return tradingMarketplaceReference;
    }

    public void setInstrumentPositionRecord(String instrumentPositionRecord) {
        this.instrumentPositionRecord = instrumentPositionRecord;
    }

    public String getInstrumentPositionRecord() {
        return instrumentPositionRecord;
    }

    public void setInstrumentPositionLimitType(String instrumentPositionLimitType) {
        this.instrumentPositionLimitType = instrumentPositionLimitType;
    }

    public String getInstrumentPositionLimitType() {
        return instrumentPositionLimitType;
    }

    public void setInstrumentPositionLimitSettings(String instrumentPositionLimitSettings) {
        this.instrumentPositionLimitSettings = instrumentPositionLimitSettings;
    }

    public String getInstrumentPositionLimitSettings() {
        return instrumentPositionLimitSettings;
    }

    public void setInstrumentPositionHolding(String instrumentPositionHolding) {
        this.instrumentPositionHolding = instrumentPositionHolding;
    }

    public String getInstrumentPositionHolding() {
        return instrumentPositionHolding;
    }

    public void setInstrumentProcessingSchedule(String instrumentProcessingSchedule) {
        this.instrumentProcessingSchedule = instrumentProcessingSchedule;
    }

    public String getInstrumentProcessingSchedule() {
        return instrumentProcessingSchedule;
    }

    public void setInstrumentEventType(String instrumentEventType) {
        this.instrumentEventType = instrumentEventType;
    }

    public String getInstrumentEventType() {
        return instrumentEventType;
    }

    public void setInstrumentEventDescription(String instrumentEventDescription) {
        this.instrumentEventDescription = instrumentEventDescription;
    }

    public String getInstrumentEventDescription() {
        return instrumentEventDescription;
    }

    public void setInstrumentEventDate(String instrumentEventDate) {
        this.instrumentEventDate = instrumentEventDate;
    }

    public String getInstrumentEventDate() {
        return instrumentEventDate;
    }

    public void setTaxReference(org.museframework.bian.classes.Object taxReference) {
        this.taxReference = taxReference;
    }

    public org.museframework.bian.classes.Object getTaxReference() {
        return taxReference;
    }

    public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
        this.entitlementOptionDefinition = entitlementOptionDefinition;
    }

    public String getEntitlementOptionDefinition() {
        return entitlementOptionDefinition;
    }

    public void setEntitlementOptionSetting(String entitlementOptionSetting) {
        this.entitlementOptionSetting = entitlementOptionSetting;
    }

    public String getEntitlementOptionSetting() {
        return entitlementOptionSetting;
    }

    public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
        this.restrictionOptionDefinition = restrictionOptionDefinition;
    }

    public String getRestrictionOptionDefinition() {
        return restrictionOptionDefinition;
    }

    public void setRestrictionOptionSetting(String restrictionOptionSetting) {
        this.restrictionOptionSetting = restrictionOptionSetting;
    }

    public String getRestrictionOptionSetting() {
        return restrictionOptionSetting;
    }

    public void setLinkedAccounts(String linkedAccounts) {
        this.linkedAccounts = linkedAccounts;
    }

    public String getLinkedAccounts() {
        return linkedAccounts;
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
}