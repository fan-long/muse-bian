package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureLegalandRegulatoryObligationsandGuidelinesRequest {
    @MetaField
    private String managementmanualid;

    @MetaField
    private String legalandregulatoryobligationsandguidelinesid;

    @MetaField(ref=true)
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