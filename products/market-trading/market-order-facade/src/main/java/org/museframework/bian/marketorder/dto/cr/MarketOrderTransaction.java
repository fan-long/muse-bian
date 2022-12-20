/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Market Order. */
package org.museframework.bian.marketorder.dto.cr;

public class MarketOrderTransaction extends org.museframework.bian.classes.MarketOrderTransaction {
    /*The type of market order request (e.g. Managed Investment, Corporate Finance)*/
    private String marketOrderInstructionType;

    /*Reference to the account primary party/owner for the market order*/
    private org.museframework.bian.classes.Object customerReference;

    /*The employee/business unit placing the market order*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to the associated investment portfolio record of all holdings (referenced to check securities availability if necessary)*/
    private org.museframework.bian.classes.Object investmentPortfolioInstanceReference;

    /*Any customer specific processing preferences or requirements*/
    private String customerMarketOrderProcessingInstruction;

    /*The document reference for the order confirmation notice*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to the correspondence generated for the order confirmation*/
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*The details of the market order transaction*/
    private String marketOrderTransaction;

    /*Reference to the underlying investment account supporting the transaction*/
    private org.museframework.bian.classes.Object investmentAccountArrangementInstanceReference;

    /*Reference to the underlying cash account supporting the transaction*/
    private org.museframework.bian.classes.Object currentAccountArrangementInstanceReference;

    /*The type of market order (e.g. Day Order. Order on Open/Close, Fill or Kill, Limit Order)*/
    private String marketOrderType;

    /*The security to be traded*/
    private String securityType;

    /*The volume of shares to be bought or sold*/
    private String amount;

    /*Key dates associated with the transaction (e.g. order capture, trade execution, order completion)*/
    private String dateType;

    /*Value of the specific date type*/
    private String date;

    public void setMarketOrderInstructionType(String marketOrderInstructionType) {
        this.marketOrderInstructionType = marketOrderInstructionType;
    }

    public String getMarketOrderInstructionType() {
        return marketOrderInstructionType;
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

    public void setCustomerMarketOrderProcessingInstruction(String customerMarketOrderProcessingInstruction) {
        this.customerMarketOrderProcessingInstruction = customerMarketOrderProcessingInstruction;
    }

    public String getCustomerMarketOrderProcessingInstruction() {
        return customerMarketOrderProcessingInstruction;
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

    public void setMarketOrderTransaction(String marketOrderTransaction) {
        this.marketOrderTransaction = marketOrderTransaction;
    }

    public String getMarketOrderTransaction() {
        return marketOrderTransaction;
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