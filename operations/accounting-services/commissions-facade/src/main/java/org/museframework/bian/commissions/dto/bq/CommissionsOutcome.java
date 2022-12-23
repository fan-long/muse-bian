/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Commissions. 
Example: Execute a payment transaction.*/
package org.museframework.bian.commissions.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CommissionsOutcome {
    /**/
    @MetaField
    private String commissionsCalendar;

    /**/
    @MetaField
    private String commissionsCounterparty;

    /**/
    @MetaField
    private String commissionsDividend;

    /**/
    @MetaField
    private String commissionsFees;

    /**/
    @MetaField
    private String commissionsInterest;

    /**/
    @MetaField
    private String commissionsMargining;

    /**/
    @MetaField
    private String commissionsNotionalPrincipal;

    /**/
    @MetaField
    private String commissionsOptions;

    /**/
    @MetaField
    private String commissionsRates;

    /**/
    @MetaField
    private String commissionsSettlement;

    /**/
    @MetaField
    private String commissionsWorkProduct;

    public void setCommissionsCalendar(String commissionsCalendar) {
        this.commissionsCalendar = commissionsCalendar;
    }

    public String getCommissionsCalendar() {
        return commissionsCalendar;
    }

    public void setCommissionsCounterparty(String commissionsCounterparty) {
        this.commissionsCounterparty = commissionsCounterparty;
    }

    public String getCommissionsCounterparty() {
        return commissionsCounterparty;
    }

    public void setCommissionsDividend(String commissionsDividend) {
        this.commissionsDividend = commissionsDividend;
    }

    public String getCommissionsDividend() {
        return commissionsDividend;
    }

    public void setCommissionsFees(String commissionsFees) {
        this.commissionsFees = commissionsFees;
    }

    public String getCommissionsFees() {
        return commissionsFees;
    }

    public void setCommissionsInterest(String commissionsInterest) {
        this.commissionsInterest = commissionsInterest;
    }

    public String getCommissionsInterest() {
        return commissionsInterest;
    }

    public void setCommissionsMargining(String commissionsMargining) {
        this.commissionsMargining = commissionsMargining;
    }

    public String getCommissionsMargining() {
        return commissionsMargining;
    }

    public void setCommissionsNotionalPrincipal(String commissionsNotionalPrincipal) {
        this.commissionsNotionalPrincipal = commissionsNotionalPrincipal;
    }

    public String getCommissionsNotionalPrincipal() {
        return commissionsNotionalPrincipal;
    }

    public void setCommissionsOptions(String commissionsOptions) {
        this.commissionsOptions = commissionsOptions;
    }

    public String getCommissionsOptions() {
        return commissionsOptions;
    }

    public void setCommissionsRates(String commissionsRates) {
        this.commissionsRates = commissionsRates;
    }

    public String getCommissionsRates() {
        return commissionsRates;
    }

    public void setCommissionsSettlement(String commissionsSettlement) {
        this.commissionsSettlement = commissionsSettlement;
    }

    public String getCommissionsSettlement() {
        return commissionsSettlement;
    }

    public void setCommissionsWorkProduct(String commissionsWorkProduct) {
        this.commissionsWorkProduct = commissionsWorkProduct;
    }

    public String getCommissionsWorkProduct() {
        return commissionsWorkProduct;
    }
}