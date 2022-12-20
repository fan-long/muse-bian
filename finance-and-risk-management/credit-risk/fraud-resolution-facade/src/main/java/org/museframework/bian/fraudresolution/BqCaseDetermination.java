package org.museframework.bian.fraudresolution;

import org.museframework.bian.fraudresolution.dto.RetrieveCaseDeterminationRequest;
import org.museframework.bian.fraudresolution.dto.RetrieveCaseDeterminationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="FraudResolution", group="CaseDetermination")
public interface BqCaseDetermination {
    @Description("ReCR Retrieve information about an active fraud case determination")
    RetrieveCaseDeterminationResponse retrieveCaseDetermination(RetrieveCaseDeterminationRequest req);
}