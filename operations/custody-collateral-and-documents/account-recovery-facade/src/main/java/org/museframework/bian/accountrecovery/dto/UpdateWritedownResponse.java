package org.museframework.bian.accountrecovery.dto;

public class UpdateWritedownResponse {
    private org.museframework.bian.accountrecovery.dto.bq.Writedown writedown;

    public void setWritedown(org.museframework.bian.accountrecovery.dto.bq.Writedown writedown) {
        this.writedown = writedown;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Writedown getWritedown() {
        return writedown;
    }
}