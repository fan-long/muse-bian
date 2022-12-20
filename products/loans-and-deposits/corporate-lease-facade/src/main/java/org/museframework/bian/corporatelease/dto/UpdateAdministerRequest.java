package org.museframework.bian.corporatelease.dto;

public class UpdateAdministerRequest {
    private String corporateleaseid;

    private String administerid;

    private org.museframework.bian.corporatelease.dto.bq.Administer administer;

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

    public void setAdminister(org.museframework.bian.corporatelease.dto.bq.Administer administer) {
        this.administer = administer;
    }

    public org.museframework.bian.corporatelease.dto.bq.Administer getAdminister() {
        return administer;
    }
}