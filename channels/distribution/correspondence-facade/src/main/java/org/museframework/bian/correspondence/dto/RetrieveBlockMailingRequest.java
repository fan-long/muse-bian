package org.museframework.bian.correspondence.dto;

public class RetrieveBlockMailingRequest {
    private String correspondenceid;

    private String blockmailingid;

    public void setCorrespondenceid(String correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getCorrespondenceid() {
        return correspondenceid;
    }

    public void setBlockmailingid(String blockmailingid) {
        this.blockmailingid = blockmailingid;
    }

    public String getBlockmailingid() {
        return blockmailingid;
    }
}