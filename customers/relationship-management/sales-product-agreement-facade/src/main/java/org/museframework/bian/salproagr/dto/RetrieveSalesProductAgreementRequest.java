package org.museframework.bian.salproagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSalesProductAgreementRequest {
    @MetaField
    private String salesproductagreementid;

    public void setSalesproductagreementid(String salesproductagreementid) {
        this.salesproductagreementid = salesproductagreementid;
    }

    public String getSalesproductagreementid() {
        return salesproductagreementid;
    }
}