package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCashDistributionRequest {
    @MetaField
    private String atmnetworkoperationsid;

    @MetaField
    private String cashdistributionid;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setCashdistributionid(String cashdistributionid) {
        this.cashdistributionid = cashdistributionid;
    }

    public String getCashdistributionid() {
        return cashdistributionid;
    }
}