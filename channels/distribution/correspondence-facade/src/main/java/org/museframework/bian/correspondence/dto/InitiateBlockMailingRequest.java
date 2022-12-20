package org.museframework.bian.correspondence.dto;

public class InitiateBlockMailingRequest {
    private String correspondenceid;

    private String blockmailingid;

    private org.museframework.bian.correspondence.dto.bq.BlockMailing blockMailing;

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

    public void setBlockMailing(org.museframework.bian.correspondence.dto.bq.BlockMailing blockMailing) {
        this.blockMailing = blockMailing;
    }

    public org.museframework.bian.correspondence.dto.bq.BlockMailing getBlockMailing() {
        return blockMailing;
    }
}