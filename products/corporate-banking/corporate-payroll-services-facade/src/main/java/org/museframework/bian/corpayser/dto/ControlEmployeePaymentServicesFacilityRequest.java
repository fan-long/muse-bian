package org.museframework.bian.corpayser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ControlEmployeePaymentServicesFacilityRequest {
    @MetaField
    private String corporatepayrollservicesid;

    @MetaField(ref=true)
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