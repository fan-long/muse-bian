package org.museframework.bian.correspondence.dto;

public class UpdateCorrespondenceOperatingSessionRequest {
    private String correspondenceid;

    private org.museframework.bian.correspondence.dto.cr.CorrespondenceOperatingSession correspondenceOperatingSession;

    public void setCorrespondenceid(String correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getCorrespondenceid() {
        return correspondenceid;
    }

    public void setCorrespondenceOperatingSession(org.museframework.bian.correspondence.dto.cr.CorrespondenceOperatingSession correspondenceOperatingSession) {
        this.correspondenceOperatingSession = correspondenceOperatingSession;
    }

    public org.museframework.bian.correspondence.dto.cr.CorrespondenceOperatingSession getCorrespondenceOperatingSession() {
        return correspondenceOperatingSession;
    }
}