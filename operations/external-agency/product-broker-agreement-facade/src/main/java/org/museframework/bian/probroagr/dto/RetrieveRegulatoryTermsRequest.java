package org.museframework.bian.probroagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRegulatoryTermsRequest {
    @MetaField
    private String productbrokeragreementid;

    @MetaField
    private String regulatorytermsid;

    public void setProductbrokeragreementid(String productbrokeragreementid) {
        this.productbrokeragreementid = productbrokeragreementid;
    }

    public String getProductbrokeragreementid() {
        return productbrokeragreementid;
    }

    public void setRegulatorytermsid(String regulatorytermsid) {
        this.regulatorytermsid = regulatorytermsid;
    }

    public String getRegulatorytermsid() {
        return regulatorytermsid;
    }
}