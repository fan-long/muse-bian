package org.museframework.bian.corbanope.dto;

public class ExchangeCorrespondentBankOperatingSessionRequest {
    private String correspondentbankoperationsid;

    private org.museframework.bian.corbanope.dto.cr.CorrespondentBankOperatingSession correspondentBankOperatingSession;

    public void setCorrespondentbankoperationsid(String correspondentbankoperationsid) {
        this.correspondentbankoperationsid = correspondentbankoperationsid;
    }

    public String getCorrespondentbankoperationsid() {
        return correspondentbankoperationsid;
    }

    public void setCorrespondentBankOperatingSession(org.museframework.bian.corbanope.dto.cr.CorrespondentBankOperatingSession correspondentBankOperatingSession) {
        this.correspondentBankOperatingSession = correspondentBankOperatingSession;
    }

    public org.museframework.bian.corbanope.dto.cr.CorrespondentBankOperatingSession getCorrespondentBankOperatingSession() {
        return correspondentBankOperatingSession;
    }
}