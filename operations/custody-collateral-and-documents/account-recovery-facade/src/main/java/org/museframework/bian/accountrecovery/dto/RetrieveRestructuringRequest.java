package org.museframework.bian.accountrecovery.dto;

public class RetrieveRestructuringRequest {
    private String accountrecoveryid;

    private String restructuringid;

    public void setAccountrecoveryid(String accountrecoveryid) {
        this.accountrecoveryid = accountrecoveryid;
    }

    public String getAccountrecoveryid() {
        return accountrecoveryid;
    }

    public void setRestructuringid(String restructuringid) {
        this.restructuringid = restructuringid;
    }

    public String getRestructuringid() {
        return restructuringid;
    }
}