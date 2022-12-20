package org.museframework.bian.managementmanual.dto;

public class UpdateManagementManualSpecificationRequest {
    private String managementmanualid;

    private org.museframework.bian.managementmanual.dto.cr.ManagementManualSpecification managementManualSpecification;

    public void setManagementmanualid(String managementmanualid) {
        this.managementmanualid = managementmanualid;
    }

    public String getManagementmanualid() {
        return managementmanualid;
    }

    public void setManagementManualSpecification(org.museframework.bian.managementmanual.dto.cr.ManagementManualSpecification managementManualSpecification) {
        this.managementManualSpecification = managementManualSpecification;
    }

    public org.museframework.bian.managementmanual.dto.cr.ManagementManualSpecification getManagementManualSpecification() {
        return managementManualSpecification;
    }
}