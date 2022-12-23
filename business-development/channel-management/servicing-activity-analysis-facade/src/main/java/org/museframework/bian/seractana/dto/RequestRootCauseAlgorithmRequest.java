package org.museframework.bian.seractana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestRootCauseAlgorithmRequest {
    @MetaField
    private String servicingactivityanalysisid;

    @MetaField
    private String rootcausealgorithmid;

    @MetaField(ref=true)
    private org.museframework.bian.seractana.dto.bq.RootCauseAlgorithm rootCauseAlgorithm;

    public void setServicingactivityanalysisid(String servicingactivityanalysisid) {
        this.servicingactivityanalysisid = servicingactivityanalysisid;
    }

    public String getServicingactivityanalysisid() {
        return servicingactivityanalysisid;
    }

    public void setRootcausealgorithmid(String rootcausealgorithmid) {
        this.rootcausealgorithmid = rootcausealgorithmid;
    }

    public String getRootcausealgorithmid() {
        return rootcausealgorithmid;
    }

    public void setRootCauseAlgorithm(org.museframework.bian.seractana.dto.bq.RootCauseAlgorithm rootCauseAlgorithm) {
        this.rootCauseAlgorithm = rootCauseAlgorithm;
    }

    public org.museframework.bian.seractana.dto.bq.RootCauseAlgorithm getRootCauseAlgorithm() {
        return rootCauseAlgorithm;
    }
}