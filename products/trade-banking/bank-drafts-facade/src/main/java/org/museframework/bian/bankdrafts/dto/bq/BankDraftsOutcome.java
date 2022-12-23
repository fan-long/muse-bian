/*The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task*/
package org.museframework.bian.bankdrafts.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BankDraftsOutcome {
    /**/
    @MetaField
    private String bankDraftsCounterparty;

    /**/
    @MetaField
    private String bankDraftsDividend;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FeeTransaction bankDraftsFees;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.InterestTransaction bankDraftsInterest;

    /**/
    @MetaField
    private String bankDraftsMargining;

    /**/
    @MetaField
    private String bankDraftsNotionalPrincipal;

    /**/
    @MetaField
    private String bankDraftsOptions;

    /**/
    @MetaField
    private String bankDraftsRates;

    /**/
    @MetaField
    private String bankDraftsSettlement;

    /**/
    @MetaField
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