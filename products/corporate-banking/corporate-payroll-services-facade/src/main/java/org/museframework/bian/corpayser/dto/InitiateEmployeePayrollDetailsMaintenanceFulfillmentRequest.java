package org.museframework.bian.corpayser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateEmployeePayrollDetailsMaintenanceFulfillmentRequest {
    @MetaField
    private String corporatepayrollservicesid;

    @MetaField
    private String employeepayrolldetailsmaintenancefulfillmentid;

    @MetaField(ref=true)
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