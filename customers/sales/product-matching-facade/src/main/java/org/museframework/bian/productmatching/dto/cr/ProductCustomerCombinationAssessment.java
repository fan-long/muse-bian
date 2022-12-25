/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.productmatching.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductCustomerCombinationAssessment {
    /*A Classification value that distinguishes between Assessments according to type of concern defined within Product/Customer Combination Assessment . Eg Market Analysis, Risk Analysis, Perfomance Analysis, etc.*/
    @MetaField(0)
    private String productCustomerCombinationAssessmentParameterType;

    /*A selected optional business service as subject matter of assessment*/
    @MetaField(0)
    private String productCustomerCombinationAssessmentSelectedOption;

    /*The type of Product/Customer Combination Assessment*/
    @MetaField(0)
    private String productCustomerCombinationAssessmentType;

    /*Reference to Product/Customer Combination Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productCustomerCombinationAssessmentReference;

    /*Request to assess Product/CustomerCombination*/
    @MetaField(0)
    private String productCustomerCombinationAssessmentRequest;

    /*Timetable to assess Product/CustomerCombination*/
    @MetaField(0)
    private String productCustomerCombinationAssessmentSchedule;

    /*The status of Product/Customer Combination Assessment*/
    @MetaField(0)
    private String productCustomerCombinationAssessmentStatus;

    /*Reference to the log of (usage) ativities/events of Product/Customer Combination Assessment*/
    @MetaField(0)
    private String productCustomerCombinationAssessmentUsageLog;

    /*Party who is involved in Product/Customer Combination Assessment*/
    @MetaField(0)
    private String productCustomerCombinationAssessmentAssociatedParty;

    /*Reference to the party who has provided Product/Customer Combination Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productCustomerCombinationAssessmentServiceProviderReference;

    /*Reference to the party who has requested Product/Customer Combination Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productCustomerCombinationAssessmentRequesterReference;

    public void setProductCustomerCombinationAssessmentParameterType(String productCustomerCombinationAssessmentParameterType) {
        this.productCustomerCombinationAssessmentParameterType = productCustomerCombinationAssessmentParameterType;
    }

    public String getProductCustomerCombinationAssessmentParameterType() {
        return productCustomerCombinationAssessmentParameterType;
    }

    public void setProductCustomerCombinationAssessmentSelectedOption(String productCustomerCombinationAssessmentSelectedOption) {
        this.productCustomerCombinationAssessmentSelectedOption = productCustomerCombinationAssessmentSelectedOption;
    }

    public String getProductCustomerCombinationAssessmentSelectedOption() {
        return productCustomerCombinationAssessmentSelectedOption;
    }

    public void setProductCustomerCombinationAssessmentType(String productCustomerCombinationAssessmentType) {
        this.productCustomerCombinationAssessmentType = productCustomerCombinationAssessmentType;
    }

    public String getProductCustomerCombinationAssessmentType() {
        return productCustomerCombinationAssessmentType;
    }

    public void setProductCustomerCombinationAssessmentReference(org.museframework.bian.classes.Object productCustomerCombinationAssessmentReference) {
        this.productCustomerCombinationAssessmentReference = productCustomerCombinationAssessmentReference;
    }

    public org.museframework.bian.classes.Object getProductCustomerCombinationAssessmentReference() {
        return productCustomerCombinationAssessmentReference;
    }

    public void setProductCustomerCombinationAssessmentRequest(String productCustomerCombinationAssessmentRequest) {
        this.productCustomerCombinationAssessmentRequest = productCustomerCombinationAssessmentRequest;
    }

    public String getProductCustomerCombinationAssessmentRequest() {
        return productCustomerCombinationAssessmentRequest;
    }

    public void setProductCustomerCombinationAssessmentSchedule(String productCustomerCombinationAssessmentSchedule) {
        this.productCustomerCombinationAssessmentSchedule = productCustomerCombinationAssessmentSchedule;
    }

    public String getProductCustomerCombinationAssessmentSchedule() {
        return productCustomerCombinationAssessmentSchedule;
    }

    public void setProductCustomerCombinationAssessmentStatus(String productCustomerCombinationAssessmentStatus) {
        this.productCustomerCombinationAssessmentStatus = productCustomerCombinationAssessmentStatus;
    }

    public String getProductCustomerCombinationAssessmentStatus() {
        return productCustomerCombinationAssessmentStatus;
    }

    public void setProductCustomerCombinationAssessmentUsageLog(String productCustomerCombinationAssessmentUsageLog) {
        this.productCustomerCombinationAssessmentUsageLog = productCustomerCombinationAssessmentUsageLog;
    }

    public String getProductCustomerCombinationAssessmentUsageLog() {
        return productCustomerCombinationAssessmentUsageLog;
    }

    public void setProductCustomerCombinationAssessmentAssociatedParty(String productCustomerCombinationAssessmentAssociatedParty) {
        this.productCustomerCombinationAssessmentAssociatedParty = productCustomerCombinationAssessmentAssociatedParty;
    }

    public String getProductCustomerCombinationAssessmentAssociatedParty() {
        return productCustomerCombinationAssessmentAssociatedParty;
    }

    public void setProductCustomerCombinationAssessmentServiceProviderReference(org.museframework.bian.classes.Object productCustomerCombinationAssessmentServiceProviderReference) {
        this.productCustomerCombinationAssessmentServiceProviderReference = productCustomerCombinationAssessmentServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getProductCustomerCombinationAssessmentServiceProviderReference() {
        return productCustomerCombinationAssessmentServiceProviderReference;
    }

    public void setProductCustomerCombinationAssessmentRequesterReference(org.museframework.bian.classes.Object productCustomerCombinationAssessmentRequesterReference) {
        this.productCustomerCombinationAssessmentRequesterReference = productCustomerCombinationAssessmentRequesterReference;
    }

    public org.museframework.bian.classes.Object getProductCustomerCombinationAssessmentRequesterReference() {
        return productCustomerCombinationAssessmentRequesterReference;
    }
}