package org.museframework.bian.opeiteman.dto;

public class RequestOpenItemProcedureRequest {
    private String openitemmanagementid;

    private org.museframework.bian.opeiteman.dto.cr.OpenItemProcedure openItemProcedure;

    public void setOpenitemmanagementid(String openitemmanagementid) {
        this.openitemmanagementid = openitemmanagementid;
    }

    public String getOpenitemmanagementid() {
        return openitemmanagementid;
    }

    public void setOpenItemProcedure(org.museframework.bian.opeiteman.dto.cr.OpenItemProcedure openItemProcedure) {
        this.openItemProcedure = openItemProcedure;
    }

    public org.museframework.bian.opeiteman.dto.cr.OpenItemProcedure getOpenItemProcedure() {
        return openItemProcedure;
    }
}