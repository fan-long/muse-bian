package org.museframework.bian.customerbilling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCustomerBillingProcedureRequest {
    @MetaField
    private String customerbillingid;

    @MetaField(ref=true)
    private org.museframework.bian.customerbilling.dto.cr.CustomerBillingProcedure customerBillingProcedure;

    public void setCustomerbillingid(String customerbillingid) {
        this.customerbillingid = customerbillingid;
    }

    public String getCustomerbillingid() {
        return customerbillingid;
    }

    public void setCustomerBillingProcedure(org.museframework.bian.customerbilling.dto.cr.CustomerBillingProcedure customerBillingProcedure) {
        this.customerBillingProcedure = customerBillingProcedure;
    }

    public org.museframework.bian.customerbilling.dto.cr.CustomerBillingProcedure getCustomerBillingProcedure() {
        return customerBillingProcedure;
    }
}