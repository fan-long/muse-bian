/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardcollections.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PaymentTerms {
    /*Reference to a contact established with the customer*/
    @MetaField(0)
    private String cardCollectionsPaymentTermsContactRecord;

    /*Content of the reminder message*/
    @MetaField(0)
    private String contactMessage;

    /*The date and time of the contact*/
    @MetaField(0)
    private String contactDate;

    /*Any response arising from the contact*/
    @MetaField(0)
    private String contactResult;

    /*The document reference for associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Document copy/content - legal documents created & referenced*/
    @MetaField(0)
    private String documentContent;

    /*Reference to the correspondence generated and received*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*Correspondence content - repayment negotiation/payment request messages sent to involved parties*/
    @MetaField(0)
    private String correspondenceContent;

    /*The payment terms renegotiation decision, includes renegotiated terms and repayment schedule*/
    @MetaField(0)
    private String cardCollectionsPaymentTermsRenegotiationDecision;

    /*Work documentation, forms and schedules produced and referenced during the task*/
    @MetaField(0)
    private String cardCollectionsPaymentTermsWorkProduct;

    public void setCardCollectionsPaymentTermsContactRecord(String cardCollectionsPaymentTermsContactRecord) {
        this.cardCollectionsPaymentTermsContactRecord = cardCollectionsPaymentTermsContactRecord;
    }

    public String getCardCollectionsPaymentTermsContactRecord() {
        return cardCollectionsPaymentTermsContactRecord;
    }

    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }

    public String getContactMessage() {
        return contactMessage;
    }

    public void setContactDate(String contactDate) {
        this.contactDate = contactDate;
    }

    public String getContactDate() {
        return contactDate;
    }

    public void setContactResult(String contactResult) {
        this.contactResult = contactResult;
    }

    public String getContactResult() {
        return contactResult;
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

    public void setCardCollectionsPaymentTermsRenegotiationDecision(String cardCollectionsPaymentTermsRenegotiationDecision) {
        this.cardCollectionsPaymentTermsRenegotiationDecision = cardCollectionsPaymentTermsRenegotiationDecision;
    }

    public String getCardCollectionsPaymentTermsRenegotiationDecision() {
        return cardCollectionsPaymentTermsRenegotiationDecision;
    }

    public void setCardCollectionsPaymentTermsWorkProduct(String cardCollectionsPaymentTermsWorkProduct) {
        this.cardCollectionsPaymentTermsWorkProduct = cardCollectionsPaymentTermsWorkProduct;
    }

    public String getCardCollectionsPaymentTermsWorkProduct() {
        return cardCollectionsPaymentTermsWorkProduct;
    }
}