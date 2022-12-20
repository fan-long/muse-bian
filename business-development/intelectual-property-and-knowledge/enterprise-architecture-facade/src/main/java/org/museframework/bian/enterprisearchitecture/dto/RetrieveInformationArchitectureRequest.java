package org.museframework.bian.enterprisearchitecture.dto;

public class RetrieveInformationArchitectureRequest {
    private String enterprisearchitectureid;

    private String informationarchitectureid;

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
}