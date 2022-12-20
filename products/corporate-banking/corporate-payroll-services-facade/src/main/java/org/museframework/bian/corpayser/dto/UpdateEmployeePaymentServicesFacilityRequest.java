package org.museframework.bian.corpayser.dto;

public class UpdateEmployeePaymentServicesFacilityRequest {
    private String corporatepayrollservicesid;

    private org.museframework.bian.corpayser.dto.cr.EmployeePaymentServicesFacility employeePaymentServicesFacility;

    public void setCorporatepayrollservicesid(String corporatepayrollservicesid) {
        this.corporatepayrollservicesid = corporatepayrollservicesid;
    }

    public String getCorporatepayrollservicesid() {
        return corporatepayrollservicesid;
    }

    public void setEmployeePaymentServicesFacility(org.museframework.bian.corpayser.dto.cr.EmployeePaymentServicesFacility employeePaymentServicesFacility) {
        this.employeePaymentServicesFacility = employeePaymentServicesFacility;
    }

    public org.museframework.bian.corpayser.dto.cr.EmployeePaymentServicesFacility getEmployeePaymentServicesFacility() {
        return employeePaymentServicesFacility;
    }
}