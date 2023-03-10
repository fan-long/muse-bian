/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Consumer Investments. */
package org.museframework.bian.consumerinvestments.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ConsumerSecuritiesOrderTransaction {
    /*The type of market order request (e.g. Customer discretion)*/
    @MetaField(0)
    private String consumerSecuritiesOrderInstructionType;

    /*Reference to the account primary party/owner for the market order*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The employee/business unit placing the market order*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to the associated customer investment portfolio record of all holdings (referenced to check securities availability if necessary)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object investmentPortfolioInstanceReference;

    /*Any customer specific processing preferences or requirements*/
    @MetaField(0)
    private String consumerSecuritiesOrderProcessingInstruction;

    /*The document reference for the order confirmation notice*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to the correspondence generated for the order confirmation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*The details of the market order transaction captured for the consumer securities trade*/
    @MetaField(0)
    private String consumerSecuritiesOrderTransaction;

    /*Reference to the underlying investment account supporting the transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object investmentAccountArrangementInstanceReference;

    /*Reference to the underlying cash account supporting the transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object currentAccountArrangementInstanceReference;

    /*The type of market order underlying the consumer securities order request (e.g. Day Order. Order on Open/Close, Fill or Kill, Limit Order - if allowed for consumer trading)*/
    @MetaField(0)
    private String marketOrderType;

    /*The security to be traded*/
    @MetaField(0)
    private String securityType;

    /*The volume of shares to be bought or sold*/
    @MetaField(0)
    private String amount;

    /*Key dates associated with the transaction (e.g. order capture, order execution, order completion)*/
    @MetaField(0)
    private String dateType;

    /*Value of the specific date type*/
    @MetaField(0)
    private String date;

    public void setConsumerSecuritiesOrderInstructionType(String consumerSecuritiesOrderInstructionType) {
        this.consumerSecuritiesOrderInstructionType = consumerSecuritiesOrderInstructionType;
    }

    public String getConsumerSecuritiesOrderInstructionType() {
        return consumerSecuritiesOrderInstructionType;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setInvestmentPortfolioInstanceReference(org.museframework.bian.classes.Object investmentPortfolioInstanceReference) {
        this.investmentPortfolioInstanceReference = investmentPortfolioInstanceReference;
    }

    public org.museframework.bian.classes.Object getInvestmentPortfolioInstanceReference() {
        return investmentPortfolioInstanceReference;
    }

    public void setConsumerSecuritiesOrderProcessingInstruction(String consumerSecuritiesOrderProcessingInstruction) {
        this.consumerSecuritiesOrderProcessingInstruction = consumerSecuritiesOrderProcessingInstruction;
    }

    public String getConsumerSecuritiesOrderProcessingInstruction() {
        return consumerSecuritiesOrderProcessingInstruction;
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

    public void setConsumerSecuritiesOrderTransaction(String consumerSecuritiesOrderTransaction) {
        this.consumerSecuritiesOrderTransaction = consumerSecuritiesOrderTransaction;
    }

    public String getConsumerSecuritiesOrderTransaction() {
        return consumerSecuritiesOrderTransaction;
    }

    public void setInvestmentAccountArrangementInstanceReference(org.museframework.bian.classes.Object investmentAccountArrangementInstanceReference) {
        this.investmentAccountArrangementInstanceReference = investmentAccountArrangementInstanceReference;
    }

    public org.museframework.bian.classes.Object getInvestmentAccountArrangementInstanceReference() {
        return investmentAccountArrangementInstanceReference;
    }

    public void setCurrentAccountArrangementInstanceReference(org.museframework.bian.classes.Object currentAccountArrangementInstanceReference) {
        this.currentAccountArrangementInstanceReference = currentAccountArrangementInstanceReference;
    }

    public org.museframework.bian.classes.Object getCurrentAccountArrangementInstanceReference() {
        return currentAccountArrangementInstanceReference;
    }

    public void setMarketOrderType(String marketOrderType) {
        this.marketOrderType = marketOrderType;
    }

    public String getMarketOrderType() {
        return marketOrderType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public String getSecurityType() {
        return securityType;
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
}