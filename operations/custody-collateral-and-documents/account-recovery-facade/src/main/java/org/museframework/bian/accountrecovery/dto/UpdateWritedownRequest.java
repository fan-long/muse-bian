package org.museframework.bian.accountrecovery.dto;

public class UpdateWritedownRequest {
    private String accountrecoveryid;

    private String writedownid;

    private org.museframework.bian.accountrecovery.dto.bq.Writedown writedown;

    public void setAccountrecoveryid(String accountrecoveryid) {
        this.accountrecoveryid = accountrecoveryid;
    }

    public String getAccountrecoveryid() {
        return accountrecoveryid;
    }

    public void setWritedownid(String writedownid) {
        this.writedownid = writedownid;
    }

    public String getWritedownid() {
        return writedownid;
    }

    public void setWritedown(org.museframework.bian.accountrecovery.dto.bq.Writedown writedown) {
        this.writedown = writedown;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Writedown getWritedown() {
        return writedown;
    }
}