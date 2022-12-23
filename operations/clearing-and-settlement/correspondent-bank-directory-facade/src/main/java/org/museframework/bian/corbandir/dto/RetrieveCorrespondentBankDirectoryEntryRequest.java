package org.museframework.bian.corbandir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCorrespondentBankDirectoryEntryRequest {
    @MetaField
    private String correspondentbankdirectoryid;

    public void setCorrespondentbankdirectoryid(String correspondentbankdirectoryid) {
        this.correspondentbankdirectoryid = correspondentbankdirectoryid;
    }

    public String getCorrespondentbankdirectoryid() {
        return correspondentbankdirectoryid;
    }
}