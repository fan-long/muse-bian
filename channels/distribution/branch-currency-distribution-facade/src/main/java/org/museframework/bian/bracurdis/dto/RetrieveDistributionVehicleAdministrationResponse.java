package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDistributionVehicleAdministrationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bracurdis.dto.bq.DistributionVehicleAdministration distributionVehicleAdministration;

    public void setDistributionVehicleAdministration(org.museframework.bian.bracurdis.dto.bq.DistributionVehicleAdministration distributionVehicleAdministration) {
        this.distributionVehicleAdministration = distributionVehicleAdministration;
    }

    public org.museframework.bian.bracurdis.dto.bq.DistributionVehicleAdministration getDistributionVehicleAdministration() {
        return distributionVehicleAdministration;
    }
}