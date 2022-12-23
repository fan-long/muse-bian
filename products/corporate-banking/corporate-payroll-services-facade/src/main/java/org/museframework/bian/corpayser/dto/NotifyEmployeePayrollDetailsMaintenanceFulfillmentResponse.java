package org.museframework.bian.corpayser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyEmployeePayrollDetailsMaintenanceFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corpayser.dto.bq.EmployeePayrollDetailsMaintenanceFulfillment employeePayrollDetailsMaintenanceFulfillment;

    public void setEmployeePayrollDetailsMaintenanceFulfillment(org.museframework.bian.corpayser.dto.bq.EmployeePayrollDetailsMaintenanceFulfillment employeePayrollDetailsMaintenanceFulfillment) {
        this.employeePayrollDetailsMaintenanceFulfillment = employeePayrollDetailsMaintenanceFulfillment;
    }

    public org.museframework.bian.corpayser.dto.bq.EmployeePayrollDetailsMaintenanceFulfillment getEmployeePayrollDetailsMaintenanceFulfillment() {
        return employeePayrollDetailsMaintenanceFulfillment;
    }
}