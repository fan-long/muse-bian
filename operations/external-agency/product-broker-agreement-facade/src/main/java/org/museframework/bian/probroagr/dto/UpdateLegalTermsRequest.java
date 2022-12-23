package org.museframework.bian.probroagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateLegalTermsRequest {
    @MetaField
    private String productbrokeragreementid;

    @MetaField
    private String legaltermsid;

    @MetaField(ref=true)
    private org.museframework.bian.probroagr.dto.bq.LegalTerms legalTerms;

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

    public void setLegalTerms(org.museframework.bian.probroagr.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.probroagr.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}