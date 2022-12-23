package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMerchantFraudResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chaactana.dto.bq.MerchantFraud merchantFraud;

    public void setMerchantFraud(org.museframework.bian.chaactana.dto.bq.MerchantFraud merchantFraud) {
        this.merchantFraud = merchantFraud;
    }

    public org.museframework.bian.chaactana.dto.bq.MerchantFraud getMerchantFraud() {
        return merchantFraud;
    }
}