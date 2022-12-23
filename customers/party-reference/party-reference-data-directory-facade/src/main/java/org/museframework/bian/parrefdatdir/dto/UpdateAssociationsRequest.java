package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAssociationsRequest {
    @MetaField
    private String partyreferencedatadirectoryid;

    @MetaField
    private String associationsid;

    @MetaField(ref=true)
    private org.museframework.bian.parrefdatdir.dto.bq.Associations associations;

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

    public void setAssociations(org.museframework.bian.parrefdatdir.dto.bq.Associations associations) {
        this.associations = associations;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Associations getAssociations() {
        return associations;
    }
}