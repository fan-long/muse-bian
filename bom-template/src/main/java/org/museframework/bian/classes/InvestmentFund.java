/*Distinct pool of financial instruments managed by a single investment policy. May or not be part of an umbrella fund. The pool is issued in at least one investment fund class.
https://www.iso20022.org/standardsrepository/type/InvestmentFund

Investment funds are investment products created with the sole purpose of gathering investors' capital, and investing that capital collectively through a portfolio of financial instruments such as stocks, bonds and other securities.

https://finance.ec.europa.eu/capital-markets-union-and-financial-markets/financial-markets/investment-funds*/
package org.museframework.bian.classes;

public class InvestmentFund {
    /*Legal form of the fund, eg, UCITS, SICAV, OEIC, Unit Trust, and FCP. ISO20022*/
    private org.museframework.bian.enumerations.Investmentfundtypevalues investmentFundType;

    /**/
    private org.museframework.bian.enumerations.Investmentfundlegalformtypevalues investmentFundLegalFormType;

    /*Country in which the investment fund is domiciled.*/
    private Country domicileCountry;

    /*Country in which it is authorised to commercialise the fund.*/
    private Country authorisedCountry;

    /*Sub-set of an investment fund.*/
    private String investmentFundClass;

    /*Party which executes a treasury trade on behalf of an investment fund.*/
    private String treasuryTradingParty;

    /*Identification of the investment fund.*/
    private String identification;

    /*Party which settles the trades for the account of the fund.*/
    private String custodian;

    /*Family to which the investment fund belongs.*/
    private String family;

    /*Structure of the subfund, eg, single fund, multi-class.*/
    private String structure;

    /*Indicates whether the investment fund is a subfund, when it is a compartment of an umbrella fund. In this case, subfund is a synonym of investment fund and therefore has the same attributes as investment fund.*/
    private String subFundIndicator;

    /*Date at which the books are closed and profit and loss is determined.*/
    private String endOfFiscalYear;

    /*Last day of the accounting year for the fund.*/
    private String accountingYearEndDate;

    /*Last day of the first accounting year for the fund.*/
    private String firstAccountingYearEndDate;

    public void setInvestmentFundType(org.museframework.bian.enumerations.Investmentfundtypevalues investmentFundType) {
        this.investmentFundType = investmentFundType;
    }

    public org.museframework.bian.enumerations.Investmentfundtypevalues getInvestmentFundType() {
        return investmentFundType;
    }

    public void setInvestmentFundLegalFormType(org.museframework.bian.enumerations.Investmentfundlegalformtypevalues investmentFundLegalFormType) {
        this.investmentFundLegalFormType = investmentFundLegalFormType;
    }

    public org.museframework.bian.enumerations.Investmentfundlegalformtypevalues getInvestmentFundLegalFormType() {
        return investmentFundLegalFormType;
    }

    public void setDomicileCountry(Country domicileCountry) {
        this.domicileCountry = domicileCountry;
    }

    public Country getDomicileCountry() {
        return domicileCountry;
    }

    public void setAuthorisedCountry(Country authorisedCountry) {
        this.authorisedCountry = authorisedCountry;
    }

    public Country getAuthorisedCountry() {
        return authorisedCountry;
    }

    public void setInvestmentFundClass(String investmentFundClass) {
        this.investmentFundClass = investmentFundClass;
    }

    public String getInvestmentFundClass() {
        return investmentFundClass;
    }

    public void setTreasuryTradingParty(String treasuryTradingParty) {
        this.treasuryTradingParty = treasuryTradingParty;
    }

    public String getTreasuryTradingParty() {
        return treasuryTradingParty;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getIdentification() {
        return identification;
    }

    public void setCustodian(String custodian) {
        this.custodian = custodian;
    }

    public String getCustodian() {
        return custodian;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getStructure() {
        return structure;
    }

    public void setSubFundIndicator(String subFundIndicator) {
        this.subFundIndicator = subFundIndicator;
    }

    public String getSubFundIndicator() {
        return subFundIndicator;
    }

    public void setEndOfFiscalYear(String endOfFiscalYear) {
        this.endOfFiscalYear = endOfFiscalYear;
    }

    public String getEndOfFiscalYear() {
        return endOfFiscalYear;
    }

    public void setAccountingYearEndDate(String accountingYearEndDate) {
        this.accountingYearEndDate = accountingYearEndDate;
    }

    public String getAccountingYearEndDate() {
        return accountingYearEndDate;
    }

    public void setFirstAccountingYearEndDate(String firstAccountingYearEndDate) {
        this.firstAccountingYearEndDate = firstAccountingYearEndDate;
    }

    public String getFirstAccountingYearEndDate() {
        return firstAccountingYearEndDate;
    }
}