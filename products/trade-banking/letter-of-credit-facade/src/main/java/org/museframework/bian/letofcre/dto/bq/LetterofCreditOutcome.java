/*The Customer Collateral Allocation Task is a discrete action or task that is required in the execution of the Customer Collateral Allocation Task*/
package org.museframework.bian.letofcre.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class LetterofCreditOutcome {
    /**/
    @MetaField(0)
    private String letterofCreditCounterparty;

    /**/
    @MetaField(0)
    private String letterofCreditDividend;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FeeTransaction letterofCreditFees;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.InterestTransaction letterofCreditInterest;

    /**/
    @MetaField(0)
    private String letterofCreditMargining;

    /**/
    @MetaField(0)
    private String letterofCreditNotionalPrincipal;

    /**/
    @MetaField(0)
    private String letterofCreditOptions;

    /**/
    @MetaField(0)
    private String letterofCreditRates;

    /**/
    @MetaField(0)
    private String letterofCreditSettlement;

    /**/
    @MetaField(0)
    private String letterofCreditWorkProduct;

    public void setLetterofCreditCounterparty(String letterofCreditCounterparty) {
        this.letterofCreditCounterparty = letterofCreditCounterparty;
    }

    public String getLetterofCreditCounterparty() {
        return letterofCreditCounterparty;
    }

    public void setLetterofCreditDividend(String letterofCreditDividend) {
        this.letterofCreditDividend = letterofCreditDividend;
    }

    public String getLetterofCreditDividend() {
        return letterofCreditDividend;
    }

    public void setLetterofCreditFees(org.museframework.bian.classes.FeeTransaction letterofCreditFees) {
        this.letterofCreditFees = letterofCreditFees;
    }

    public org.museframework.bian.classes.FeeTransaction getLetterofCreditFees() {
        return letterofCreditFees;
    }

    public void setLetterofCreditInterest(org.museframework.bian.classes.InterestTransaction letterofCreditInterest) {
        this.letterofCreditInterest = letterofCreditInterest;
    }

    public org.museframework.bian.classes.InterestTransaction getLetterofCreditInterest() {
        return letterofCreditInterest;
    }

    public void setLetterofCreditMargining(String letterofCreditMargining) {
        this.letterofCreditMargining = letterofCreditMargining;
    }

    public String getLetterofCreditMargining() {
        return letterofCreditMargining;
    }

    public void setLetterofCreditNotionalPrincipal(String letterofCreditNotionalPrincipal) {
        this.letterofCreditNotionalPrincipal = letterofCreditNotionalPrincipal;
    }

    public String getLetterofCreditNotionalPrincipal() {
        return letterofCreditNotionalPrincipal;
    }

    public void setLetterofCreditOptions(String letterofCreditOptions) {
        this.letterofCreditOptions = letterofCreditOptions;
    }

    public String getLetterofCreditOptions() {
        return letterofCreditOptions;
    }

    public void setLetterofCreditRates(String letterofCreditRates) {
        this.letterofCreditRates = letterofCreditRates;
    }

    public String getLetterofCreditRates() {
        return letterofCreditRates;
    }

    public void setLetterofCreditSettlement(String letterofCreditSettlement) {
        this.letterofCreditSettlement = letterofCreditSettlement;
    }

    public String getLetterofCreditSettlement() {
        return letterofCreditSettlement;
    }

    public void setLetterofCreditWorkProduct(String letterofCreditWorkProduct) {
        this.letterofCreditWorkProduct = letterofCreditWorkProduct;
    }

    public String getLetterofCreditWorkProduct() {
        return letterofCreditWorkProduct;
    }
}