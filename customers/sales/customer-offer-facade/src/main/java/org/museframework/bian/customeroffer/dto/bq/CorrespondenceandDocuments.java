/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorrespondenceandDocuments {
    /*Description of the required documents and time limits on receipt where appropriate*/
    @MetaField(0)
    private String customerOfferRequiredDocuments;

    /*Reference to the correspondence generated and received*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*Correspondence content - messages sent to and received from involved parties*/
    @MetaField(0)
    private String correspondenceContent;

    /*The document reference for associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Document copy/content - legal or significant documents created & referenced*/
    @MetaField(0)
    private String documentContent;

    public void setCustomerOfferRequiredDocuments(String customerOfferRequiredDocuments) {
        this.customerOfferRequiredDocuments = customerOfferRequiredDocuments;
    }

    public String getCustomerOfferRequiredDocuments() {
        return customerOfferRequiredDocuments;
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