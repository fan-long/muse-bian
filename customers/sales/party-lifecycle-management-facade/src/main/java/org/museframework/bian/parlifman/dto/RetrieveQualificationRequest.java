package org.museframework.bian.parlifman.dto;

public class RetrieveQualificationRequest {
    private String partylifecyclemanagementid;

    private String qualificationid;

    public void setPartylifecyclemanagementid(String partylifecyclemanagementid) {
        this.partylifecyclemanagementid = partylifecyclemanagementid;
    }

    public String getPartylifecyclemanagementid() {
        return partylifecyclemanagementid;
    }

    public void setQualificationid(String qualificationid) {
        this.qualificationid = qualificationid;
    }

    public String getQualificationid() {
        return qualificationid;
    }
}