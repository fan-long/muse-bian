package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBankRelationsRequest {
    @MetaField
    private String partyreferencedatadirectoryid;

    @MetaField
    private String bankrelationsid;

    public void setPartyreferencedatadirectoryid(String partyreferencedatadirectoryid) {
        this.partyreferencedatadirectoryid = partyreferencedatadirectoryid;
    }

    public String getPartyreferencedatadirectoryid() {
        return partyreferencedatadirectoryid;
    }

    public void setBankrelationsid(String bankrelationsid) {
        this.bankrelationsid = bankrelationsid;
    }

    public String getBankrelationsid() {
        return bankrelationsid;
    }
}