package org.museframework.bian.salproagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateLegalTermsRequest {
    @MetaField
    private String salesproductagreementid;

    @MetaField
    private String legaltermsid;

    @MetaField(ref=true)
    private org.museframework.bian.salproagr.dto.bq.LegalTerms legalTerms;

    public void setSalesproductagreementid(String salesproductagreementid) {
        this.salesproductagreementid = salesproductagreementid;
    }

    public String getSalesproductagreementid() {
        return salesproductagreementid;
    }

    public void setLegaltermsid(String legaltermsid) {
        this.legaltermsid = legaltermsid;
    }

    public String getLegaltermsid() {
        return legaltermsid;
    }

    public void setLegalTerms(org.museframework.bian.salproagr.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.salproagr.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}