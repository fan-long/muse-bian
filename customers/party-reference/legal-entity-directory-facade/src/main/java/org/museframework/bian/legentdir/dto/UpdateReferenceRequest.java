package org.museframework.bian.legentdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateReferenceRequest {
    @MetaField
    private String legalentitydirectoryid;

    @MetaField
    private String referenceid;

    @MetaField(ref=true)
    private org.museframework.bian.legentdir.dto.bq.Reference reference;

    public void setLegalentitydirectoryid(String legalentitydirectoryid) {
        this.legalentitydirectoryid = legalentitydirectoryid;
    }

    public String getLegalentitydirectoryid() {
        return legalentitydirectoryid;
    }

    public void setReferenceid(String referenceid) {
        this.referenceid = referenceid;
    }

    public String getReferenceid() {
        return referenceid;
    }

    public void setReference(org.museframework.bian.legentdir.dto.bq.Reference reference) {
        this.reference = reference;
    }

    public org.museframework.bian.legentdir.dto.bq.Reference getReference() {
        return reference;
    }
}