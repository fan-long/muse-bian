package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateReferenceRequest {
    @MetaField
    private String partyreferencedatadirectoryid;

    @MetaField
    private String referenceid;

    @MetaField(ref=true)
    private org.museframework.bian.parrefdatdir.dto.bq.Reference reference;

    public void setPartyreferencedatadirectoryid(String partyreferencedatadirectoryid) {
        this.partyreferencedatadirectoryid = partyreferencedatadirectoryid;
    }

    public String getPartyreferencedatadirectoryid() {
        return partyreferencedatadirectoryid;
    }

    public void setReferenceid(String referenceid) {
        this.referenceid = referenceid;
    }

    public String getReferenceid() {
        return referenceid;
    }

    public void setReference(org.museframework.bian.parrefdatdir.dto.bq.Reference reference) {
        this.reference = reference;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Reference getReference() {
        return reference;
    }
}