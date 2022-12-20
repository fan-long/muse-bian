package org.museframework.bian.parroupro.dto;

public class RetrieveStatusRequest {
    private String partyroutingprofileid;

    private String statusid;

    public void setPartyroutingprofileid(String partyroutingprofileid) {
        this.partyroutingprofileid = partyroutingprofileid;
    }

    public String getPartyroutingprofileid() {
        return partyroutingprofileid;
    }

    public void setStatusid(String statusid) {
        this.statusid = statusid;
    }

    public String getStatusid() {
        return statusid;
    }
}