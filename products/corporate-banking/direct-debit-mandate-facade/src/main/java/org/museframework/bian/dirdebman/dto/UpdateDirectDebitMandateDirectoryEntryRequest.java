package org.museframework.bian.dirdebman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDirectDebitMandateDirectoryEntryRequest {
    @MetaField
    private String directdebitmandateid;

    @MetaField(ref=true)
    private org.museframework.bian.dirdebman.dto.cr.DirectDebitMandateDirectoryEntry directDebitMandateDirectoryEntry;

    public void setDirectdebitmandateid(String directdebitmandateid) {
        this.directdebitmandateid = directdebitmandateid;
    }

    public String getDirectdebitmandateid() {
        return directdebitmandateid;
    }

    public void setDirectDebitMandateDirectoryEntry(org.museframework.bian.dirdebman.dto.cr.DirectDebitMandateDirectoryEntry directDebitMandateDirectoryEntry) {
        this.directDebitMandateDirectoryEntry = directDebitMandateDirectoryEntry;
    }

    public org.museframework.bian.dirdebman.dto.cr.DirectDebitMandateDirectoryEntry getDirectDebitMandateDirectoryEntry() {
        return directDebitMandateDirectoryEntry;
    }
}