package org.museframework.bian.parrefdatdir;

import org.museframework.bian.parrefdatdir.dto.RetrieveDemographicsRequest;
import org.museframework.bian.parrefdatdir.dto.RetrieveDemographicsResponse;
import org.museframework.bian.parrefdatdir.dto.UpdateDemographicsRequest;
import org.museframework.bian.parrefdatdir.dto.UpdateDemographicsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="PartyReferenceDataDirectory", group="Demographics")
public interface BqDemographics {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about a customer's demographic entry")
    UpdateDemographicsResponse updateDemographics(UpdateDemographicsRequest req);

    @Description("ReBQ Retrieve details about customer demographics entries in the directory")
    RetrieveDemographicsResponse retrieveDemographics(RetrieveDemographicsRequest req);
}