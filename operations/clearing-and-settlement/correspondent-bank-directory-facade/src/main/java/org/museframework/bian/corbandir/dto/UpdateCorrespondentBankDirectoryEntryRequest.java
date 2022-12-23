package org.museframework.bian.corbandir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCorrespondentBankDirectoryEntryRequest {
    @MetaField
    private String correspondentbankdirectoryid;

    @MetaField(ref=true)
    private org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry correspondentBankDirectoryEntry;

    public void setCorrespondentbankdirectoryid(String correspondentbankdirectoryid) {
        this.correspondentbankdirectoryid = correspondentbankdirectoryid;
    }

    public String getCorrespondentbankdirectoryid() {
        return correspondentbankdirectoryid;
    }

    public void setCorrespondentBankDirectoryEntry(org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry correspondentBankDirectoryEntry) {
        this.correspondentBankDirectoryEntry = correspondentBankDirectoryEntry;
    }

    public org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry getCorrespondentBankDirectoryEntry() {
        return correspondentBankDirectoryEntry;
    }
}