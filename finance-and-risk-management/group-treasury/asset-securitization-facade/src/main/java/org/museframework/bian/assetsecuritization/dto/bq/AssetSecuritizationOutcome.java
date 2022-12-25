/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Asset Securitization. 
Example: Execute a payment transaction.*/
package org.museframework.bian.assetsecuritization.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AssetSecuritizationOutcome {
    /**/
    @MetaField(0)
    private String assetSecuritizationCalendar;

    /**/
    @MetaField(0)
    private String assetSecuritizationCounterparty;

    /**/
    @MetaField(0)
    private String assetSecuritizationDividend;

    /**/
    @MetaField(0)
    private String assetSecuritizationFees;

    /**/
    @MetaField(0)
    private String assetSecuritizationInterest;

    /**/
    @MetaField(0)
    private String assetSecuritizationMargining;

    /**/
    @MetaField(0)
    private String assetSecuritizationNotionalPrincipal;

    /**/
    @MetaField(0)
    private String assetSecuritizationOptions;

    /**/
    @MetaField(0)
    private String assetSecuritizationRates;

    /**/
    @MetaField(0)
    private String assetSecuritizationSettlement;

    /**/
    @MetaField(0)
    private String assetSecuritizationWorkProduct;

    public void setAssetSecuritizationCalendar(String assetSecuritizationCalendar) {
        this.assetSecuritizationCalendar = assetSecuritizationCalendar;
    }

    public String getAssetSecuritizationCalendar() {
        return assetSecuritizationCalendar;
    }

    public void setAssetSecuritizationCounterparty(String assetSecuritizationCounterparty) {
        this.assetSecuritizationCounterparty = assetSecuritizationCounterparty;
    }

    public String getAssetSecuritizationCounterparty() {
        return assetSecuritizationCounterparty;
    }

    public void setAssetSecuritizationDividend(String assetSecuritizationDividend) {
        this.assetSecuritizationDividend = assetSecuritizationDividend;
    }

    public String getAssetSecuritizationDividend() {
        return assetSecuritizationDividend;
    }

    public void setAssetSecuritizationFees(String assetSecuritizationFees) {
        this.assetSecuritizationFees = assetSecuritizationFees;
    }

    public String getAssetSecuritizationFees() {
        return assetSecuritizationFees;
    }

    public void setAssetSecuritizationInterest(String assetSecuritizationInterest) {
        this.assetSecuritizationInterest = assetSecuritizationInterest;
    }

    public String getAssetSecuritizationInterest() {
        return assetSecuritizationInterest;
    }

    public void setAssetSecuritizationMargining(String assetSecuritizationMargining) {
        this.assetSecuritizationMargining = assetSecuritizationMargining;
    }

    public String getAssetSecuritizationMargining() {
        return assetSecuritizationMargining;
    }

    public void setAssetSecuritizationNotionalPrincipal(String assetSecuritizationNotionalPrincipal) {
        this.assetSecuritizationNotionalPrincipal = assetSecuritizationNotionalPrincipal;
    }

    public String getAssetSecuritizationNotionalPrincipal() {
        return assetSecuritizationNotionalPrincipal;
    }

    public void setAssetSecuritizationOptions(String assetSecuritizationOptions) {
        this.assetSecuritizationOptions = assetSecuritizationOptions;
    }

    public String getAssetSecuritizationOptions() {
        return assetSecuritizationOptions;
    }

    public void setAssetSecuritizationRates(String assetSecuritizationRates) {
        this.assetSecuritizationRates = assetSecuritizationRates;
    }

    public String getAssetSecuritizationRates() {
        return assetSecuritizationRates;
    }

    public void setAssetSecuritizationSettlement(String assetSecuritizationSettlement) {
        this.assetSecuritizationSettlement = assetSecuritizationSettlement;
    }

    public String getAssetSecuritizationSettlement() {
        return assetSecuritizationSettlement;
    }

    public void setAssetSecuritizationWorkProduct(String assetSecuritizationWorkProduct) {
        this.assetSecuritizationWorkProduct = assetSecuritizationWorkProduct;
    }

    public String getAssetSecuritizationWorkProduct() {
        return assetSecuritizationWorkProduct;
    }
}