package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMailingRequest {
    @MetaField
    private String productinventorydistributionid;

    @MetaField
    private String mailingid;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setMailingid(String mailingid) {
        this.mailingid = mailingid;
    }

    public String getMailingid() {
        return mailingid;
    }
}