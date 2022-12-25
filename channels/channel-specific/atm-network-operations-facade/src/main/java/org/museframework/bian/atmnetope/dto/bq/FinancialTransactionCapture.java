/*Operate equipment and/or a largely automated facility  within ATM Network Operations. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.atmnetope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FinancialTransactionCapture {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(0)
    private String financialTransactionCapturePreconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String financialTransactionCaptureFunctionSchedule;

    /*The ATMNetwork Operating Session specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String serviceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String serviceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String serviceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String serviceWorkProduct;

    /**/
    @MetaField(0)
    private String serviceName;

    public void setFinancialTransactionCapturePreconditions(String financialTransactionCapturePreconditions) {
        this.financialTransactionCapturePreconditions = financialTransactionCapturePreconditions;
    }

    public String getFinancialTransactionCapturePreconditions() {
        return financialTransactionCapturePreconditions;
    }

    public void setFinancialTransactionCaptureFunctionSchedule(String financialTransactionCaptureFunctionSchedule) {
        this.financialTransactionCaptureFunctionSchedule = financialTransactionCaptureFunctionSchedule;
    }

    public String getFinancialTransactionCaptureFunctionSchedule() {
        return financialTransactionCaptureFunctionSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceInputsandOuputs(String serviceInputsandOuputs) {
        this.serviceInputsandOuputs = serviceInputsandOuputs;
    }

    public String getServiceInputsandOuputs() {
        return serviceInputsandOuputs;
    }

    public void setServiceWorkProduct(String serviceWorkProduct) {
        this.serviceWorkProduct = serviceWorkProduct;
    }

    public String getServiceWorkProduct() {
        return serviceWorkProduct;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}