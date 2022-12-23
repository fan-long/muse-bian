package org.museframework.bian.cuscasman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateRulesRequest {
    @MetaField
    private String customercasemanagementid;

    @MetaField
    private String rulesid;

    @MetaField(ref=true)
    private org.museframework.bian.cuscasman.dto.bq.Rules rules;

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

    public void setRules(org.museframework.bian.cuscasman.dto.bq.Rules rules) {
        this.rules = rules;
    }

    public org.museframework.bian.cuscasman.dto.bq.Rules getRules() {
        return rules;
    }
}