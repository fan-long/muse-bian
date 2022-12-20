package org.museframework.bian.seractana.dto;

public class RetrieveRootCauseAlgorithmRequest {
    private String servicingactivityanalysisid;

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