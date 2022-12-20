package org.museframework.bian.corpayser.dto;

public class ExchangeEmployeePayrollDetailsMaintenanceFulfillmentRequest {
    private String corporatepayrollservicesid;

    private String employeepayrolldetailsmaintenancefulfillmentid;

    private org.museframework.bian.corpayser.dto.bq.EmployeePayrollDetailsMaintenanceFulfillment employeePayrollDetailsMaintenanceFulfillment;

    public void setCorporatepayrollservicesid(String corporatepayrollservicesid) {
        this.corporatepayrollservicesid = corporatepayrollservicesid;
    }

    public String getCorporatepayrollservicesid() {
        return corporatepayrollservicesid;
    }

    public void setEmployeepayrolldetailsmaintenancefulfillmentid(String employeepayrolldetailsmaintenancefulfillmentid) {
        this.employeepayrolldetailsmaintenancefulfillmentid = employeepayrolldetailsmaintenancefulfillmentid;
    }

    public String getEmployeepayrolldetailsmaintenancefulfillmentid() {
        return employeepayrolldetailsmaintenancefulfillmentid;
    }

    public void setEmployeePayrollDetailsMaintenanceFulfillment(org.museframework.bian.corpayser.dto.bq.EmployeePayrollDetailsMaintenanceFulfillment employeePayrollDetailsMaintenanceFulfillment) {
        this.employeePayrollDetailsMaintenanceFulfillment = employeePayrollDetailsMaintenanceFulfillment;
    }

    public org.museframework.bian.corpayser.dto.bq.EmployeePayrollDetailsMaintenanceFulfillment getEmployeePayrollDetailsMaintenanceFulfillment() {
        return employeePayrollDetailsMaintenanceFulfillment;
    }
}