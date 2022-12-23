/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.regulatoryreporting.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Enquiries {
    /*The description of the requested information for the regulatory enquiry*/
    @MetaField
    private String regulatoryEnquiry;

    /*The business unit being assessed for enquiry if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object enquiryBusinessUnitReference;

    /*The instances of products/services being assessed if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object enquiryProductandServiceReference;

    /*Reference to the customer being assessed if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object enquiryCustomerReference;

    /*The possibly extensive collection of production transaction records assembled for the enquiry*/
    @MetaField
    private String enquiryTransactionRecords;

    /*Work documentation, forms and schedules produced and referenced during the enquiry*/
    @MetaField
    private String regulatoryEnquiryWorkProducts;

    /*The record or report that is the outcome/result of the enquiry*/
    @MetaField
    private String regulatoryEnquiryResult;

    /*The document reference for all classified/archived documents from the enquiry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object regulatoryEnquiryDocumentReference;

    public void setRegulatoryEnquiry(String regulatoryEnquiry) {
        this.regulatoryEnquiry = regulatoryEnquiry;
    }

    public String getRegulatoryEnquiry() {
        return regulatoryEnquiry;
    }

    public void setEnquiryBusinessUnitReference(org.museframework.bian.classes.Object enquiryBusinessUnitReference) {
        this.enquiryBusinessUnitReference = enquiryBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEnquiryBusinessUnitReference() {
        return enquiryBusinessUnitReference;
    }

    public void setEnquiryProductandServiceReference(org.museframework.bian.classes.Object enquiryProductandServiceReference) {
        this.enquiryProductandServiceReference = enquiryProductandServiceReference;
    }

    public org.museframework.bian.classes.Object getEnquiryProductandServiceReference() {
        return enquiryProductandServiceReference;
    }

    public void setEnquiryCustomerReference(org.museframework.bian.classes.Object enquiryCustomerReference) {
        this.enquiryCustomerReference = enquiryCustomerReference;
    }

    public org.museframework.bian.classes.Object getEnquiryCustomerReference() {
        return enquiryCustomerReference;
    }

    public void setEnquiryTransactionRecords(String enquiryTransactionRecords) {
        this.enquiryTransactionRecords = enquiryTransactionRecords;
    }

    public String getEnquiryTransactionRecords() {
        return enquiryTransactionRecords;
    }

    public void setRegulatoryEnquiryWorkProducts(String regulatoryEnquiryWorkProducts) {
        this.regulatoryEnquiryWorkProducts = regulatoryEnquiryWorkProducts;
    }

    public String getRegulatoryEnquiryWorkProducts() {
        return regulatoryEnquiryWorkProducts;
    }

    public void setRegulatoryEnquiryResult(String regulatoryEnquiryResult) {
        this.regulatoryEnquiryResult = regulatoryEnquiryResult;
    }

    public String getRegulatoryEnquiryResult() {
        return regulatoryEnquiryResult;
    }

    public void setRegulatoryEnquiryDocumentReference(org.museframework.bian.classes.Object regulatoryEnquiryDocumentReference) {
        this.regulatoryEnquiryDocumentReference = regulatoryEnquiryDocumentReference;
    }

    public org.museframework.bian.classes.Object getRegulatoryEnquiryDocumentReference() {
        return regulatoryEnquiryDocumentReference;
    }
}