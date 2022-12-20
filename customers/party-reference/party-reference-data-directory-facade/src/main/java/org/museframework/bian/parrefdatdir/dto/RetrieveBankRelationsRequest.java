package org.museframework.bian.parrefdatdir.dto;

public class RetrieveBankRelationsRequest {
    private String partyreferencedatadirectoryid;

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