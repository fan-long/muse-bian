/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.parrefdatdir.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Reference {
    /*Reference to the legal entity - enables the assembly of the legal relationship structure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object partyLegalEntityReference;

    /*The preferred salutation to be used*/
    @MetaField(0)
    private String partyNameSalutation;

    /*Reference to government or agency issued identification (e.g. social security number)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object governmentIssuedIdentityReference;

    /*Details about and extracted from government issued documents (e.g. driving license/passport details)*/
    @MetaField(0)
    private String governmentIssuedDocumentDetails;

    /*The document reference for associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The residency status and history as appropriate*/
    @MetaField(0)
    private String residencyStatus;

    /*Give DoB*/
    @MetaField(0)
    private String dateofBirth;

    /*The customer nationality and history as appropriate*/
    @MetaField(0)
    private String nationality;

    /*Their given residential address*/
    @MetaField(0)
    private String residentialAddress;

    /*The given email address*/
    @MetaField(0)
    private String eMailAddress;

    /*Any given phone contact numbers*/
    @MetaField(0)
    private String cellPhoneNumber;

    /*Any given social network identifiers*/
    @MetaField(0)
    private String socialNetworkContacts;

    /*A politically exposed person indicator (PEP) (e.g. senior public figure, political position/exposure)*/
    @MetaField(0)
    private String politicalExposureType;

    /*Detail of the customer's political exposure*/
    @MetaField(0)
    private String politicalExposureDescriptionRecord;

    /*Reference to the corporate entity (Company for company customers)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object corporateCustomerReference;

    /*The legal entity reference (for company customers)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object corporateCustomerLegalEntityReference;

    /*The company registered address*/
    @MetaField(0)
    private String corporateAddress;

    /*Reference to one or more identified company officers for a corporate customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object companyOfficerReference;

    /*The specific role played by the identified officer/employee*/
    @MetaField(0)
    private String companyOfficerRole;

    /*The start date for the relationship*/
    @MetaField(0)
    private String customerSinceDate;

    public void setPartyLegalEntityReference(org.museframework.bian.classes.Object partyLegalEntityReference) {
        this.partyLegalEntityReference = partyLegalEntityReference;
    }

    public org.museframework.bian.classes.Object getPartyLegalEntityReference() {
        return partyLegalEntityReference;
    }

    public void setPartyNameSalutation(String partyNameSalutation) {
        this.partyNameSalutation = partyNameSalutation;
    }

    public String getPartyNameSalutation() {
        return partyNameSalutation;
    }

    public void setGovernmentIssuedIdentityReference(org.museframework.bian.classes.Object governmentIssuedIdentityReference) {
        this.governmentIssuedIdentityReference = governmentIssuedIdentityReference;
    }

    public org.museframework.bian.classes.Object getGovernmentIssuedIdentityReference() {
        return governmentIssuedIdentityReference;
    }

    public void setGovernmentIssuedDocumentDetails(String governmentIssuedDocumentDetails) {
        this.governmentIssuedDocumentDetails = governmentIssuedDocumentDetails;
    }

    public String getGovernmentIssuedDocumentDetails() {
        return governmentIssuedDocumentDetails;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setResidencyStatus(String residencyStatus) {
        this.residencyStatus = residencyStatus;
    }

    public String getResidencyStatus() {
        return residencyStatus;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void seteMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setSocialNetworkContacts(String socialNetworkContacts) {
        this.socialNetworkContacts = socialNetworkContacts;
    }

    public String getSocialNetworkContacts() {
        return socialNetworkContacts;
    }

    public void setPoliticalExposureType(String politicalExposureType) {
        this.politicalExposureType = politicalExposureType;
    }

    public String getPoliticalExposureType() {
        return politicalExposureType;
    }

    public void setPoliticalExposureDescriptionRecord(String politicalExposureDescriptionRecord) {
        this.politicalExposureDescriptionRecord = politicalExposureDescriptionRecord;
    }

    public String getPoliticalExposureDescriptionRecord() {
        return politicalExposureDescriptionRecord;
    }

    public void setCorporateCustomerReference(org.museframework.bian.classes.Object corporateCustomerReference) {
        this.corporateCustomerReference = corporateCustomerReference;
    }

    public org.museframework.bian.classes.Object getCorporateCustomerReference() {
        return corporateCustomerReference;
    }

    public void setCorporateCustomerLegalEntityReference(org.museframework.bian.classes.Object corporateCustomerLegalEntityReference) {
        this.corporateCustomerLegalEntityReference = corporateCustomerLegalEntityReference;
    }

    public org.museframework.bian.classes.Object getCorporateCustomerLegalEntityReference() {
        return corporateCustomerLegalEntityReference;
    }

    public void setCorporateAddress(String corporateAddress) {
        this.corporateAddress = corporateAddress;
    }

    public String getCorporateAddress() {
        return corporateAddress;
    }

    public void setCompanyOfficerReference(org.museframework.bian.classes.Object companyOfficerReference) {
        this.companyOfficerReference = companyOfficerReference;
    }

    public org.museframework.bian.classes.Object getCompanyOfficerReference() {
        return companyOfficerReference;
    }

    public void setCompanyOfficerRole(String companyOfficerRole) {
        this.companyOfficerRole = companyOfficerRole;
    }

    public String getCompanyOfficerRole() {
        return companyOfficerRole;
    }

    public void setCustomerSinceDate(String customerSinceDate) {
        this.customerSinceDate = customerSinceDate;
    }

    public String getCustomerSinceDate() {
        return customerSinceDate;
    }
}