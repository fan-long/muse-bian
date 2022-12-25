/*Operate equipment and/or a largely automated facility  within Knowledge Exchange. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.knowledgeexchange.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CaptureandClassification {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(0)
    private String captureandClassificationPreconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String captureandClassificationFunctionSchedule;

    /*The Intellectual Property Exchange Operating Session specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService contentCaptureandClassification;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String contentCaptureandClassificationServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String contentCaptureandClassificationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String contentCaptureandClassificationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String contentCaptureandClassificationServiceWorkProduct;

    /**/
    @MetaField(0)
    private String contentCaptureandClassificationServiceName;

    public void setCaptureandClassificationPreconditions(String captureandClassificationPreconditions) {
        this.captureandClassificationPreconditions = captureandClassificationPreconditions;
    }

    public String getCaptureandClassificationPreconditions() {
        return captureandClassificationPreconditions;
    }

    public void setCaptureandClassificationFunctionSchedule(String captureandClassificationFunctionSchedule) {
        this.captureandClassificationFunctionSchedule = captureandClassificationFunctionSchedule;
    }

    public String getCaptureandClassificationFunctionSchedule() {
        return captureandClassificationFunctionSchedule;
    }

    public void setContentCaptureandClassification(org.museframework.bian.classes.BusinessService contentCaptureandClassification) {
        this.contentCaptureandClassification = contentCaptureandClassification;
    }

    public org.museframework.bian.classes.BusinessService getContentCaptureandClassification() {
        return contentCaptureandClassification;
    }

    public void setContentCaptureandClassificationServiceType(String contentCaptureandClassificationServiceType) {
        this.contentCaptureandClassificationServiceType = contentCaptureandClassificationServiceType;
    }

    public String getContentCaptureandClassificationServiceType() {
        return contentCaptureandClassificationServiceType;
    }

    public void setContentCaptureandClassificationServiceDescription(String contentCaptureandClassificationServiceDescription) {
        this.contentCaptureandClassificationServiceDescription = contentCaptureandClassificationServiceDescription;
    }

    public String getContentCaptureandClassificationServiceDescription() {
        return contentCaptureandClassificationServiceDescription;
    }

    public void setContentCaptureandClassificationServiceInputsandOuputs(String contentCaptureandClassificationServiceInputsandOuputs) {
        this.contentCaptureandClassificationServiceInputsandOuputs = contentCaptureandClassificationServiceInputsandOuputs;
    }

    public String getContentCaptureandClassificationServiceInputsandOuputs() {
        return contentCaptureandClassificationServiceInputsandOuputs;
    }

    public void setContentCaptureandClassificationServiceWorkProduct(String contentCaptureandClassificationServiceWorkProduct) {
        this.contentCaptureandClassificationServiceWorkProduct = contentCaptureandClassificationServiceWorkProduct;
    }

    public String getContentCaptureandClassificationServiceWorkProduct() {
        return contentCaptureandClassificationServiceWorkProduct;
    }

    public void setContentCaptureandClassificationServiceName(String contentCaptureandClassificationServiceName) {
        this.contentCaptureandClassificationServiceName = contentCaptureandClassificationServiceName;
    }

    public String getContentCaptureandClassificationServiceName() {
        return contentCaptureandClassificationServiceName;
    }
}