package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDeviceTrackingRequest {
    @MetaField
    private String atmnetworkoperationsid;

    @MetaField
    private String devicetrackingid;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setDevicetrackingid(String devicetrackingid) {
        this.devicetrackingid = devicetrackingid;
    }

    public String getDevicetrackingid() {
        return devicetrackingid;
    }
}