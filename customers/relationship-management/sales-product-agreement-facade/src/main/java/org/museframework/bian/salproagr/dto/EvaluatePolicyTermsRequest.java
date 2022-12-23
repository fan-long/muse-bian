package org.museframework.bian.salproagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluatePolicyTermsRequest {
    @MetaField
    private String salesproductagreementid;

    @MetaField
    private String policytermsid;

    @MetaField(ref=true)
    private org.museframework.bian.salproagr.dto.bq.PolicyTerms policyTerms;

    public void setSalesproductagreementid(String salesproductagreementid) {
        this.salesproductagreementid = salesproductagreementid;
    }

    public String getSalesproductagreementid() {
        return salesproductagreementid;
    }

    public void setPolicytermsid(String policytermsid) {
        this.policytermsid = policytermsid;
    }

    public String getPolicytermsid() {
        return policytermsid;
    }

    public void setPolicyTerms(org.museframework.bian.salproagr.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.salproagr.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}