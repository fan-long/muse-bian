package org.museframework.bian.ebranchoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequesteBranchChannelOperatingSessionRequest {
    @MetaField
    private String ebranchoperationsid;

    @MetaField(ref=true)
    private org.museframework.bian.ebranchoperations.dto.cr.eBranchChannelOperatingSession eBranchChannelOperatingSession;

    public void setEbranchoperationsid(String ebranchoperationsid) {
        this.ebranchoperationsid = ebranchoperationsid;
    }

    public String getEbranchoperationsid() {
        return ebranchoperationsid;
    }

    public void seteBranchChannelOperatingSession(org.museframework.bian.ebranchoperations.dto.cr.eBranchChannelOperatingSession eBranchChannelOperatingSession) {
        this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
    }

    public org.museframework.bian.ebranchoperations.dto.cr.eBranchChannelOperatingSession geteBranchChannelOperatingSession() {
        return eBranchChannelOperatingSession;
    }
}