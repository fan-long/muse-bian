package org.museframework.bian.cuscasman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRulesRequest {
    @MetaField
    private String customercasemanagementid;

    @MetaField
    private String rulesid;

    public void setCustomercasemanagementid(String customercasemanagementid) {
        this.customercasemanagementid = customercasemanagementid;
    }

    public String getCustomercasemanagementid() {
        return customercasemanagementid;
    }

    public void setRulesid(String rulesid) {
        this.rulesid = rulesid;
    }

    public String getRulesid() {
        return rulesid;
    }
}