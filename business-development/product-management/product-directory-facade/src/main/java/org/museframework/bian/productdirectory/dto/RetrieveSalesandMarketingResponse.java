package org.museframework.bian.productdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveSalesandMarketingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productdirectory.dto.bq.SalesandMarketing salesandMarketing;

    public void setSalesandMarketing(org.museframework.bian.productdirectory.dto.bq.SalesandMarketing salesandMarketing) {
        this.salesandMarketing = salesandMarketing;
    }

    public org.museframework.bian.productdirectory.dto.bq.SalesandMarketing getSalesandMarketing() {
        return salesandMarketing;
    }
}