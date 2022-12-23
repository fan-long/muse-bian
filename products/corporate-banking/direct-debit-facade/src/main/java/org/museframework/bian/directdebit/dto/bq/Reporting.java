/*The configuration and execution of Batch Debit arrangement within the Direct Debit Facility*/
package org.museframework.bian.directdebit.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Reporting {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String reportingPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String reportingFeatureSchedule;

    /*The Direct Debit Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String reportingPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String reportingServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String reportingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String reportingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String reportingServiceWorkProduct;

    /**/
    @MetaField
    private String reportingServiceName;

    public void setReportingPreconditions(String reportingPreconditions) {
        this.reportingPreconditions = reportingPreconditions;
    }

    public String getReportingPreconditions() {
        return reportingPreconditions;
    }

    public void setReportingFeatureSchedule(String reportingFeatureSchedule) {
        this.reportingFeatureSchedule = reportingFeatureSchedule;
    }

    public String getReportingFeatureSchedule() {
        return reportingFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setReportingPostconditions(String reportingPostconditions) {
        this.reportingPostconditions = reportingPostconditions;
    }

    public String getReportingPostconditions() {
        return reportingPostconditions;
    }

    public void setReportingServiceType(String reportingServiceType) {
        this.reportingServiceType = reportingServiceType;
    }

    public String getReportingServiceType() {
        return reportingServiceType;
    }

    public void setReportingServiceDescription(String reportingServiceDescription) {
        this.reportingServiceDescription = reportingServiceDescription;
    }

    public String getReportingServiceDescription() {
        return reportingServiceDescription;
    }

    public void setReportingServiceInputsandOuputs(String reportingServiceInputsandOuputs) {
        this.reportingServiceInputsandOuputs = reportingServiceInputsandOuputs;
    }

    public String getReportingServiceInputsandOuputs() {
        return reportingServiceInputsandOuputs;
    }

    public void setReportingServiceWorkProduct(String reportingServiceWorkProduct) {
        this.reportingServiceWorkProduct = reportingServiceWorkProduct;
    }

    public String getReportingServiceWorkProduct() {
        return reportingServiceWorkProduct;
    }

    public void setReportingServiceName(String reportingServiceName) {
        this.reportingServiceName = reportingServiceName;
    }

    public String getReportingServiceName() {
        return reportingServiceName;
    }
}