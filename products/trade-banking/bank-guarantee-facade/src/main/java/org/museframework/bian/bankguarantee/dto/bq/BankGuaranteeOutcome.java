/*The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task*/
package org.museframework.bian.bankguarantee.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BankGuaranteeOutcome {
    /**/
    @MetaField
    private String bankGuaranteeCounterparty;

    /**/
    @MetaField
    private String bankGuaranteeDividend;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FeeTransaction bankGuaranteeFees;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.InterestTransaction bankGuaranteeInterest;

    /**/
    @MetaField
    private String bankGuaranteeMargining;

    /**/
    @MetaField
    private String bankGuaranteeNotionalPrincipal;

    /**/
    @MetaField
    private String bankGuaranteeOptions;

    /**/
    @MetaField
    private String bankGuaranteeRates;

    /**/
    @MetaField
    private String bankGuaranteeSettlement;

    /**/
    @MetaField
    private String bankGuaranteeWorkProduct;

    public void setBankGuaranteeCounterparty(String bankGuaranteeCounterparty) {
        this.bankGuaranteeCounterparty = bankGuaranteeCounterparty;
    }

    public String getBankGuaranteeCounterparty() {
        return bankGuaranteeCounterparty;
    }

    public void setBankGuaranteeDividend(String bankGuaranteeDividend) {
        this.bankGuaranteeDividend = bankGuaranteeDividend;
    }

    public String getBankGuaranteeDividend() {
        return bankGuaranteeDividend;
    }

    public void setBankGuaranteeFees(org.museframework.bian.classes.FeeTransaction bankGuaranteeFees) {
        this.bankGuaranteeFees = bankGuaranteeFees;
    }

    public org.museframework.bian.classes.FeeTransaction getBankGuaranteeFees() {
        return bankGuaranteeFees;
    }

    public void setBankGuaranteeInterest(org.museframework.bian.classes.InterestTransaction bankGuaranteeInterest) {
        this.bankGuaranteeInterest = bankGuaranteeInterest;
    }

    public org.museframework.bian.classes.InterestTransaction getBankGuaranteeInterest() {
        return bankGuaranteeInterest;
    }

    public void setBankGuaranteeMargining(String bankGuaranteeMargining) {
        this.bankGuaranteeMargining = bankGuaranteeMargining;
    }

    public String getBankGuaranteeMargining() {
        return bankGuaranteeMargining;
    }

    public void setBankGuaranteeNotionalPrincipal(String bankGuaranteeNotionalPrincipal) {
        this.bankGuaranteeNotionalPrincipal = bankGuaranteeNotionalPrincipal;
    }

    public String getBankGuaranteeNotionalPrincipal() {
        return bankGuaranteeNotionalPrincipal;
    }

    public void setBankGuaranteeOptions(String bankGuaranteeOptions) {
        this.bankGuaranteeOptions = bankGuaranteeOptions;
    }

    public String getBankGuaranteeOptions() {
        return bankGuaranteeOptions;
    }

    public void setBankGuaranteeRates(String bankGuaranteeRates) {
        this.bankGuaranteeRates = bankGuaranteeRates;
    }

    public String getBankGuaranteeRates() {
        return bankGuaranteeRates;
    }

    public void setBankGuaranteeSettlement(String bankGuaranteeSettlement) {
        this.bankGuaranteeSettlement = bankGuaranteeSettlement;
    }

    public String getBankGuaranteeSettlement() {
        return bankGuaranteeSettlement;
    }

    public void setBankGuaranteeWorkProduct(String bankGuaranteeWorkProduct) {
        this.bankGuaranteeWorkProduct = bankGuaranteeWorkProduct;
    }

    public String getBankGuaranteeWorkProduct() {
        return bankGuaranteeWorkProduct;
    }
}