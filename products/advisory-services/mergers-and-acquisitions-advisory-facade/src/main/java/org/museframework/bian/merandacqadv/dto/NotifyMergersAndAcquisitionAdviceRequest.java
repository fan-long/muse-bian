package org.museframework.bian.merandacqadv.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyMergersAndAcquisitionAdviceRequest {
    @MetaField
    private String mergersandacquisitionsadvisoryid;

    public void setMergersandacquisitionsadvisoryid(String mergersandacquisitionsadvisoryid) {
        this.mergersandacquisitionsadvisoryid = mergersandacquisitionsadvisoryid;
    }

    public String getMergersandacquisitionsadvisoryid() {
        return mergersandacquisitionsadvisoryid;
    }
}