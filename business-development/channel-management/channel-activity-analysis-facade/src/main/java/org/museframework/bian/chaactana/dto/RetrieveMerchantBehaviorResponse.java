package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMerchantBehaviorResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chaactana.dto.bq.MerchantBehavior merchantBehavior;

    public void setMerchantBehavior(org.museframework.bian.chaactana.dto.bq.MerchantBehavior merchantBehavior) {
        this.merchantBehavior = merchantBehavior;
    }

    public org.museframework.bian.chaactana.dto.bq.MerchantBehavior getMerchantBehavior() {
        return merchantBehavior;
    }
}