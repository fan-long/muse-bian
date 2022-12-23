package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveNetworkOperationRequest {
    @MetaField
    private String atmnetworkoperationsid;

    @MetaField
    private String networkoperationid;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setNetworkoperationid(String networkoperationid) {
        this.networkoperationid = networkoperationid;
    }

    public String getNetworkoperationid() {
        return networkoperationid;
    }
}