package org.museframework.bian.crecarposkee.dto;

public class CaptureCreditCardPositionLogRequest {
    private String creditcardpositionkeepingid;

    private org.museframework.bian.crecarposkee.dto.cr.CreditCardPositionLog creditCardPositionLog;

    public void setCreditcardpositionkeepingid(String creditcardpositionkeepingid) {
        this.creditcardpositionkeepingid = creditcardpositionkeepingid;
    }

    public String getCreditcardpositionkeepingid() {
        return creditcardpositionkeepingid;
    }

    public void setCreditCardPositionLog(org.museframework.bian.crecarposkee.dto.cr.CreditCardPositionLog creditCardPositionLog) {
        this.creditCardPositionLog = creditCardPositionLog;
    }

    public org.museframework.bian.crecarposkee.dto.cr.CreditCardPositionLog getCreditCardPositionLog() {
        return creditCardPositionLog;
    }
}