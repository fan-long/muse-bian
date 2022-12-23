package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestCashDistributionRequest {
    @MetaField
    private String atmnetworkoperationsid;

    @MetaField
    private String cashdistributionid;

    @MetaField(ref=true)
    private org.museframework.bian.atmnetope.dto.bq.CashDistribution cashDistribution;

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

    public void setCashDistribution(org.museframework.bian.atmnetope.dto.bq.CashDistribution cashDistribution) {
        this.cashDistribution = cashDistribution;
    }

    public org.museframework.bian.atmnetope.dto.bq.CashDistribution getCashDistribution() {
        return cashDistribution;
    }
}