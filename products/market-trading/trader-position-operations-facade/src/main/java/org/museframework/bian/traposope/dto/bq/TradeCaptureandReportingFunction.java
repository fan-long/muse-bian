/*An operational service or function supported within the Trade Capture and Reporting Function for doing Trade Capture and Reporting Function*/
package org.museframework.bian.traposope.dto.bq;

public class TradeCaptureandReportingFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    private String schedule;

    /*The Trade Capture and Reporting Function specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Trade Capture and Reporting Function*/
    private org.museframework.bian.classes.Session tradedPositionOperatingSessionReference;

    /*Reference to Trade Capture and Reporting Function*/
    private org.museframework.bian.classes.Function tradeCaptureandReportingFunctionReference;

    /*The type of Trade Capture and Reporting Function*/
    private String tradeCaptureandReportingFunctionType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setTradedPositionOperatingSessionReference(org.museframework.bian.classes.Session tradedPositionOperatingSessionReference) {
        this.tradedPositionOperatingSessionReference = tradedPositionOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getTradedPositionOperatingSessionReference() {
        return tradedPositionOperatingSessionReference;
    }

    public void setTradeCaptureandReportingFunctionReference(org.museframework.bian.classes.Function tradeCaptureandReportingFunctionReference) {
        this.tradeCaptureandReportingFunctionReference = tradeCaptureandReportingFunctionReference;
    }

    public org.museframework.bian.classes.Function getTradeCaptureandReportingFunctionReference() {
        return tradeCaptureandReportingFunctionReference;
    }

    public void setTradeCaptureandReportingFunctionType(String tradeCaptureandReportingFunctionType) {
        this.tradeCaptureandReportingFunctionType = tradeCaptureandReportingFunctionType;
    }

    public String getTradeCaptureandReportingFunctionType() {
        return tradeCaptureandReportingFunctionType;
    }
}