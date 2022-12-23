package org.museframework.bian.dirdebman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDirectDebitMandateDirectoryEntryRequest {
    @MetaField
    private String directdebitmandateid;

    public void setDirectdebitmandateid(String directdebitmandateid) {
        this.directdebitmandateid = directdebitmandateid;
    }

    public String getDirectdebitmandateid() {
        return directdebitmandateid;
    }
}