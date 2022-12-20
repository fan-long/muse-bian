package org.museframework.bian.parrefdatdir.dto;

public class UpdateBankRelationsRequest {
    private String partyreferencedatadirectoryid;

    private String bankrelationsid;

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