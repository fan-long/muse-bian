package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDemographicsRequest {
    @MetaField
    private String partyreferencedatadirectoryid;

    @MetaField
    private String demographicsid;

    @MetaField(ref=true)
    private org.museframework.bian.parrefdatdir.dto.bq.Demographics demographics;

    public void setPartyreferencedatadirectoryid(String partyreferencedatadirectoryid) {
        this.partyreferencedatadirectoryid = partyreferencedatadirectoryid;
    }

    public String getPartyreferencedatadirectoryid() {
        return partyreferencedatadirectoryid;
    }

    public void setDemographicsid(String demographicsid) {
        this.demographicsid = demographicsid;
    }

    public String getDemographicsid() {
        return demographicsid;
    }

    public void setDemographics(org.museframework.bian.parrefdatdir.dto.bq.Demographics demographics) {
        this.demographics = demographics;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Demographics getDemographics() {
        return demographics;
    }
}