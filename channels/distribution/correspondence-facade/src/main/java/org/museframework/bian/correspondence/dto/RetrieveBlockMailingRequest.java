package org.museframework.bian.correspondence.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBlockMailingRequest {
    @MetaField
    private String correspondenceid;

    @MetaField
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