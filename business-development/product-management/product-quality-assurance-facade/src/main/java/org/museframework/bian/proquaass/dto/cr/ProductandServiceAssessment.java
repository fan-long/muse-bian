/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.proquaass.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductandServiceAssessment {
    /*A Classification value that distinguishes between Assessments according to type of concern defined within Product and  Service Assessment . Eg Market Analysis, Risk Analysis, Perfomance Analysis, etc.*/
    @MetaField(0)
    private String productandServiceAssessmentParameterType;

    /*A selected optional business service as subject matter of assessment*/
    @MetaField(0)
    private String productandServiceAssessmentSelectedOption;

    /*The type of Product and  Service Assessment*/
    @MetaField(0)
    private String productandServiceAssessmentType;

    /*Reference to Product and  Service Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productandServiceAssessmentReference;

    /*Request to assess ProductandService*/
    @MetaField(0)
    private String productandServiceAssessmentRequest;

    /*Timetable to assess ProductandService*/
    @MetaField(0)
    private String productandServiceAssessmentSchedule;

    /*The status of Product and  Service Assessment*/
    @MetaField(0)
    private String productandServiceAssessmentStatus;

    /*Reference to the log of (usage) ativities/events of Product and  Service Assessment*/
    @MetaField(0)
    private String productandServiceAssessmentUsageLog;

    /*Party who is involved in Product and  Service Assessment*/
    @MetaField(0)
    private String productandServiceAssessmentAssociatedParty;

    /*Reference to the party who has provided Product and  Service Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productandServiceAssessmentServiceProviderReference;

    /*Reference to the party who has requested Product and  Service Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productandServiceAssessmentRequesterReference;

    public void setProductandServiceAssessmentParameterType(String productandServiceAssessmentParameterType) {
        this.productandServiceAssessmentParameterType = productandServiceAssessmentParameterType;
    }

    public String getProductandServiceAssessmentParameterType() {
        return productandServiceAssessmentParameterType;
    }

    public void setProductandServiceAssessmentSelectedOption(String productandServiceAssessmentSelectedOption) {
        this.productandServiceAssessmentSelectedOption = productandServiceAssessmentSelectedOption;
    }

    public String getProductandServiceAssessmentSelectedOption() {
        return productandServiceAssessmentSelectedOption;
    }

    public void setProductandServiceAssessmentType(String productandServiceAssessmentType) {
        this.productandServiceAssessmentType = productandServiceAssessmentType;
    }

    public String getProductandServiceAssessmentType() {
        return productandServiceAssessmentType;
    }

    public void setProductandServiceAssessmentReference(org.museframework.bian.classes.Object productandServiceAssessmentReference) {
        this.productandServiceAssessmentReference = productandServiceAssessmentReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceAssessmentReference() {
        return productandServiceAssessmentReference;
    }

    public void setProductandServiceAssessmentRequest(String productandServiceAssessmentRequest) {
        this.productandServiceAssessmentRequest = productandServiceAssessmentRequest;
    }

    public String getProductandServiceAssessmentRequest() {
        return productandServiceAssessmentRequest;
    }

    public void setProductandServiceAssessmentSchedule(String productandServiceAssessmentSchedule) {
        this.productandServiceAssessmentSchedule = productandServiceAssessmentSchedule;
    }

    public String getProductandServiceAssessmentSchedule() {
        return productandServiceAssessmentSchedule;
    }

    public void setProductandServiceAssessmentStatus(String productandServiceAssessmentStatus) {
        this.productandServiceAssessmentStatus = productandServiceAssessmentStatus;
    }

    public String getProductandServiceAssessmentStatus() {
        return productandServiceAssessmentStatus;
    }

    public void setProductandServiceAssessmentUsageLog(String productandServiceAssessmentUsageLog) {
        this.productandServiceAssessmentUsageLog = productandServiceAssessmentUsageLog;
    }

    public String getProductandServiceAssessmentUsageLog() {
        return productandServiceAssessmentUsageLog;
    }

    public void setProductandServiceAssessmentAssociatedParty(String productandServiceAssessmentAssociatedParty) {
        this.productandServiceAssessmentAssociatedParty = productandServiceAssessmentAssociatedParty;
    }

    public String getProductandServiceAssessmentAssociatedParty() {
        return productandServiceAssessmentAssociatedParty;
    }

    public void setProductandServiceAssessmentServiceProviderReference(org.museframework.bian.classes.Object productandServiceAssessmentServiceProviderReference) {
        this.productandServiceAssessmentServiceProviderReference = productandServiceAssessmentServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceAssessmentServiceProviderReference() {
        return productandServiceAssessmentServiceProviderReference;
    }

    public void setProductandServiceAssessmentRequesterReference(org.museframework.bian.classes.Object productandServiceAssessmentRequesterReference) {
        this.productandServiceAssessmentRequesterReference = productandServiceAssessmentRequesterReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceAssessmentRequesterReference() {
        return productandServiceAssessmentRequesterReference;
    }
}