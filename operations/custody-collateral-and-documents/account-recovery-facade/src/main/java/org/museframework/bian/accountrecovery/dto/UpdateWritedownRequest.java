package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateWritedownRequest {
    @MetaField
    private String accountrecoveryid;

    @MetaField
    private String writedownid;

    @MetaField(ref=true)
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