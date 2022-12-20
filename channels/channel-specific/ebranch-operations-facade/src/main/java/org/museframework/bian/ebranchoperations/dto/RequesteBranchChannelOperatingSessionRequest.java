package org.museframework.bian.ebranchoperations.dto;

public class RequesteBranchChannelOperatingSessionRequest {
    private String ebranchoperationsid;

    private org.museframework.bian.ebranchoperations.dto.cr.eBranchChannelOperatingSession eBranchChannelOperatingSession;

    public void setEbranchoperationsid(String ebranchoperationsid) {
        this.ebranchoperationsid = ebranchoperationsid;
    }

    public String getEbranchoperationsid() {
        return ebranchoperationsid;
    }

    public void seteBranchChannelOperatingSession(org.museframework.bian.ebranchoperations.dto.cr.eBranchChannelOperatingSession eBranchChannelOperatingSession) {
        this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
    }

    public org.museframework.bian.ebranchoperations.dto.cr.eBranchChannelOperatingSession geteBranchChannelOperatingSession() {
        return eBranchChannelOperatingSession;
    }
}