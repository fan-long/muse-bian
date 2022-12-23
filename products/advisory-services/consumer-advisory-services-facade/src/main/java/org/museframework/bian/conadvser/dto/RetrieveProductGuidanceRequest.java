package org.museframework.bian.conadvser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductGuidanceRequest {
    @MetaField
    private String consumeradvisoryservicesid;

    @MetaField
    private String productguidanceid;

    public void setConsumeradvisoryservicesid(String consumeradvisoryservicesid) {
        this.consumeradvisoryservicesid = consumeradvisoryservicesid;
    }

    public String getConsumeradvisoryservicesid() {
        return consumeradvisoryservicesid;
    }

    public void setProductguidanceid(String productguidanceid) {
        this.productguidanceid = productguidanceid;
    }

    public String getProductguidanceid() {
        return productguidanceid;
    }
}