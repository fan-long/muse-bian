package org.museframework.bian.cuscasman.dto;

public class RequestRulesRequest {
    private String customercasemanagementid;

    private String rulesid;

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