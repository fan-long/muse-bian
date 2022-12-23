package org.museframework.bian.casroocauana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCreditandFraudRelatedIssueAnalysisRequest {
    @MetaField
    private String caserootcauseanalysisid;

    @MetaField
    private String creditandfraudrelatedissueanalysisid;

    public void setCaserootcauseanalysisid(String caserootcauseanalysisid) {
        this.caserootcauseanalysisid = caserootcauseanalysisid;
    }

    public String getCaserootcauseanalysisid() {
        return caserootcauseanalysisid;
    }

    public void setCreditandfraudrelatedissueanalysisid(String creditandfraudrelatedissueanalysisid) {
        this.creditandfraudrelatedissueanalysisid = creditandfraudrelatedissueanalysisid;
    }

    public String getCreditandfraudrelatedissueanalysisid() {
        return creditandfraudrelatedissueanalysisid;
    }
}