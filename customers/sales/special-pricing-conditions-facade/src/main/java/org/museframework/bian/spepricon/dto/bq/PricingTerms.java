/*Capture and maintain reference information about some type of entitity  within Special Pricing Conditions.*/
package org.museframework.bian.spepricon.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PricingTerms {
    /*The required status/situation before the property is valid/meaningful*/
    @MetaField
    private String pricingTermsPreconditions;

    /*The schedule and timing for which the property value is valid*/
    @MetaField
    private String pricingTermsPropertySchedule;

    /*The version reference for the property value*/
    @MetaField
    private String pricingTermsVersionNumber;

    /*The Special Pricing Conditions Directory Entry specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService specialPricingterms;

    /*Reference to the specific business service type*/
    @MetaField
    private String specialPricingtermsServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String specialPricingtermsServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String specialPricingtermsServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String specialPricingtermsServiceWorkProduct;

    /**/
    @MetaField
    private String specialPricingtermsServiceName;

    public void setPricingTermsPreconditions(String pricingTermsPreconditions) {
        this.pricingTermsPreconditions = pricingTermsPreconditions;
    }

    public String getPricingTermsPreconditions() {
        return pricingTermsPreconditions;
    }

    public void setPricingTermsPropertySchedule(String pricingTermsPropertySchedule) {
        this.pricingTermsPropertySchedule = pricingTermsPropertySchedule;
    }

    public String getPricingTermsPropertySchedule() {
        return pricingTermsPropertySchedule;
    }

    public void setPricingTermsVersionNumber(String pricingTermsVersionNumber) {
        this.pricingTermsVersionNumber = pricingTermsVersionNumber;
    }

    public String getPricingTermsVersionNumber() {
        return pricingTermsVersionNumber;
    }

    public void setSpecialPricingterms(org.museframework.bian.classes.BusinessService specialPricingterms) {
        this.specialPricingterms = specialPricingterms;
    }

    public org.museframework.bian.classes.BusinessService getSpecialPricingterms() {
        return specialPricingterms;
    }

    public void setSpecialPricingtermsServiceType(String specialPricingtermsServiceType) {
        this.specialPricingtermsServiceType = specialPricingtermsServiceType;
    }

    public String getSpecialPricingtermsServiceType() {
        return specialPricingtermsServiceType;
    }

    public void setSpecialPricingtermsServiceDescription(String specialPricingtermsServiceDescription) {
        this.specialPricingtermsServiceDescription = specialPricingtermsServiceDescription;
    }

    public String getSpecialPricingtermsServiceDescription() {
        return specialPricingtermsServiceDescription;
    }

    public void setSpecialPricingtermsServiceInputsandOuputs(String specialPricingtermsServiceInputsandOuputs) {
        this.specialPricingtermsServiceInputsandOuputs = specialPricingtermsServiceInputsandOuputs;
    }

    public String getSpecialPricingtermsServiceInputsandOuputs() {
        return specialPricingtermsServiceInputsandOuputs;
    }

    public void setSpecialPricingtermsServiceWorkProduct(String specialPricingtermsServiceWorkProduct) {
        this.specialPricingtermsServiceWorkProduct = specialPricingtermsServiceWorkProduct;
    }

    public String getSpecialPricingtermsServiceWorkProduct() {
        return specialPricingtermsServiceWorkProduct;
    }

    public void setSpecialPricingtermsServiceName(String specialPricingtermsServiceName) {
        this.specialPricingtermsServiceName = specialPricingtermsServiceName;
    }

    public String getSpecialPricingtermsServiceName() {
        return specialPricingtermsServiceName;
    }
}