/*The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task*/
package org.museframework.bian.bankdrafts.dto.bq;

public class BankDraftsOutcome {
    /**/
    private String bankDraftsCounterparty;

    /**/
    private String bankDraftsDividend;

    /**/
    private org.museframework.bian.classes.FeeTransaction bankDraftsFees;

    /**/
    private org.museframework.bian.classes.InterestTransaction bankDraftsInterest;

    /**/
    private String bankDraftsMargining;

    /**/
    private String bankDraftsNotionalPrincipal;

    /**/
    private String bankDraftsOptions;

    /**/
    private String bankDraftsRates;

    /**/
    private String bankDraftsSettlement;

    /**/
    private String bankDraftsWorkProduct;

    public void setBankDraftsCounterparty(String bankDraftsCounterparty) {
        this.bankDraftsCounterparty = bankDraftsCounterparty;
    }

    public String getBankDraftsCounterparty() {
        return bankDraftsCounterparty;
    }

    public void setBankDraftsDividend(String bankDraftsDividend) {
        this.bankDraftsDividend = bankDraftsDividend;
    }

    public String getBankDraftsDividend() {
        return bankDraftsDividend;
    }

    public void setBankDraftsFees(org.museframework.bian.classes.FeeTransaction bankDraftsFees) {
        this.bankDraftsFees = bankDraftsFees;
    }

    public org.museframework.bian.classes.FeeTransaction getBankDraftsFees() {
        return bankDraftsFees;
    }

    public void setBankDraftsInterest(org.museframework.bian.classes.InterestTransaction bankDraftsInterest) {
        this.bankDraftsInterest = bankDraftsInterest;
    }

    public org.museframework.bian.classes.InterestTransaction getBankDraftsInterest() {
        return bankDraftsInterest;
    }

    public void setBankDraftsMargining(String bankDraftsMargining) {
        this.bankDraftsMargining = bankDraftsMargining;
    }

    public String getBankDraftsMargining() {
        return bankDraftsMargining;
    }

    public void setBankDraftsNotionalPrincipal(String bankDraftsNotionalPrincipal) {
        this.bankDraftsNotionalPrincipal = bankDraftsNotionalPrincipal;
    }

    public String getBankDraftsNotionalPrincipal() {
        return bankDraftsNotionalPrincipal;
    }

    public void setBankDraftsOptions(String bankDraftsOptions) {
        this.bankDraftsOptions = bankDraftsOptions;
    }

    public String getBankDraftsOptions() {
        return bankDraftsOptions;
    }

    public void setBankDraftsRates(String bankDraftsRates) {
        this.bankDraftsRates = bankDraftsRates;
    }

    public String getBankDraftsRates() {
        return bankDraftsRates;
    }

    public void setBankDraftsSettlement(String bankDraftsSettlement) {
        this.bankDraftsSettlement = bankDraftsSettlement;
    }

    public String getBankDraftsSettlement() {
        return bankDraftsSettlement;
    }

    public void setBankDraftsWorkProduct(String bankDraftsWorkProduct) {
        this.bankDraftsWorkProduct = bankDraftsWorkProduct;
    }

    public String getBankDraftsWorkProduct() {
        return bankDraftsWorkProduct;
    }
}