package org.museframework.bian.corbandir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCorrespondentBankDirectoryEntryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry correspondentBankDirectoryEntry;

    public void setCorrespondentBankDirectoryEntry(org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry correspondentBankDirectoryEntry) {
        this.correspondentBankDirectoryEntry = correspondentBankDirectoryEntry;
    }

    public org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry getCorrespondentBankDirectoryEntry() {
        return correspondentBankDirectoryEntry;
    }
}