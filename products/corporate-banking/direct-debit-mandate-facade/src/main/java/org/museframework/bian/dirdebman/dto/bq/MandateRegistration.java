/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.dirdebman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MandateRegistration {
    /*Reference to the customer providing the mandate to the corporate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object directDebitMandateCustomerReference;

    /*The reference used to identify the customer to the corporate subject of the mandate (maintains secrecy of bank's internal reference)*/
    @MetaField(0)
    private String directDebitMandateCustomerPseudonym;

    /*The bank holding the payer's account*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object directDebitMandateBankReference;

    /*Reference to the payer's account*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object directDebitMandateAccountReference;

    /*The period for which the customer mandate is in force*/
    @MetaField(0)
    private String directDebitMandateValidDates;

    /*Description of allowed usage details and restrictions that apply to use of the mandate (e.g. maximum amount and frequency)*/
    @MetaField(0)
    private String directDebitMandateTerms;

    /*Reference to the correspondence generated and received with the maintenance of the mandate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*Correspondence content - direct debit mandate agreement messages and forms sent and completed by involved parties*/
    @MetaField(0)
    private String correspondenceContent;

    /*The document reference for associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Document content - legal documents created & referenced for the mandate*/
    @MetaField(0)
    private String documentContent;

    public void setDirectDebitMandateCustomerReference(org.museframework.bian.classes.Object directDebitMandateCustomerReference) {
        this.directDebitMandateCustomerReference = directDebitMandateCustomerReference;
    }

    public org.museframework.bian.classes.Object getDirectDebitMandateCustomerReference() {
        return directDebitMandateCustomerReference;
    }

    public void setDirectDebitMandateCustomerPseudonym(String directDebitMandateCustomerPseudonym) {
        this.directDebitMandateCustomerPseudonym = directDebitMandateCustomerPseudonym;
    }

    public String getDirectDebitMandateCustomerPseudonym() {
        return directDebitMandateCustomerPseudonym;
    }

    public void setDirectDebitMandateBankReference(org.museframework.bian.classes.Object directDebitMandateBankReference) {
        this.directDebitMandateBankReference = directDebitMandateBankReference;
    }

    public org.museframework.bian.classes.Object getDirectDebitMandateBankReference() {
        return directDebitMandateBankReference;
    }

    public void setDirectDebitMandateAccountReference(org.museframework.bian.classes.Object directDebitMandateAccountReference) {
        this.directDebitMandateAccountReference = directDebitMandateAccountReference;
    }

    public org.museframework.bian.classes.Object getDirectDebitMandateAccountReference() {
        return directDebitMandateAccountReference;
    }

    public void setDirectDebitMandateValidDates(String directDebitMandateValidDates) {
        this.directDebitMandateValidDates = directDebitMandateValidDates;
    }

    public String getDirectDebitMandateValidDates() {
        return directDebitMandateValidDates;
    }

    public void setDirectDebitMandateTerms(String directDebitMandateTerms) {
        this.directDebitMandateTerms = directDebitMandateTerms;
    }

    public String getDirectDebitMandateTerms() {
        return directDebitMandateTerms;
    }

    public void setCorrespondenceInstanceReference(org.museframework.bian.classes.Object correspondenceInstanceReference) {
        this.correspondenceInstanceReference = correspondenceInstanceReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceInstanceReference() {
        return correspondenceInstanceReference;
    }

    public void setCorrespondenceContent(String correspondenceContent) {
        this.correspondenceContent = correspondenceContent;
    }

    public String getCorrespondenceContent() {
        return correspondenceContent;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    public String getDocumentContent() {
        return documentContent;
    }
}