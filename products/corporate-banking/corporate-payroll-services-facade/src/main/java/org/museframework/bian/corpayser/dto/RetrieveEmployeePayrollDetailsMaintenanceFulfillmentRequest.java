package org.museframework.bian.corpayser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveEmployeePayrollDetailsMaintenanceFulfillmentRequest {
    @MetaField
    private String corporatepayrollservicesid;

    @MetaField
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