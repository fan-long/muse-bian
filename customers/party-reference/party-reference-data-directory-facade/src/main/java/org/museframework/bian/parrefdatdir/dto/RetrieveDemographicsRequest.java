package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDemographicsRequest {
    @MetaField
    private String partyreferencedatadirectoryid;

    @MetaField
    private String demographicsid;

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
}