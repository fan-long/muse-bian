package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureMailingRequest {
    @MetaField
    private String productinventorydistributionid;

    @MetaField
    private String mailingid;

    @MetaField(ref=true)
    private org.museframework.bian.proinvdis.dto.bq.Mailing mailing;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setMailingid(String mailingid) {
        this.mailingid = mailingid;
    }

    public String getMailingid() {
        return mailingid;
    }

    public void setMailing(org.museframework.bian.proinvdis.dto.bq.Mailing mailing) {
        this.mailing = mailing;
    }

    public org.museframework.bian.proinvdis.dto.bq.Mailing getMailing() {
        return mailing;
    }
}