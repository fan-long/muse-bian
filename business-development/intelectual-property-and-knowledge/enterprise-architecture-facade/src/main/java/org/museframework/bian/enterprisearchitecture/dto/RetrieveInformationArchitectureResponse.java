package org.museframework.bian.enterprisearchitecture.dto;

public class RetrieveInformationArchitectureResponse {
    private org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture informationArchitecture;

    public void setInformationArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture informationArchitecture) {
        this.informationArchitecture = informationArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture getInformationArchitecture() {
        return informationArchitecture;
    }
}