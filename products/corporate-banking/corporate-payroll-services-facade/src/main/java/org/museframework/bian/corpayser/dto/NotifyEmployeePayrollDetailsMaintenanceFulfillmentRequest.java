package org.museframework.bian.corpayser.dto;

public class NotifyEmployeePayrollDetailsMaintenanceFulfillmentRequest {
    private String corporatepayrollservicesid;

    private String employeepayrolldetailsmaintenancefulfillmentid;

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
}