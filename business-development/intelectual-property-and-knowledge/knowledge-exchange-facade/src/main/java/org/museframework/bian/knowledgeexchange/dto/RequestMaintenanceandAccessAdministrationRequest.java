package org.museframework.bian.knowledgeexchange.dto;

public class RequestMaintenanceandAccessAdministrationRequest {
    private String knowledgeexchangeid;

    private String maintenanceandaccessadministrationid;

    private org.museframework.bian.knowledgeexchange.dto.bq.MaintenanceandAccessAdministration maintenanceandAccessAdministration;

    public void setKnowledgeexchangeid(String knowledgeexchangeid) {
        this.knowledgeexchangeid = knowledgeexchangeid;
    }

    public String getKnowledgeexchangeid() {
        return knowledgeexchangeid;
    }

    public void setMaintenanceandaccessadministrationid(String maintenanceandaccessadministrationid) {
        this.maintenanceandaccessadministrationid = maintenanceandaccessadministrationid;
    }

    public String getMaintenanceandaccessadministrationid() {
        return maintenanceandaccessadministrationid;
    }

    public void setMaintenanceandAccessAdministration(org.museframework.bian.knowledgeexchange.dto.bq.MaintenanceandAccessAdministration maintenanceandAccessAdministration) {
        this.maintenanceandAccessAdministration = maintenanceandAccessAdministration;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.MaintenanceandAccessAdministration getMaintenanceandAccessAdministration() {
        return maintenanceandAccessAdministration;
    }
}