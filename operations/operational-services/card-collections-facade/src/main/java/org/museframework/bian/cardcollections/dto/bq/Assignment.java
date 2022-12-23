/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardcollections.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Assignment {
    /*Reference to the bank's credit assessment for the customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerCreditRatingAssessmentInstanceReference;

    /*The internal bank credit rating/assessment*/
    @MetaField
    private String customerCreditRatingAssessment;

    /*Reference to an established external collections service agency*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collectionAgencyReference;

    /*The terms and conditions governing the use of the collections agency*/
    @MetaField
    private String collectionAgencyAgreement;

    /*Details of the assignment decision*/
    @MetaField
    private String cardCollectionsAssignmentDecision;

    /*Work documentation, forms and schedules produced and referenced during the task*/
    @MetaField
    private String cardCollectionsAssignmentWorkProduct;

    public void setCustomerCreditRatingAssessmentInstanceReference(org.museframework.bian.classes.Object customerCreditRatingAssessmentInstanceReference) {
        this.customerCreditRatingAssessmentInstanceReference = customerCreditRatingAssessmentInstanceReference;
    }

    public org.museframework.bian.classes.Object getCustomerCreditRatingAssessmentInstanceReference() {
        return customerCreditRatingAssessmentInstanceReference;
    }

    public void setCustomerCreditRatingAssessment(String customerCreditRatingAssessment) {
        this.customerCreditRatingAssessment = customerCreditRatingAssessment;
    }

    public String getCustomerCreditRatingAssessment() {
        return customerCreditRatingAssessment;
    }

    public void setCollectionAgencyReference(org.museframework.bian.classes.Object collectionAgencyReference) {
        this.collectionAgencyReference = collectionAgencyReference;
    }

    public org.museframework.bian.classes.Object getCollectionAgencyReference() {
        return collectionAgencyReference;
    }

    public void setCollectionAgencyAgreement(String collectionAgencyAgreement) {
        this.collectionAgencyAgreement = collectionAgencyAgreement;
    }

    public String getCollectionAgencyAgreement() {
        return collectionAgencyAgreement;
    }

    public void setCardCollectionsAssignmentDecision(String cardCollectionsAssignmentDecision) {
        this.cardCollectionsAssignmentDecision = cardCollectionsAssignmentDecision;
    }

    public String getCardCollectionsAssignmentDecision() {
        return cardCollectionsAssignmentDecision;
    }

    public void setCardCollectionsAssignmentWorkProduct(String cardCollectionsAssignmentWorkProduct) {
        this.cardCollectionsAssignmentWorkProduct = cardCollectionsAssignmentWorkProduct;
    }

    public String getCardCollectionsAssignmentWorkProduct() {
        return cardCollectionsAssignmentWorkProduct;
    }
}