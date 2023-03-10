package org.museframework.bian.cusproandsereli.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateNextBestRequest {
    @MetaField
    private String customerproductandserviceeligibilityid;

    @MetaField
    private String nextbestid;

    @MetaField(ref=true)
    private org.museframework.bian.cusproandsereli.dto.bq.NextBest nextBest;

    public void setCustomerproductandserviceeligibilityid(String customerproductandserviceeligibilityid) {
        this.customerproductandserviceeligibilityid = customerproductandserviceeligibilityid;
    }

    public String getCustomerproductandserviceeligibilityid() {
        return customerproductandserviceeligibilityid;
    }

    public void setNextbestid(String nextbestid) {
        this.nextbestid = nextbestid;
    }

    public String getNextbestid() {
        return nextbestid;
    }

    public void setNextBest(org.museframework.bian.cusproandsereli.dto.bq.NextBest nextBest) {
        this.nextBest = nextBest;
    }

    public org.museframework.bian.cusproandsereli.dto.bq.NextBest getNextBest() {
        return nextBest;
    }
}