package org.museframework.bian.enterprisearchitecture.dto;

public class RequestEnterpriseArchitectureSpecificationRequest {
    private String enterprisearchitectureid;

    private org.museframework.bian.enterprisearchitecture.dto.cr.EnterpriseArchitectureSpecification enterpriseArchitectureSpecification;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setEnterpriseArchitectureSpecification(org.museframework.bian.enterprisearchitecture.dto.cr.EnterpriseArchitectureSpecification enterpriseArchitectureSpecification) {
        this.enterpriseArchitectureSpecification = enterpriseArchitectureSpecification;
    }

    public org.museframework.bian.enterprisearchitecture.dto.cr.EnterpriseArchitectureSpecification getEnterpriseArchitectureSpecification() {
        return enterpriseArchitectureSpecification;
    }
}