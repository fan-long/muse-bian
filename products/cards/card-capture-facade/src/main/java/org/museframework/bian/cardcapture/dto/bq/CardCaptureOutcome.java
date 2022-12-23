/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture. 
Example: Execute a payment transaction.*/
package org.museframework.bian.cardcapture.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CardCaptureOutcome {
    /**/
    @MetaField
    private String cardCaptureCalendar;

    /**/
    @MetaField
    private String cardCaptureCounterparty;

    /**/
    @MetaField
    private String cardCaptureDividend;

    /**/
    @MetaField
    private String cardCaptureFees;

    /**/
    @MetaField
    private String cardCaptureInterest;

    /**/
    @MetaField
    private String cardCaptureMargining;

    /**/
    @MetaField
    private String cardCaptureNotionalPrincipal;

    /**/
    @MetaField
    private String cardCaptureOptions;

    /**/
    @MetaField
    private String cardCaptureRates;

    /**/
    @MetaField
    private String cardCaptureSettlement;

    /**/
    @MetaField
    private String cardCaptureWorkProduct;

    public void setCardCaptureCalendar(String cardCaptureCalendar) {
        this.cardCaptureCalendar = cardCaptureCalendar;
    }

    public String getCardCaptureCalendar() {
        return cardCaptureCalendar;
    }

    public void setCardCaptureCounterparty(String cardCaptureCounterparty) {
        this.cardCaptureCounterparty = cardCaptureCounterparty;
    }

    public String getCardCaptureCounterparty() {
        return cardCaptureCounterparty;
    }

    public void setCardCaptureDividend(String cardCaptureDividend) {
        this.cardCaptureDividend = cardCaptureDividend;
    }

    public String getCardCaptureDividend() {
        return cardCaptureDividend;
    }

    public void setCardCaptureFees(String cardCaptureFees) {
        this.cardCaptureFees = cardCaptureFees;
    }

    public String getCardCaptureFees() {
        return cardCaptureFees;
    }

    public void setCardCaptureInterest(String cardCaptureInterest) {
        this.cardCaptureInterest = cardCaptureInterest;
    }

    public String getCardCaptureInterest() {
        return cardCaptureInterest;
    }

    public void setCardCaptureMargining(String cardCaptureMargining) {
        this.cardCaptureMargining = cardCaptureMargining;
    }

    public String getCardCaptureMargining() {
        return cardCaptureMargining;
    }

    public void setCardCaptureNotionalPrincipal(String cardCaptureNotionalPrincipal) {
        this.cardCaptureNotionalPrincipal = cardCaptureNotionalPrincipal;
    }

    public String getCardCaptureNotionalPrincipal() {
        return cardCaptureNotionalPrincipal;
    }

    public void setCardCaptureOptions(String cardCaptureOptions) {
        this.cardCaptureOptions = cardCaptureOptions;
    }

    public String getCardCaptureOptions() {
        return cardCaptureOptions;
    }

    public void setCardCaptureRates(String cardCaptureRates) {
        this.cardCaptureRates = cardCaptureRates;
    }

    public String getCardCaptureRates() {
        return cardCaptureRates;
    }

    public void setCardCaptureSettlement(String cardCaptureSettlement) {
        this.cardCaptureSettlement = cardCaptureSettlement;
    }

    public String getCardCaptureSettlement() {
        return cardCaptureSettlement;
    }

    public void setCardCaptureWorkProduct(String cardCaptureWorkProduct) {
        this.cardCaptureWorkProduct = cardCaptureWorkProduct;
    }

    public String getCardCaptureWorkProduct() {
        return cardCaptureWorkProduct;
    }
}