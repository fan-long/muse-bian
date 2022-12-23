package org.museframework.bian.proinviteman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductInventoryAllocationRequest {
    @MetaField
    private String productinventoryitemmanagementid;

    public void setProductinventoryitemmanagementid(String productinventoryitemmanagementid) {
        this.productinventoryitemmanagementid = productinventoryitemmanagementid;
    }

    public String getProductinventoryitemmanagementid() {
        return productinventoryitemmanagementid;
    }
}