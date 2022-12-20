package org.museframework.bian.casmanandaccser.dto;

public class RetrievePositivePayRequest {
    private String cashmanagementandaccountservicesid;

    private String positivepayid;

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
}