/*Maintain the terms and conditions that apply to a commercial relationship within Servicing Mandate.


*/
package org.museframework.bian.servicingmandate.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ServicingMandateAgreement {
    /*Reference to the third party service provider with the servicing mandate (also a bank customer)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The type of third party mandates (e.g. PSD2)*/
    @MetaField(0)
    private String servicingMandateAgreementType;

    /*The defines any limitation on the geographic coverage/scope of the mandate*/
    @MetaField(0)
    private String servicingMandateAgreementJurisdiction;

    /*The term for the mandate to be in force*/
    @MetaField(0)
    private String servicingMandateAgreementValidFromToDate;

    /*Reference to any involved authorities and interested parties*/
    @MetaField(0)
    private String servicingMandateAgreementResponsibleParties;

    /*Reference to any supporting documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to the record that defines allowed access*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object servicingMandateAgreementProductandServiceProfileReference;

    /*The record of the overarching product/service access profile permitted under the servicing mandate*/
    @MetaField(0)
    private String servicingMandateAgreementProductandServiceProfile;

    /*A type of product or service covered by the mandate*/
    @MetaField(0)
    private String productandServiceType;

    /*Defines if and under what terms a product/service is accessible under the mandate*/
    @MetaField(0)
    private String servicingMandateAgreementProductandServiceTypeEligibility;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setServicingMandateAgreementType(String servicingMandateAgreementType) {
        this.servicingMandateAgreementType = servicingMandateAgreementType;
    }

    public String getServicingMandateAgreementType() {
        return servicingMandateAgreementType;
    }

    public void setServicingMandateAgreementJurisdiction(String servicingMandateAgreementJurisdiction) {
        this.servicingMandateAgreementJurisdiction = servicingMandateAgreementJurisdiction;
    }

    public String getServicingMandateAgreementJurisdiction() {
        return servicingMandateAgreementJurisdiction;
    }

    public void setServicingMandateAgreementValidFromToDate(String servicingMandateAgreementValidFromToDate) {
        this.servicingMandateAgreementValidFromToDate = servicingMandateAgreementValidFromToDate;
    }

    public String getServicingMandateAgreementValidFromToDate() {
        return servicingMandateAgreementValidFromToDate;
    }

    public void setServicingMandateAgreementResponsibleParties(String servicingMandateAgreementResponsibleParties) {
        this.servicingMandateAgreementResponsibleParties = servicingMandateAgreementResponsibleParties;
    }

    public String getServicingMandateAgreementResponsibleParties() {
        return servicingMandateAgreementResponsibleParties;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setServicingMandateAgreementProductandServiceProfileReference(org.museframework.bian.classes.Object servicingMandateAgreementProductandServiceProfileReference) {
        this.servicingMandateAgreementProductandServiceProfileReference = servicingMandateAgreementProductandServiceProfileReference;
    }

    public org.museframework.bian.classes.Object getServicingMandateAgreementProductandServiceProfileReference() {
        return servicingMandateAgreementProductandServiceProfileReference;
    }

    public void setServicingMandateAgreementProductandServiceProfile(String servicingMandateAgreementProductandServiceProfile) {
        this.servicingMandateAgreementProductandServiceProfile = servicingMandateAgreementProductandServiceProfile;
    }

    public String getServicingMandateAgreementProductandServiceProfile() {
        return servicingMandateAgreementProductandServiceProfile;
    }

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setServicingMandateAgreementProductandServiceTypeEligibility(String servicingMandateAgreementProductandServiceTypeEligibility) {
        this.servicingMandateAgreementProductandServiceTypeEligibility = servicingMandateAgreementProductandServiceTypeEligibility;
    }

    public String getServicingMandateAgreementProductandServiceTypeEligibility() {
        return servicingMandateAgreementProductandServiceTypeEligibility;
    }
}