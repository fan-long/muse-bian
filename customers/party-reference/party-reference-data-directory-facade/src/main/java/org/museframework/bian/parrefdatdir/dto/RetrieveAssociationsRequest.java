package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAssociationsRequest {
    @MetaField
    private String partyreferencedatadirectoryid;

    @MetaField
    private String associationsid;

    public void setPartyreferencedatadirectoryid(String partyreferencedatadirectoryid) {
        this.partyreferencedatadirectoryid = partyreferencedatadirectoryid;
    }

    public String getPartyreferencedatadirectoryid() {
        return partyreferencedatadirectoryid;
    }

    public void setAssociationsid(String associationsid) {
        this.associationsid = associationsid;
    }

    public String getAssociationsid() {
        return associationsid;
    }
}