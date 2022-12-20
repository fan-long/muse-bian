package org.museframework.bian.customercase;

import org.museframework.bian.customercase.dto.RetrieveDeterminationRequest;
import org.museframework.bian.customercase.dto.RetrieveDeterminationResponse;
import org.museframework.bian.customercase.dto.UpdateDeterminationRequest;
import org.museframework.bian.customercase.dto.UpdateDeterminationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerCase", group="Determination")
public interface BqDetermination {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the determination in a customer case")
    UpdateDeterminationResponse updateDetermination(UpdateDeterminationRequest req);

    @Description("ReBQ Retrieve details about the determination of a customer case")
    RetrieveDeterminationResponse retrieveDetermination(RetrieveDeterminationRequest req);
}