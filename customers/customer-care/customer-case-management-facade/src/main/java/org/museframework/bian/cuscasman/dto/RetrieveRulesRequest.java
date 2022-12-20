package org.museframework.bian.cuscasman.dto;

public class RetrieveRulesRequest {
    private String customercasemanagementid;

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