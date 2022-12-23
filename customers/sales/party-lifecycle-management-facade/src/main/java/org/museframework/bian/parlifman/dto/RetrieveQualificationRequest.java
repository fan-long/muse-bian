package org.museframework.bian.parlifman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveQualificationRequest {
    @MetaField
    private String partylifecyclemanagementid;

    @MetaField
    private String qualificationid;

    public void setPartylifecyclemanagementid(String partylifecyclemanagementid) {
        this.partylifecyclemanagementid = partylifecyclemanagementid;
    }

    public String getPartylifecyclemanagementid() {
        return partylifecyclemanagementid;
    }

    public void setQualificationid(String qualificationid) {
        this.qualificationid = qualificationid;
    }

    public String getQualificationid() {
        return qualificationid;
    }
}