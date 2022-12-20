package org.museframework.bian.enterprisearchitecture.dto;

public class RequestInformationArchitectureRequest {
    private String enterprisearchitectureid;

    private String informationarchitectureid;

    private org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture informationArchitecture;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setInformationarchitectureid(String informationarchitectureid) {
        this.informationarchitectureid = informationarchitectureid;
    }

    public String getInformationarchitectureid() {
        return informationarchitectureid;
    }

    public void setInformationArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture informationArchitecture) {
        this.informationArchitecture = informationArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture getInformationArchitecture() {
        return informationArchitecture;
    }
}