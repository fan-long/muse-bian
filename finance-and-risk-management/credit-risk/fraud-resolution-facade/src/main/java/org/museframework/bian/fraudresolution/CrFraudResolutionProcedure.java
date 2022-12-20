package org.museframework.bian.fraudresolution;

import org.museframework.bian.fraudresolution.dto.InitiateFraudResolutionProcedureRequest;
import org.museframework.bian.fraudresolution.dto.InitiateFraudResolutionProcedureResponse;
import org.museframework.bian.fraudresolution.dto.RetrieveFraudResolutionProcedureRequest;
import org.museframework.bian.fraudresolution.dto.RetrieveFraudResolutionProcedureResponse;
import org.museframework.bian.fraudresolution.dto.UpdateFraudResolutionProcedureRequest;
import org.museframework.bian.fraudresolution.dto.UpdateFraudResolutionProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Fraud Resolution. ")
@GenericDomain(name="FraudResolution", group="FraudResolutionProcedure")
public interface CrFraudResolutionProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate a fraud case")
    InitiateFraudResolutionProcedureResponse initiateFraudResolutionProcedure(InitiateFraudResolutionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active fraud case")
    UpdateFraudResolutionProcedureResponse updateFraudResolutionProcedure(UpdateFraudResolutionProcedureRequest req);

    @Description("ReCR Retrieve information about an active fraud case")
    RetrieveFraudResolutionProcedureResponse retrieveFraudResolutionProcedure(RetrieveFraudResolutionProcedureRequest req);
}