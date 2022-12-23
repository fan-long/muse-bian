/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Market Order Execution. */
package org.museframework.bian.marordexe.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MarketTradeTransaction {
    /*Reference to the market order that is to be executed in the markets*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object marketOrderTransactionInstanceReference;

    /*Reference to the account primary party/owner for the market order*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The employee/business unit placing the market order*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Any customer specific processing preferences or requirements*/
    @MetaField
    private String customerMarketOrderProcessingInstruction;

    /*The details of the market order transaction*/
    @MetaField
    private String marketOrderTransaction;

    /*Reference to the underlying investment account supporting the transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object investmentAccountArrangementInstanceReference;

    /*Reference to the underlying cash account supporting the transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object currentAccountArrangementInstanceReference;

    /*The type of market order (e.g. Day Order. Order on Open/Close, Fill or Kill, Limit Order)*/
    @MetaField
    private String marketOrderType;

    /*The security to be traded*/
    @MetaField
    private String securityType;

    /*The volume of shares to be bought or sold. This can include different amount types - quoted/committed, traded etc.)*/
    @MetaField
    private String amount;

    /*Key dates associated with the transaction (e.g. order capture, trade execution, order completion)*/
    @MetaField
    private String dateType;

    /*Value of the specific date type*/
    @MetaField
    private String date;

    /*Reference to the associated market trade if the order is executed in the market directly*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object marketOrderTradeInitiationInstanceReference;

    public void setMarketOrderTransactionInstanceReference(org.museframework.bian.classes.Object marketOrderTransactionInstanceReference) {
        this.marketOrderTransactionInstanceReference = marketOrderTransactionInstanceReference;
    }

    public org.museframework.bian.classes.Object getMarketOrderTransactionInstanceReference() {
        return marketOrderTransactionInstanceReference;
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

    public void setCustomerMarketOrderProcessingInstruction(String customerMarketOrderProcessingInstruction) {
        this.customerMarketOrderProcessingInstruction = customerMarketOrderProcessingInstruction;
    }

    public String getCustomerMarketOrderProcessingInstruction() {
        return customerMarketOrderProcessingInstruction;
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

    public void setMarketOrderTradeInitiationInstanceReference(org.museframework.bian.classes.Object marketOrderTradeInitiationInstanceReference) {
        this.marketOrderTradeInitiationInstanceReference = marketOrderTradeInitiationInstanceReference;
    }

    public org.museframework.bian.classes.Object getMarketOrderTradeInitiationInstanceReference() {
        return marketOrderTradeInitiationInstanceReference;
    }
}