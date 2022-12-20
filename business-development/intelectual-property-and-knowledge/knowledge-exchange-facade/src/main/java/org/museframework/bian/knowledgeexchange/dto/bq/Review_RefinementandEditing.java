/*Operate equipment and/or a largely automated facility  within Knowledge Exchange. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.knowledgeexchange.dto.bq;

public class Review_RefinementandEditing {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private String review_RefinementandEditingPreconditions;

    /*The schedule and timing of the function*/
    private String review_RefinementandEditingFunctionSchedule;

    /*The Intellectual Property Exchange Operating Session specific Business Service*/
    private org.museframework.bian.classes.BusinessService contentReview_RefinementandEditing;

    /*Reference to the specific business service type*/
    private String contentReview_RefinementandEditingServiceType;

    /*Description of the performed business service*/
    private String contentReview_RefinementandEditingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String contentReview_RefinementandEditingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String contentReview_RefinementandEditingServiceWorkProduct;

    /**/
    private String contentReview_RefinementandEditingServiceName;

    public void setReview_RefinementandEditingPreconditions(String review_RefinementandEditingPreconditions) {
        this.review_RefinementandEditingPreconditions = review_RefinementandEditingPreconditions;
    }

    public String getReview_RefinementandEditingPreconditions() {
        return review_RefinementandEditingPreconditions;
    }

    public void setReview_RefinementandEditingFunctionSchedule(String review_RefinementandEditingFunctionSchedule) {
        this.review_RefinementandEditingFunctionSchedule = review_RefinementandEditingFunctionSchedule;
    }

    public String getReview_RefinementandEditingFunctionSchedule() {
        return review_RefinementandEditingFunctionSchedule;
    }

    public void setContentReview_RefinementandEditing(org.museframework.bian.classes.BusinessService contentReview_RefinementandEditing) {
        this.contentReview_RefinementandEditing = contentReview_RefinementandEditing;
    }

    public org.museframework.bian.classes.BusinessService getContentReview_RefinementandEditing() {
        return contentReview_RefinementandEditing;
    }

    public void setContentReview_RefinementandEditingServiceType(String contentReview_RefinementandEditingServiceType) {
        this.contentReview_RefinementandEditingServiceType = contentReview_RefinementandEditingServiceType;
    }

    public String getContentReview_RefinementandEditingServiceType() {
        return contentReview_RefinementandEditingServiceType;
    }

    public void setContentReview_RefinementandEditingServiceDescription(String contentReview_RefinementandEditingServiceDescription) {
        this.contentReview_RefinementandEditingServiceDescription = contentReview_RefinementandEditingServiceDescription;
    }

    public String getContentReview_RefinementandEditingServiceDescription() {
        return contentReview_RefinementandEditingServiceDescription;
    }

    public void setContentReview_RefinementandEditingServiceInputsandOuputs(String contentReview_RefinementandEditingServiceInputsandOuputs) {
        this.contentReview_RefinementandEditingServiceInputsandOuputs = contentReview_RefinementandEditingServiceInputsandOuputs;
    }

    public String getContentReview_RefinementandEditingServiceInputsandOuputs() {
        return contentReview_RefinementandEditingServiceInputsandOuputs;
    }

    public void setContentReview_RefinementandEditingServiceWorkProduct(String contentReview_RefinementandEditingServiceWorkProduct) {
        this.contentReview_RefinementandEditingServiceWorkProduct = contentReview_RefinementandEditingServiceWorkProduct;
    }

    public String getContentReview_RefinementandEditingServiceWorkProduct() {
        return contentReview_RefinementandEditingServiceWorkProduct;
    }

    public void setContentReview_RefinementandEditingServiceName(String contentReview_RefinementandEditingServiceName) {
        this.contentReview_RefinementandEditingServiceName = contentReview_RefinementandEditingServiceName;
    }

    public String getContentReview_RefinementandEditingServiceName() {
        return contentReview_RefinementandEditingServiceName;
    }
}