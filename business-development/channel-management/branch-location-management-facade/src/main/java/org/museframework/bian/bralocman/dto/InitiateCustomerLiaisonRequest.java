package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCustomerLiaisonRequest {
    @MetaField
    private String branchlocationmanagementid;

    @MetaField
    private String customerliaisonid;

    @MetaField(ref=true)
    private org.museframework.bian.bralocman.dto.bq.CustomerLiaison customerLiaison;

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

    public void setCustomerLiaison(org.museframework.bian.bralocman.dto.bq.CustomerLiaison customerLiaison) {
        this.customerLiaison = customerLiaison;
    }

    public org.museframework.bian.bralocman.dto.bq.CustomerLiaison getCustomerLiaison() {
        return customerLiaison;
    }
}