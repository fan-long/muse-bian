package org.museframework.bian.legentdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateLegalEntityDirectoryEntryRequest {
    @MetaField
    private String legalentitydirectoryid;

    @MetaField(ref=true)
    private org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry legalEntityDirectoryEntry;

    public void setLegalentitydirectoryid(String legalentitydirectoryid) {
        this.legalentitydirectoryid = legalentitydirectoryid;
    }

    public String getLegalentitydirectoryid() {
        return legalentitydirectoryid;
    }

    public void setLegalEntityDirectoryEntry(org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry legalEntityDirectoryEntry) {
        this.legalEntityDirectoryEntry = legalEntityDirectoryEntry;
    }

    public org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry getLegalEntityDirectoryEntry() {
        return legalEntityDirectoryEntry;
    }
}