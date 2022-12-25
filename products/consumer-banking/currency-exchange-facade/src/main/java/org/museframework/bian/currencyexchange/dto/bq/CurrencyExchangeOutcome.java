/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Currency Exchange. 
Example: Execute a payment transaction.*/
package org.museframework.bian.currencyexchange.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CurrencyExchangeOutcome {
    /**/
    @MetaField(0)
    private String currencyExchangeCalendar;

    /**/
    @MetaField(0)
    private String currencyExchangeCounterparty;

    /**/
    @MetaField(0)
    private String currencyExchangeDividend;

    /**/
    @MetaField(0)
    private String currencyExchangeFees;

    /**/
    @MetaField(0)
    private String currencyExchangeInterest;

    /**/
    @MetaField(0)
    private String currencyExchangeMargining;

    /**/
    @MetaField(0)
    private String currencyExchangeNotionalPrincipal;

    /**/
    @MetaField(0)
    private String currencyExchangeOptions;

    /**/
    @MetaField(0)
    private String currencyExchangeRates;

    /**/
    @MetaField(0)
    private String currencyExchangeSettlement;

    /**/
    @MetaField(0)
    private String currencyExchangeWorkProduct;

    public void setCurrencyExchangeCalendar(String currencyExchangeCalendar) {
        this.currencyExchangeCalendar = currencyExchangeCalendar;
    }

    public String getCurrencyExchangeCalendar() {
        return currencyExchangeCalendar;
    }

    public void setCurrencyExchangeCounterparty(String currencyExchangeCounterparty) {
        this.currencyExchangeCounterparty = currencyExchangeCounterparty;
    }

    public String getCurrencyExchangeCounterparty() {
        return currencyExchangeCounterparty;
    }

    public void setCurrencyExchangeDividend(String currencyExchangeDividend) {
        this.currencyExchangeDividend = currencyExchangeDividend;
    }

    public String getCurrencyExchangeDividend() {
        return currencyExchangeDividend;
    }

    public void setCurrencyExchangeFees(String currencyExchangeFees) {
        this.currencyExchangeFees = currencyExchangeFees;
    }

    public String getCurrencyExchangeFees() {
        return currencyExchangeFees;
    }

    public void setCurrencyExchangeInterest(String currencyExchangeInterest) {
        this.currencyExchangeInterest = currencyExchangeInterest;
    }

    public String getCurrencyExchangeInterest() {
        return currencyExchangeInterest;
    }

    public void setCurrencyExchangeMargining(String currencyExchangeMargining) {
        this.currencyExchangeMargining = currencyExchangeMargining;
    }

    public String getCurrencyExchangeMargining() {
        return currencyExchangeMargining;
    }

    public void setCurrencyExchangeNotionalPrincipal(String currencyExchangeNotionalPrincipal) {
        this.currencyExchangeNotionalPrincipal = currencyExchangeNotionalPrincipal;
    }

    public String getCurrencyExchangeNotionalPrincipal() {
        return currencyExchangeNotionalPrincipal;
    }

    public void setCurrencyExchangeOptions(String currencyExchangeOptions) {
        this.currencyExchangeOptions = currencyExchangeOptions;
    }

    public String getCurrencyExchangeOptions() {
        return currencyExchangeOptions;
    }

    public void setCurrencyExchangeRates(String currencyExchangeRates) {
        this.currencyExchangeRates = currencyExchangeRates;
    }

    public String getCurrencyExchangeRates() {
        return currencyExchangeRates;
    }

    public void setCurrencyExchangeSettlement(String currencyExchangeSettlement) {
        this.currencyExchangeSettlement = currencyExchangeSettlement;
    }

    public String getCurrencyExchangeSettlement() {
        return currencyExchangeSettlement;
    }

    public void setCurrencyExchangeWorkProduct(String currencyExchangeWorkProduct) {
        this.currencyExchangeWorkProduct = currencyExchangeWorkProduct;
    }

    public String getCurrencyExchangeWorkProduct() {
        return currencyExchangeWorkProduct;
    }
}