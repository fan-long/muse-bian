package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteChargebackRequest {
    @MetaField
    private String merchantacquiringfacilityid;

    @MetaField
    private String chargebackid;

    @MetaField(ref=true)
    private org.museframework.bian.meracqfac.dto.bq.Chargeback chargeback;

    public void setMerchantacquiringfacilityid(String merchantacquiringfacilityid) {
        this.merchantacquiringfacilityid = merchantacquiringfacilityid;
    }

    public String getMerchantacquiringfacilityid() {
        return merchantacquiringfacilityid;
    }

    public void setChargebackid(String chargebackid) {
        this.chargebackid = chargebackid;
    }

    public String getChargebackid() {
        return chargebackid;
    }

    public void setChargeback(org.museframework.bian.meracqfac.dto.bq.Chargeback chargeback) {
        this.chargeback = chargeback;
    }

    public org.museframework.bian.meracqfac.dto.bq.Chargeback getChargeback() {
        return chargeback;
    }
}