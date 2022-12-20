package org.museframework.bian.corporatelease.dto;

public class RetrieveAdministerRequest {
    private String corporateleaseid;

    private String administerid;

    public void setCorporateleaseid(String corporateleaseid) {
        this.corporateleaseid = corporateleaseid;
    }

    public String getCorporateleaseid() {
        return corporateleaseid;
    }

    public void setAdministerid(String administerid) {
        this.administerid = administerid;
    }

    public String getAdministerid() {
        return administerid;
    }
}