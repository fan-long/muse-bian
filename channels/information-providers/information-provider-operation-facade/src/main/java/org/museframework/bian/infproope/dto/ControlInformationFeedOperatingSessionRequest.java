package org.museframework.bian.infproope.dto;

public class ControlInformationFeedOperatingSessionRequest {
    private String informationprovideroperationid;

    private org.museframework.bian.infproope.dto.cr.InformationFeedOperatingSession informationFeedOperatingSession;

    public void setInformationprovideroperationid(String informationprovideroperationid) {
        this.informationprovideroperationid = informationprovideroperationid;
    }

    public String getInformationprovideroperationid() {
        return informationprovideroperationid;
    }

    public void setInformationFeedOperatingSession(org.museframework.bian.infproope.dto.cr.InformationFeedOperatingSession informationFeedOperatingSession) {
        this.informationFeedOperatingSession = informationFeedOperatingSession;
    }

    public org.museframework.bian.infproope.dto.cr.InformationFeedOperatingSession getInformationFeedOperatingSession() {
        return informationFeedOperatingSession;
    }
}