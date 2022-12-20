package org.museframework.bian.knowledgeexchange.dto;

public class RetrieveMaintenanceandAccessAdministrationRequest {
    private String knowledgeexchangeid;

    private String maintenanceandaccessadministrationid;

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
}