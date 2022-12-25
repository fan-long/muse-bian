/*Maintain the terms and conditions that apply to a commercial relationship within Sales Product Agreement.


*/
package org.museframework.bian.salproagr.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SalesProductAgreement {
    /*Reference to the associated customer (can currently be a person or a company)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the legal entity that is the subject of the agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object legalEntityReference;

    /*Reference to the type of product/service covered by the agreement*/
    @MetaField(0)
    private String productandServiceType;

    /*Reference to the specific product instance covered by the sales product agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The type of customer agreement (e.g. individual, corporate)*/
    @MetaField(0)
    private String agreementType;

    /*The contractual jurisdiction or coverage of the agreement (e.g. "governed by State")*/
    @MetaField(0)
    private String agreementJurisdiction;

    /*The term of the agreement*/
    @MetaField(0)
    private String agreementValidFromToDate;

    /*Reference to signatories*/
    @MetaField(0)
    private String agreementSignatoriesResponsibleParties;

    /*Reference to any associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to the customer master agreement that governs the product agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerAgreementReference;

    /*Reference to KYC/Regulatory assessments maintained elsewhere for the customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object partyLife_cycleManagementReference;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setLegalEntityReference(org.museframework.bian.classes.Object legalEntityReference) {
        this.legalEntityReference = legalEntityReference;
    }

    public org.museframework.bian.classes.Object getLegalEntityReference() {
        return legalEntityReference;
    }

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }

    public String getAgreementType() {
        return agreementType;
    }

    public void setAgreementJurisdiction(String agreementJurisdiction) {
        this.agreementJurisdiction = agreementJurisdiction;
    }

    public String getAgreementJurisdiction() {
        return agreementJurisdiction;
    }

    public void setAgreementValidFromToDate(String agreementValidFromToDate) {
        this.agreementValidFromToDate = agreementValidFromToDate;
    }

    public String getAgreementValidFromToDate() {
        return agreementValidFromToDate;
    }

    public void setAgreementSignatoriesResponsibleParties(String agreementSignatoriesResponsibleParties) {
        this.agreementSignatoriesResponsibleParties = agreementSignatoriesResponsibleParties;
    }

    public String getAgreementSignatoriesResponsibleParties() {
        return agreementSignatoriesResponsibleParties;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setCustomerAgreementReference(org.museframework.bian.classes.Object customerAgreementReference) {
        this.customerAgreementReference = customerAgreementReference;
    }

    public org.museframework.bian.classes.Object getCustomerAgreementReference() {
        return customerAgreementReference;
    }

    public void setPartyLife_cycleManagementReference(org.museframework.bian.classes.Object partyLife_cycleManagementReference) {
        this.partyLife_cycleManagementReference = partyLife_cycleManagementReference;
    }

    public org.museframework.bian.classes.Object getPartyLife_cycleManagementReference() {
        return partyLife_cycleManagementReference;
    }
}