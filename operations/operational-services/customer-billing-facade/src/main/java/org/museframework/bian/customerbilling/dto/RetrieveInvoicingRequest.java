package org.museframework.bian.customerbilling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInvoicingRequest {
    @MetaField
    private String customerbillingid;

    @MetaField
    private String invoicingid;

    public void setCustomerbillingid(String customerbillingid) {
        this.customerbillingid = customerbillingid;
    }

    public String getCustomerbillingid() {
        return customerbillingid;
    }

    public void setInvoicingid(String invoicingid) {
        this.invoicingid = invoicingid;
    }

    public String getInvoicingid() {
        return invoicingid;
    }
}