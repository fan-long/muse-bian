package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLegalandRegulatoryObligationsandGuidelinesRequest {
    @MetaField
    private String managementmanualid;

    @MetaField
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