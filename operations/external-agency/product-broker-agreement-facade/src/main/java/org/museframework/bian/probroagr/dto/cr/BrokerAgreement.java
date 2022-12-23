/*Maintain the terms and conditions that apply to a commercial relationship within Product Broker Agreement.


*/
package org.museframework.bian.probroagr.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BrokerAgreement {
    /*Reference to the broker organization*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object partyReference;

    /*The type of agreement (e.g. service provider, product alliance)*/
    @MetaField
    private String agreementType;

    /*The contractual jurisdiction or coverage of the agreement (e.g. "governed by State")*/
    @MetaField
    private String agreementJurisdiction;

    /*The term of the agreement*/
    @MetaField
    private String agreementValidFromToDate;

    /*Reference to signatories*/
    @MetaField
    private String agreementSignaturesResponsibleParties;

    /*Reference to any associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    public void setPartyReference(org.museframework.bian.classes.Object partyReference) {
        this.partyReference = partyReference;
    }

    public org.museframework.bian.classes.Object getPartyReference() {
        return partyReference;
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

    public void setAgreementSignaturesResponsibleParties(String agreementSignaturesResponsibleParties) {
        this.agreementSignaturesResponsibleParties = agreementSignaturesResponsibleParties;
    }

    public String getAgreementSignaturesResponsibleParties() {
        return agreementSignaturesResponsibleParties;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }
}