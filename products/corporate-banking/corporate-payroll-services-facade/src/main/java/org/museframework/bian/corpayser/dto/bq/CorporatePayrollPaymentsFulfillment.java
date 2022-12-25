/*The configuration and execution of Employee Payroll Details Maintenance Fulfillment arrangement within the Employee Payroll Details Maintenance Fulfillment*/
package org.museframework.bian.corpayser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorporatePayrollPaymentsFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String schedule;

    /*The Corporate Payroll Payments Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Corporate Payroll Payments Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility employeePaymentServicesFacilityReference;

    /*Reference to Corporate Payroll Payments Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object corporatePayrollPaymentsFulfillmentReference;

    /*The type of Corporate Payroll Payments Fulfillment*/
    @MetaField(0)
    private String corporatePayrollPaymentsFulfillmentType;

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

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setEmployeePaymentServicesFacilityReference(org.museframework.bian.classes.FinancialFacility employeePaymentServicesFacilityReference) {
        this.employeePaymentServicesFacilityReference = employeePaymentServicesFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getEmployeePaymentServicesFacilityReference() {
        return employeePaymentServicesFacilityReference;
    }

    public void setCorporatePayrollPaymentsFulfillmentReference(org.museframework.bian.classes.Object corporatePayrollPaymentsFulfillmentReference) {
        this.corporatePayrollPaymentsFulfillmentReference = corporatePayrollPaymentsFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getCorporatePayrollPaymentsFulfillmentReference() {
        return corporatePayrollPaymentsFulfillmentReference;
    }

    public void setCorporatePayrollPaymentsFulfillmentType(String corporatePayrollPaymentsFulfillmentType) {
        this.corporatePayrollPaymentsFulfillmentType = corporatePayrollPaymentsFulfillmentType;
    }

    public String getCorporatePayrollPaymentsFulfillmentType() {
        return corporatePayrollPaymentsFulfillmentType;
    }
}