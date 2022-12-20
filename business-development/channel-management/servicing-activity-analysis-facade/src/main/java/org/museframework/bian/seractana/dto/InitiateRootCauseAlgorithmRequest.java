package org.museframework.bian.seractana.dto;

public class InitiateRootCauseAlgorithmRequest {
    private String servicingactivityanalysisid;

    private String rootcausealgorithmid;

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