package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBankRelationsRequest {
    @MetaField
    private String partyreferencedatadirectoryid;

    @MetaField
    private String bankrelationsid;

    @MetaField(ref=true)
    private org.museframework.bian.parrefdatdir.dto.bq.BankRelations bankRelations;

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

    public void setBankRelations(org.museframework.bian.parrefdatdir.dto.bq.BankRelations bankRelations) {
        this.bankRelations = bankRelations;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.BankRelations getBankRelations() {
        return bankRelations;
    }
}