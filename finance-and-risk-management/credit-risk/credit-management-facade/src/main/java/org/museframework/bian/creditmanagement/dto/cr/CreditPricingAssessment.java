/*To test or assess an entity, possibly against some formal qualification or certification requirement within Credit Management. */
package org.museframework.bian.creditmanagement.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditPricingAssessment {
    /*Business unit submitting the proposed transaction for review*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object businessUnitReference;

    /*Reference to the customer related to the proposed transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The sector where the proposed transaction would be booked*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object sectorReference;

    /*The product type/category of the proposed transaction for the credit pricing assessment*/
    @MetaField
    private String productType;

    /*Reference to proposed transaction submitted for assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object proposedTransactionReference;

    /*Key details of the proposed transaction*/
    @MetaField
    private String proposedTransactionRecord;

    /*The type of credit instrument being considered*/
    @MetaField
    private String proposedTransactionType;

    /*The financial structure of the proposed transaction*/
    @MetaField
    private String proposedTransactionAmount;

    /*One or more key dates associated with the transaction*/
    @MetaField
    private String proposedTransactionRecordDate;

    /*The booking entity within the bank that the proposed transaction would impact*/
    @MetaField
    private String proposedTransactionBookingEntity;

    /*Details of the credit pricing assessment, permitting or adjusting terms as necessary*/
    @MetaField
    private String proposedTransactionCreditPricingAssessment;

    public void setBusinessUnitReference(org.museframework.bian.classes.Object businessUnitReference) {
        this.businessUnitReference = businessUnitReference;
    }

    public org.museframework.bian.classes.Object getBusinessUnitReference() {
        return businessUnitReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setSectorReference(org.museframework.bian.classes.Object sectorReference) {
        this.sectorReference = sectorReference;
    }

    public org.museframework.bian.classes.Object getSectorReference() {
        return sectorReference;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProposedTransactionReference(org.museframework.bian.classes.Object proposedTransactionReference) {
        this.proposedTransactionReference = proposedTransactionReference;
    }

    public org.museframework.bian.classes.Object getProposedTransactionReference() {
        return proposedTransactionReference;
    }

    public void setProposedTransactionRecord(String proposedTransactionRecord) {
        this.proposedTransactionRecord = proposedTransactionRecord;
    }

    public String getProposedTransactionRecord() {
        return proposedTransactionRecord;
    }

    public void setProposedTransactionType(String proposedTransactionType) {
        this.proposedTransactionType = proposedTransactionType;
    }

    public String getProposedTransactionType() {
        return proposedTransactionType;
    }

    public void setProposedTransactionAmount(String proposedTransactionAmount) {
        this.proposedTransactionAmount = proposedTransactionAmount;
    }

    public String getProposedTransactionAmount() {
        return proposedTransactionAmount;
    }

    public void setProposedTransactionRecordDate(String proposedTransactionRecordDate) {
        this.proposedTransactionRecordDate = proposedTransactionRecordDate;
    }

    public String getProposedTransactionRecordDate() {
        return proposedTransactionRecordDate;
    }

    public void setProposedTransactionBookingEntity(String proposedTransactionBookingEntity) {
        this.proposedTransactionBookingEntity = proposedTransactionBookingEntity;
    }

    public String getProposedTransactionBookingEntity() {
        return proposedTransactionBookingEntity;
    }

    public void setProposedTransactionCreditPricingAssessment(String proposedTransactionCreditPricingAssessment) {
        this.proposedTransactionCreditPricingAssessment = proposedTransactionCreditPricingAssessment;
    }

    public String getProposedTransactionCreditPricingAssessment() {
        return proposedTransactionCreditPricingAssessment;
    }
}