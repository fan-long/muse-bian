package org.museframework.bian.ecmanddcm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProspectusRequest {
    @MetaField
    private String ecmanddcmid;

    @MetaField
    private String prospectusid;

    @MetaField(ref=true)
    private org.museframework.bian.ecmanddcm.dto.bq.Prospectus prospectus;

    public void setEcmanddcmid(String ecmanddcmid) {
        this.ecmanddcmid = ecmanddcmid;
    }

    public String getEcmanddcmid() {
        return ecmanddcmid;
    }

    public void setProspectusid(String prospectusid) {
        this.prospectusid = prospectusid;
    }

    public String getProspectusid() {
        return prospectusid;
    }

    public void setProspectus(org.museframework.bian.ecmanddcm.dto.bq.Prospectus prospectus) {
        this.prospectus = prospectus;
    }

    public org.museframework.bian.ecmanddcm.dto.bq.Prospectus getProspectus() {
        return prospectus;
    }
}