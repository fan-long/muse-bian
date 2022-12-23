package org.museframework.bian.legentdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAssociationsRequest {
    @MetaField
    private String legalentitydirectoryid;

    @MetaField
    private String associationsid;

    @MetaField(ref=true)
    private org.museframework.bian.legentdir.dto.bq.Associations associations;

    public void setLegalentitydirectoryid(String legalentitydirectoryid) {
        this.legalentitydirectoryid = legalentitydirectoryid;
    }

    public String getLegalentitydirectoryid() {
        return legalentitydirectoryid;
    }

    public void setAssociationsid(String associationsid) {
        this.associationsid = associationsid;
    }

    public String getAssociationsid() {
        return associationsid;
    }

    public void setAssociations(org.museframework.bian.legentdir.dto.bq.Associations associations) {
        this.associations = associations;
    }

    public org.museframework.bian.legentdir.dto.bq.Associations getAssociations() {
        return associations;
    }
}