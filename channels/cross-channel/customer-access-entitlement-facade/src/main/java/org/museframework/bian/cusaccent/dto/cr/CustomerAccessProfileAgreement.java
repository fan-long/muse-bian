/*Maintain the terms and conditions that apply to a commercial relationship within Customer Access Entitlement.


*/
package org.museframework.bian.cusaccent.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerAccessProfileAgreement {
    /*Reference to the customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The overall access profile, combining the restrictions and preferences from subordinate qualifiers*/
    @MetaField(0)
    private String customerChannelAccessProfileRecord;

    /*The duration that the agreement is in force*/
    @MetaField(0)
    private String customerAccessAgreementValidFromToDate;

    /*Reference to signatories as appropriate*/
    @MetaField(0)
    private String customerAccessAgreementSignaturesResponsibleParties;

    /*Reference to any associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerChannelAccessProfileRecord(String customerChannelAccessProfileRecord) {
        this.customerChannelAccessProfileRecord = customerChannelAccessProfileRecord;
    }

    public String getCustomerChannelAccessProfileRecord() {
        return customerChannelAccessProfileRecord;
    }

    public void setCustomerAccessAgreementValidFromToDate(String customerAccessAgreementValidFromToDate) {
        this.customerAccessAgreementValidFromToDate = customerAccessAgreementValidFromToDate;
    }

    public String getCustomerAccessAgreementValidFromToDate() {
        return customerAccessAgreementValidFromToDate;
    }

    public void setCustomerAccessAgreementSignaturesResponsibleParties(String customerAccessAgreementSignaturesResponsibleParties) {
        this.customerAccessAgreementSignaturesResponsibleParties = customerAccessAgreementSignaturesResponsibleParties;
    }

    public String getCustomerAccessAgreementSignaturesResponsibleParties() {
        return customerAccessAgreementSignaturesResponsibleParties;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }
}