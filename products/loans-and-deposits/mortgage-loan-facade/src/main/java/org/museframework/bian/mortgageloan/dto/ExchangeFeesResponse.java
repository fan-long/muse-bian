package org.museframework.bian.mortgageloan.dto;

public class ExchangeFeesResponse {
    private org.museframework.bian.mortgageloan.dto.bq.Fees fees;

    public void setFees(org.museframework.bian.mortgageloan.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Fees getFees() {
        return fees;
    }
}