package org.museframework.bian.corbanope.dto;

public class UpdateClearingandSettlementRequest {
    private String correspondentbankoperationsid;

    private String clearingandsettlementid;

    private org.museframework.bian.corbanope.dto.bq.ClearingandSettlement clearingandSettlement;

    public void setCorrespondentbankoperationsid(String correspondentbankoperationsid) {
        this.correspondentbankoperationsid = correspondentbankoperationsid;
    }

    public String getCorrespondentbankoperationsid() {
        return correspondentbankoperationsid;
    }

    public void setClearingandsettlementid(String clearingandsettlementid) {
        this.clearingandsettlementid = clearingandsettlementid;
    }

    public String getClearingandsettlementid() {
        return clearingandsettlementid;
    }

    public void setClearingandSettlement(org.museframework.bian.corbanope.dto.bq.ClearingandSettlement clearingandSettlement) {
        this.clearingandSettlement = clearingandSettlement;
    }

    public org.museframework.bian.corbanope.dto.bq.ClearingandSettlement getClearingandSettlement() {
        return clearingandSettlement;
    }
}