/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customercase.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Resolution {
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

    /*Business unit responsible for the customer case resolution actions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to the resolution payment order when financial adjustments are required to resolve the customer case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentOrderReference;

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

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setPaymentOrderReference(org.museframework.bian.classes.Object paymentOrderReference) {
        this.paymentOrderReference = paymentOrderReference;
    }

    public org.museframework.bian.classes.Object getPaymentOrderReference() {
        return paymentOrderReference;
    }
}