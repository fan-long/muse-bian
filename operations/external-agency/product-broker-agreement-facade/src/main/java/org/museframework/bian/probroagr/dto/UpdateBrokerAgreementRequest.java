package org.museframework.bian.probroagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBrokerAgreementRequest {
    @MetaField
    private String productbrokeragreementid;

    @MetaField(ref=true)
    private org.museframework.bian.probroagr.dto.cr.BrokerAgreement brokerAgreement;

    public void setProductbrokeragreementid(String productbrokeragreementid) {
        this.productbrokeragreementid = productbrokeragreementid;
    }

    public String getProductbrokeragreementid() {
        return productbrokeragreementid;
    }

    public void setBrokerAgreement(org.museframework.bian.probroagr.dto.cr.BrokerAgreement brokerAgreement) {
        this.brokerAgreement = brokerAgreement;
    }

    public org.museframework.bian.probroagr.dto.cr.BrokerAgreement getBrokerAgreement() {
        return brokerAgreement;
    }
}