/*An arrangement which specifies the acceptance of the standing order, accompanied by the modalities. */
package org.museframework.bian.classes;

public class StandingOrderArrangement {
    /*Frequency of the investment or divestment, eg, daily, weekly, or monthly. (ISO20022)*/
    private String standingOrderFrequency;

    /*The purpose of a standing order*/
    private String standingOrderPurpose;

    /*The Amount of a standing order*/
    private String standingOrderAmount;

    /*The currency in which the amount of a standing order is expressed*/
    private String standingOrderCurrency;

    /*The party who is involved with the target account of standing order as owner*/
    private String standingOrderTargetAccountOwner;

    /*The identification of the target account of a standing order.*/
    private String standingOrderTargetAccountIdentification;

    /*The Bank who is responsible for the target account of a standing order  */
    private String standingOrderTargetAccountBank;

    /**/
    private Account standingOrderSourceAccount;

    /*Dates during which the standing order is in effect. (ISO20022)
*/
    private String standingOrderValidityPeriod;

    /*Specifies the date in a month for instance the 30th. (ISO20022)*/
    private String standingOrderDay;

    /**/
    private org.museframework.bian.enumerations.Arrangementtypevalues standingOrderArrangementType;

    public void setStandingOrderFrequency(String standingOrderFrequency) {
        this.standingOrderFrequency = standingOrderFrequency;
    }

    public String getStandingOrderFrequency() {
        return standingOrderFrequency;
    }

    public void setStandingOrderPurpose(String standingOrderPurpose) {
        this.standingOrderPurpose = standingOrderPurpose;
    }

    public String getStandingOrderPurpose() {
        return standingOrderPurpose;
    }

    public void setStandingOrderAmount(String standingOrderAmount) {
        this.standingOrderAmount = standingOrderAmount;
    }

    public String getStandingOrderAmount() {
        return standingOrderAmount;
    }

    public void setStandingOrderCurrency(String standingOrderCurrency) {
        this.standingOrderCurrency = standingOrderCurrency;
    }

    public String getStandingOrderCurrency() {
        return standingOrderCurrency;
    }

    public void setStandingOrderTargetAccountOwner(String standingOrderTargetAccountOwner) {
        this.standingOrderTargetAccountOwner = standingOrderTargetAccountOwner;
    }

    public String getStandingOrderTargetAccountOwner() {
        return standingOrderTargetAccountOwner;
    }

    public void setStandingOrderTargetAccountIdentification(String standingOrderTargetAccountIdentification) {
        this.standingOrderTargetAccountIdentification = standingOrderTargetAccountIdentification;
    }

    public String getStandingOrderTargetAccountIdentification() {
        return standingOrderTargetAccountIdentification;
    }

    public void setStandingOrderTargetAccountBank(String standingOrderTargetAccountBank) {
        this.standingOrderTargetAccountBank = standingOrderTargetAccountBank;
    }

    public String getStandingOrderTargetAccountBank() {
        return standingOrderTargetAccountBank;
    }

    public void setStandingOrderSourceAccount(Account standingOrderSourceAccount) {
        this.standingOrderSourceAccount = standingOrderSourceAccount;
    }

    public Account getStandingOrderSourceAccount() {
        return standingOrderSourceAccount;
    }

    public void setStandingOrderValidityPeriod(String standingOrderValidityPeriod) {
        this.standingOrderValidityPeriod = standingOrderValidityPeriod;
    }

    public String getStandingOrderValidityPeriod() {
        return standingOrderValidityPeriod;
    }

    public void setStandingOrderDay(String standingOrderDay) {
        this.standingOrderDay = standingOrderDay;
    }

    public String getStandingOrderDay() {
        return standingOrderDay;
    }

    public void setStandingOrderArrangementType(org.museframework.bian.enumerations.Arrangementtypevalues standingOrderArrangementType) {
        this.standingOrderArrangementType = standingOrderArrangementType;
    }

    public org.museframework.bian.enumerations.Arrangementtypevalues getStandingOrderArrangementType() {
        return standingOrderArrangementType;
    }
}