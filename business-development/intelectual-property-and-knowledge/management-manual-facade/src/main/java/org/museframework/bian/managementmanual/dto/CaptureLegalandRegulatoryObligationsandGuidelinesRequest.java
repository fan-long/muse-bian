package org.museframework.bian.managementmanual.dto;

public class CaptureLegalandRegulatoryObligationsandGuidelinesRequest {
    private String managementmanualid;

    private String legalandregulatoryobligationsandguidelinesid;

    private org.museframework.bian.managementmanual.dto.bq.LegalandRegulatoryObligationsandGuidelines legalandRegulatoryObligationsandGuidelines;

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

    public void setLegalandRegulatoryObligationsandGuidelines(org.museframework.bian.managementmanual.dto.bq.LegalandRegulatoryObligationsandGuidelines legalandRegulatoryObligationsandGuidelines) {
        this.legalandRegulatoryObligationsandGuidelines = legalandRegulatoryObligationsandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.LegalandRegulatoryObligationsandGuidelines getLegalandRegulatoryObligationsandGuidelines() {
        return legalandRegulatoryObligationsandGuidelines;
    }
}