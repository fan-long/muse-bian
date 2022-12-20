package org.museframework.bian.bracurdis;

import org.museframework.bian.bracurdis.dto.RequestDistributionVehicleAdministrationRequest;
import org.museframework.bian.bracurdis.dto.RequestDistributionVehicleAdministrationResponse;
import org.museframework.bian.bracurdis.dto.RetrieveDistributionVehicleAdministrationRequest;
import org.museframework.bian.bracurdis.dto.RetrieveDistributionVehicleAdministrationResponse;
import org.museframework.bian.bracurdis.dto.UpdateDistributionVehicleAdministrationRequest;
import org.museframework.bian.bracurdis.dto.UpdateDistributionVehicleAdministrationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="BranchCurrencyDistribution", group="DistributionVehicleAdministration")
public interface BqDistributionVehicleAdministration {
    @Description("ReBQ Retrieve details about any aspect of Distribution Vehicle Administration")
    RetrieveDistributionVehicleAdministrationResponse retrieveDistributionVehicleAdministration(RetrieveDistributionVehicleAdministrationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Distribution Vehicle Administration")
    RequestDistributionVehicleAdministrationResponse requestDistributionVehicleAdministration(RequestDistributionVehicleAdministrationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Distribution Vehicle Administration")
    UpdateDistributionVehicleAdministrationResponse updateDistributionVehicleAdministration(UpdateDistributionVehicleAdministrationRequest req);
}