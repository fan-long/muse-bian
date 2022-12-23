/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Asset Securitization. 
Example: Execute a payment transaction.*/
package org.museframework.bian.assetsecuritization.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AssetSecuritizationOutcome {
    /**/
    @MetaField
    private String assetSecuritizationCalendar;

    /**/
    @MetaField
    private String assetSecuritizationCounterparty;

    /**/
    @MetaField
    private String assetSecuritizationDividend;

    /**/
    @MetaField
    private String assetSecuritizationFees;

    /**/
    @MetaField
    private String assetSecuritizationInterest;

    /**/
    @MetaField
    private String assetSecuritizationMargining;

    /**/
    @MetaField
    private String assetSecuritizationNotionalPrincipal;

    /**/
    @MetaField
    private String assetSecuritizationOptions;

    /**/
    @MetaField
    private String assetSecuritizationRates;

    /**/
    @MetaField
    private String assetSecuritizationSettlement;

    /**/
    @MetaField
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