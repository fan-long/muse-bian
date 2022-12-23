package org.museframework.bian.casroocauana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductandServiceIssueAnalysisRequest {
    @MetaField
    private String caserootcauseanalysisid;

    @MetaField
    private String productandserviceissueanalysisid;

    public void setCaserootcauseanalysisid(String caserootcauseanalysisid) {
        this.caserootcauseanalysisid = caserootcauseanalysisid;
    }

    public String getCaserootcauseanalysisid() {
        return caserootcauseanalysisid;
    }

    public void setProductandserviceissueanalysisid(String productandserviceissueanalysisid) {
        this.productandserviceissueanalysisid = productandserviceissueanalysisid;
    }

    public String getProductandserviceissueanalysisid() {
        return productandserviceissueanalysisid;
    }
}