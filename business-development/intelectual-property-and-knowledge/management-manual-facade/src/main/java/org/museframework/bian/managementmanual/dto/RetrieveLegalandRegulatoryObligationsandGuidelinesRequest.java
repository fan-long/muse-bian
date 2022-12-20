package org.museframework.bian.managementmanual.dto;

public class RetrieveLegalandRegulatoryObligationsandGuidelinesRequest {
    private String managementmanualid;

    private String legalandregulatoryobligationsandguidelinesid;

    public void setManagementmanualid(String managementmanualid) {
        this.managementmanualid = managementmanualid;
    }

    public String getManagementmanualid() {
        return managementmanualid;
    }

    public void setLegalandregulatoryobligationsandguidelinesid(String legalandregulatoryobligationsandguidelinesid) {
        this.legalandregulatoryobligationsandguidelinesid = legalandregulatoryobligationsandguidelinesid;
    }

    public String getLegalandregulatoryobligationsandguidelinesid() {
        return legalandregulatoryobligationsandguidelinesid;
    }
}