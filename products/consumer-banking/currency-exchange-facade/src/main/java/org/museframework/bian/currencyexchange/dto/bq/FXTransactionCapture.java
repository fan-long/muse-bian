/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Currency Exchange. 
Example: Execute a payment transaction.*/
package org.museframework.bian.currencyexchange.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FXTransactionCapture {
    /*The required status/situation prior to the execution of the task*/
    @MetaField
    private String FXTransactionCapturePreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField
    private String FXTransactionCaptureTaskSchedule;

    /*The Currency Exchange Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService FXTransactionCapture;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField
    private String FXTransactionCapturePostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String FXTransactionCaptureFXTransactionCaptureServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String FXTransactionCaptureFXTransactionCaptureServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String FXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String FXTransactionCaptureFXTransactionCaptureServiceWorkProduct;

    /**/
    @MetaField
    private String FXTransactionCaptureFXTransactionCaptureServiceName;

    public void setFXTransactionCapturePreconditions(String FXTransactionCapturePreconditions) {
        this.FXTransactionCapturePreconditions = FXTransactionCapturePreconditions;
    }

    public String getFXTransactionCapturePreconditions() {
        return FXTransactionCapturePreconditions;
    }

    public void setFXTransactionCaptureTaskSchedule(String FXTransactionCaptureTaskSchedule) {
        this.FXTransactionCaptureTaskSchedule = FXTransactionCaptureTaskSchedule;
    }

    public String getFXTransactionCaptureTaskSchedule() {
        return FXTransactionCaptureTaskSchedule;
    }

    public void setFXTransactionCapture(org.museframework.bian.classes.BusinessService FXTransactionCapture) {
        this.FXTransactionCapture = FXTransactionCapture;
    }

    public org.museframework.bian.classes.BusinessService getFXTransactionCapture() {
        return FXTransactionCapture;
    }

    public void setFXTransactionCapturePostconditions(String FXTransactionCapturePostconditions) {
        this.FXTransactionCapturePostconditions = FXTransactionCapturePostconditions;
    }

    public String getFXTransactionCapturePostconditions() {
        return FXTransactionCapturePostconditions;
    }

    public void setFXTransactionCaptureFXTransactionCaptureServiceType(String FXTransactionCaptureFXTransactionCaptureServiceType) {
        this.FXTransactionCaptureFXTransactionCaptureServiceType = FXTransactionCaptureFXTransactionCaptureServiceType;
    }

    public String getFXTransactionCaptureFXTransactionCaptureServiceType() {
        return FXTransactionCaptureFXTransactionCaptureServiceType;
    }

    public void setFXTransactionCaptureFXTransactionCaptureServiceDescription(String FXTransactionCaptureFXTransactionCaptureServiceDescription) {
        this.FXTransactionCaptureFXTransactionCaptureServiceDescription = FXTransactionCaptureFXTransactionCaptureServiceDescription;
    }

    public String getFXTransactionCaptureFXTransactionCaptureServiceDescription() {
        return FXTransactionCaptureFXTransactionCaptureServiceDescription;
    }

    public void setFXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs(String FXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs) {
        this.FXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs = FXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs;
    }

    public String getFXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs() {
        return FXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs;
    }

    public void setFXTransactionCaptureFXTransactionCaptureServiceWorkProduct(String FXTransactionCaptureFXTransactionCaptureServiceWorkProduct) {
        this.FXTransactionCaptureFXTransactionCaptureServiceWorkProduct = FXTransactionCaptureFXTransactionCaptureServiceWorkProduct;
    }

    public String getFXTransactionCaptureFXTransactionCaptureServiceWorkProduct() {
        return FXTransactionCaptureFXTransactionCaptureServiceWorkProduct;
    }

    public void setFXTransactionCaptureFXTransactionCaptureServiceName(String FXTransactionCaptureFXTransactionCaptureServiceName) {
        this.FXTransactionCaptureFXTransactionCaptureServiceName = FXTransactionCaptureFXTransactionCaptureServiceName;
    }

    public String getFXTransactionCaptureFXTransactionCaptureServiceName() {
        return FXTransactionCaptureFXTransactionCaptureServiceName;
    }
}