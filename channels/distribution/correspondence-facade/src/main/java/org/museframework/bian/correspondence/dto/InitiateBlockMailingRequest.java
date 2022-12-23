package org.museframework.bian.correspondence.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateBlockMailingRequest {
    @MetaField
    private String correspondenceid;

    @MetaField
    private String blockmailingid;

    @MetaField(ref=true)
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