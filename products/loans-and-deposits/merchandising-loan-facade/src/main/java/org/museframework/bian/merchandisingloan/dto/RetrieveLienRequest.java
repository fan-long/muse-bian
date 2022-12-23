package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLienRequest {
    @MetaField
    private String merchandisingloanid;

    @MetaField
    private String lienid;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setLienid(String lienid) {
        this.lienid = lienid;
    }

    public String getLienid() {
        return lienid;
    }
}