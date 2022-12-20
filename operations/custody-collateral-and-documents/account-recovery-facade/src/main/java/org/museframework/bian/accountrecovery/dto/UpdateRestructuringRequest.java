package org.museframework.bian.accountrecovery.dto;

public class UpdateRestructuringRequest {
    private String accountrecoveryid;

    private String restructuringid;

    private org.museframework.bian.accountrecovery.dto.bq.Restructuring restructuring;

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

    public void setRestructuring(org.museframework.bian.accountrecovery.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}