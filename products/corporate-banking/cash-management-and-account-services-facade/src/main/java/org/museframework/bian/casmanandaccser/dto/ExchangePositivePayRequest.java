package org.museframework.bian.casmanandaccser.dto;

public class ExchangePositivePayRequest {
    private String cashmanagementandaccountservicesid;

    private String positivepayid;

    private org.museframework.bian.casmanandaccser.dto.bq.PositivePay positivePay;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setPositivepayid(String positivepayid) {
        this.positivepayid = positivepayid;
    }

    public String getPositivepayid() {
        return positivepayid;
    }

    public void setPositivePay(org.museframework.bian.casmanandaccser.dto.bq.PositivePay positivePay) {
        this.positivePay = positivePay;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.PositivePay getPositivePay() {
        return positivePay;
    }
}