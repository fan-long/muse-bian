/*Maintain the terms and conditions that apply to a commercial relationship within Customer Agreement.


*/
package org.museframework.bian.customeragreement.dto.cr;

public class CustomerAgreement extends org.museframework.bian.classes.CustomerAgreement {
    /*Reference to the associated customer (can currently be a person or a company)*/
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the legal entity that is the subject of the agreement*/
    private org.museframework.bian.classes.Object legalEntityReference;

    /*The type of customer agreement (e.g. individual, corporate)*/
    private String agreementType;

    /*The contractual jurisdiction or coverage of the agreement (e.g. "governed by State")*/
    private String agreementJurisdiction;

    /*The term of the agreement*/
    private String agreementValidFromToDate;

    /*Reference to signatories*/
    private String agreementSignatoriesResponsibleParties;

    /*Reference to any associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to product specific T&Cs maintained elsewhere but subordinate to this agreement*/
    private org.museframework.bian.classes.Object salesProductAgreementReference;

    /*Reference to KYC/Regulatory assessments maintained elsewhere for the customer*/
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

    public void setSalesProductAgreementReference(org.museframework.bian.classes.Object salesProductAgreementReference) {
        this.salesProductAgreementReference = salesProductAgreementReference;
    }

    public org.museframework.bian.classes.Object getSalesProductAgreementReference() {
        return salesProductAgreementReference;
    }

    public void setPartyLife_cycleManagementReference(org.museframework.bian.classes.Object partyLife_cycleManagementReference) {
        this.partyLife_cycleManagementReference = partyLife_cycleManagementReference;
    }

    public org.museframework.bian.classes.Object getPartyLife_cycleManagementReference() {
        return partyLife_cycleManagementReference;
    }
}