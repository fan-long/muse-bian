package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeDeviceTrackingRequest {
    @MetaField
    private String atmnetworkoperationsid;

    @MetaField
    private String devicetrackingid;

    @MetaField(ref=true)
    private org.museframework.bian.atmnetope.dto.bq.DeviceTracking deviceTracking;

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

    public void setDeviceTracking(org.museframework.bian.atmnetope.dto.bq.DeviceTracking deviceTracking) {
        this.deviceTracking = deviceTracking;
    }

    public org.museframework.bian.atmnetope.dto.bq.DeviceTracking getDeviceTracking() {
        return deviceTracking;
    }
}