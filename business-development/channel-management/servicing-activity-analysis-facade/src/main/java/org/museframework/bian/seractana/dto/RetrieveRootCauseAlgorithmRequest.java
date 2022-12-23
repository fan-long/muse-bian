package org.museframework.bian.seractana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRootCauseAlgorithmRequest {
    @MetaField
    private String servicingactivityanalysisid;

    @MetaField
    private String rootcausealgorithmid;

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
}