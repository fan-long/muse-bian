package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMerchantAccountResponse {
    @MetaField(ref=true)
    private org.museframework.bian.meracqfac.dto.bq.MerchantAccount merchantAccount;

    public void setMerchantAccount(org.museframework.bian.meracqfac.dto.bq.MerchantAccount merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public org.museframework.bian.meracqfac.dto.bq.MerchantAccount getMerchantAccount() {
        return merchantAccount;
    }
}