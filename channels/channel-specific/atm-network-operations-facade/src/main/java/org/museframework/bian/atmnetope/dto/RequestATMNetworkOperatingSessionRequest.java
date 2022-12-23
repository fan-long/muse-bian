package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestATMNetworkOperatingSessionRequest {
    @MetaField
    private String atmnetworkoperationsid;

    @MetaField(ref=true)
    private org.museframework.bian.atmnetope.dto.cr.ATMNetworkOperatingSession aTMNetworkOperatingSession;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setaTMNetworkOperatingSession(org.museframework.bian.atmnetope.dto.cr.ATMNetworkOperatingSession aTMNetworkOperatingSession) {
        this.aTMNetworkOperatingSession = aTMNetworkOperatingSession;
    }

    public org.museframework.bian.atmnetope.dto.cr.ATMNetworkOperatingSession getaTMNetworkOperatingSession() {
        return aTMNetworkOperatingSession;
    }
}