package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ControlNetworkOperationRequest {
    @MetaField
    private String atmnetworkoperationsid;

    @MetaField
    private String networkoperationid;

    @MetaField(ref=true)
    private org.museframework.bian.atmnetope.dto.bq.NetworkOperation networkOperation;

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

    public void setNetworkOperation(org.museframework.bian.atmnetope.dto.bq.NetworkOperation networkOperation) {
        this.networkOperation = networkOperation;
    }

    public org.museframework.bian.atmnetope.dto.bq.NetworkOperation getNetworkOperation() {
        return networkOperation;
    }
}