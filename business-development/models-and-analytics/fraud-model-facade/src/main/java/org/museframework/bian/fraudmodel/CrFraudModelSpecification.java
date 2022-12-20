package org.museframework.bian.fraudmodel;

import org.museframework.bian.fraudmodel.dto.CreateFraudModelSpecificationRequest;
import org.museframework.bian.fraudmodel.dto.CreateFraudModelSpecificationResponse;
import org.museframework.bian.fraudmodel.dto.RetrieveFraudModelSpecificationRequest;
import org.museframework.bian.fraudmodel.dto.RetrieveFraudModelSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Fraud Model.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="FraudModel", group="FraudModelSpecification")
public interface CrFraudModelSpecification {
    @GenericDtxEndpoint
    @Description("CrCR Create or register an imported fraud model")
    CreateFraudModelSpecificationResponse createFraudModelSpecification(CreateFraudModelSpecificationRequest req);

    @Description("ReCR Retrieve details about a fraud model")
    RetrieveFraudModelSpecificationResponse retrieveFraudModelSpecification(RetrieveFraudModelSpecificationRequest req);
}