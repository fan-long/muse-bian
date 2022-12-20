/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.bralocman.dto.bq;

public class CustomerLiaison {
    /*The required status/situation before the duty/obligation can be met*/
    private String customerLiaisonPreconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    private org.museframework.bian.classes.Object customerLiaisonBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    private String customerLiaisonWorkSchedule;

    /*The Branch Location Management Plan specific Business Service*/
    private org.museframework.bian.classes.BusinessService customerLiaison;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    private String customerLiaisonPostconditions;

    /*Reference to the specific business service type*/
    private String customerLiaisonCustomerLiaisonServiceType;

    /*Description of the performed business service*/
    private String customerLiaisonCustomerLiaisonServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String customerLiaisonCustomerLiaisonServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String customerLiaisonCustomerLiaisonServiceWorkProduct;

    /**/
    private String customerLiaisonCustomerLiaisonServiceName;

    public void setCustomerLiaisonPreconditions(String customerLiaisonPreconditions) {
        this.customerLiaisonPreconditions = customerLiaisonPreconditions;
    }

    public String getCustomerLiaisonPreconditions() {
        return customerLiaisonPreconditions;
    }

    public void setCustomerLiaisonBusinessUnitEmployeeReference(org.museframework.bian.classes.Object customerLiaisonBusinessUnitEmployeeReference) {
        this.customerLiaisonBusinessUnitEmployeeReference = customerLiaisonBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getCustomerLiaisonBusinessUnitEmployeeReference() {
        return customerLiaisonBusinessUnitEmployeeReference;
    }

    public void setCustomerLiaisonWorkSchedule(String customerLiaisonWorkSchedule) {
        this.customerLiaisonWorkSchedule = customerLiaisonWorkSchedule;
    }

    public String getCustomerLiaisonWorkSchedule() {
        return customerLiaisonWorkSchedule;
    }

    public void setCustomerLiaison(org.museframework.bian.classes.BusinessService customerLiaison) {
        this.customerLiaison = customerLiaison;
    }

    public org.museframework.bian.classes.BusinessService getCustomerLiaison() {
        return customerLiaison;
    }

    public void setCustomerLiaisonPostconditions(String customerLiaisonPostconditions) {
        this.customerLiaisonPostconditions = customerLiaisonPostconditions;
    }

    public String getCustomerLiaisonPostconditions() {
        return customerLiaisonPostconditions;
    }

    public void setCustomerLiaisonCustomerLiaisonServiceType(String customerLiaisonCustomerLiaisonServiceType) {
        this.customerLiaisonCustomerLiaisonServiceType = customerLiaisonCustomerLiaisonServiceType;
    }

    public String getCustomerLiaisonCustomerLiaisonServiceType() {
        return customerLiaisonCustomerLiaisonServiceType;
    }

    public void setCustomerLiaisonCustomerLiaisonServiceDescription(String customerLiaisonCustomerLiaisonServiceDescription) {
        this.customerLiaisonCustomerLiaisonServiceDescription = customerLiaisonCustomerLiaisonServiceDescription;
    }

    public String getCustomerLiaisonCustomerLiaisonServiceDescription() {
        return customerLiaisonCustomerLiaisonServiceDescription;
    }

    public void setCustomerLiaisonCustomerLiaisonServiceInputsandOuputs(String customerLiaisonCustomerLiaisonServiceInputsandOuputs) {
        this.customerLiaisonCustomerLiaisonServiceInputsandOuputs = customerLiaisonCustomerLiaisonServiceInputsandOuputs;
    }

    public String getCustomerLiaisonCustomerLiaisonServiceInputsandOuputs() {
        return customerLiaisonCustomerLiaisonServiceInputsandOuputs;
    }

    public void setCustomerLiaisonCustomerLiaisonServiceWorkProduct(String customerLiaisonCustomerLiaisonServiceWorkProduct) {
        this.customerLiaisonCustomerLiaisonServiceWorkProduct = customerLiaisonCustomerLiaisonServiceWorkProduct;
    }

    public String getCustomerLiaisonCustomerLiaisonServiceWorkProduct() {
        return customerLiaisonCustomerLiaisonServiceWorkProduct;
    }

    public void setCustomerLiaisonCustomerLiaisonServiceName(String customerLiaisonCustomerLiaisonServiceName) {
        this.customerLiaisonCustomerLiaisonServiceName = customerLiaisonCustomerLiaisonServiceName;
    }

    public String getCustomerLiaisonCustomerLiaisonServiceName() {
        return customerLiaisonCustomerLiaisonServiceName;
    }
}