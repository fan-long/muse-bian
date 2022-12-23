package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCustomerLiaisonRequest {
    @MetaField
    private String branchlocationmanagementid;

    @MetaField
    private String customerliaisonid;

    public void setBranchlocationmanagementid(String branchlocationmanagementid) {
        this.branchlocationmanagementid = branchlocationmanagementid;
    }

    public String getBranchlocationmanagementid() {
        return branchlocationmanagementid;
    }

    public void setCustomerliaisonid(String customerliaisonid) {
        this.customerliaisonid = customerliaisonid;
    }

    public String getCustomerliaisonid() {
        return customerliaisonid;
    }
}