/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.rewpoiacc.dto.bq;

public class Capture {
    /*The required status/situation before the event is captured*/
    private String capturePreconditions;

    /*The timing and key actions/milestones involved in capturing the event*/
    private String captureEventSchedule;

    /*The Reward Points Log specific  Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the event has been captured*/
    private String capturePostconditions;

    /*Reference to the specific business service type*/
    private String captureServiceType;

    /*Description of the performed business service*/
    private String captureServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String captureServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String captureServiceWorkProduct;

    /**/
    private String captureServiceName;

    public void setCapturePreconditions(String capturePreconditions) {
        this.capturePreconditions = capturePreconditions;
    }

    public String getCapturePreconditions() {
        return capturePreconditions;
    }

    public void setCaptureEventSchedule(String captureEventSchedule) {
        this.captureEventSchedule = captureEventSchedule;
    }

    public String getCaptureEventSchedule() {
        return captureEventSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setCapturePostconditions(String capturePostconditions) {
        this.capturePostconditions = capturePostconditions;
    }

    public String getCapturePostconditions() {
        return capturePostconditions;
    }

    public void setCaptureServiceType(String captureServiceType) {
        this.captureServiceType = captureServiceType;
    }

    public String getCaptureServiceType() {
        return captureServiceType;
    }

    public void setCaptureServiceDescription(String captureServiceDescription) {
        this.captureServiceDescription = captureServiceDescription;
    }

    public String getCaptureServiceDescription() {
        return captureServiceDescription;
    }

    public void setCaptureServiceInputsandOuputs(String captureServiceInputsandOuputs) {
        this.captureServiceInputsandOuputs = captureServiceInputsandOuputs;
    }

    public String getCaptureServiceInputsandOuputs() {
        return captureServiceInputsandOuputs;
    }

    public void setCaptureServiceWorkProduct(String captureServiceWorkProduct) {
        this.captureServiceWorkProduct = captureServiceWorkProduct;
    }

    public String getCaptureServiceWorkProduct() {
        return captureServiceWorkProduct;
    }

    public void setCaptureServiceName(String captureServiceName) {
        this.captureServiceName = captureServiceName;
    }

    public String getCaptureServiceName() {
        return captureServiceName;
    }
}