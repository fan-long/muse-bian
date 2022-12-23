package org.museframework.bian.probroagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLegalTermsRequest {
    @MetaField
    private String productbrokeragreementid;

    @MetaField
    private String legaltermsid;

    public void setProductbrokeragreementid(String productbrokeragreementid) {
        this.productbrokeragreementid = productbrokeragreementid;
    }

    public String getProductbrokeragreementid() {
        return productbrokeragreementid;
    }

    public void setLegaltermsid(String legaltermsid) {
        this.legaltermsid = legaltermsid;
    }

    public String getLegaltermsid() {
        return legaltermsid;
    }
}