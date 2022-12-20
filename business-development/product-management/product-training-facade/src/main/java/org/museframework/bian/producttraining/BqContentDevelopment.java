package org.museframework.bian.producttraining;

import org.museframework.bian.producttraining.dto.ExchangeContentDevelopmentRequest;
import org.museframework.bian.producttraining.dto.ExchangeContentDevelopmentResponse;
import org.museframework.bian.producttraining.dto.InitiateContentDevelopmentRequest;
import org.museframework.bian.producttraining.dto.InitiateContentDevelopmentResponse;
import org.museframework.bian.producttraining.dto.RequestContentDevelopmentRequest;
import org.museframework.bian.producttraining.dto.RequestContentDevelopmentResponse;
import org.museframework.bian.producttraining.dto.RetrieveContentDevelopmentRequest;
import org.museframework.bian.producttraining.dto.RetrieveContentDevelopmentResponse;
import org.museframework.bian.producttraining.dto.UpdateContentDevelopmentRequest;
import org.museframework.bian.producttraining.dto.UpdateContentDevelopmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="ProductTraining", group="ContentDevelopment")
public interface BqContentDevelopment {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Content Development processing")
    ExchangeContentDevelopmentResponse exchangeContentDevelopment(ExchangeContentDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Content Development")
    InitiateContentDevelopmentResponse initiateContentDevelopment(InitiateContentDevelopmentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Content Development")
    RetrieveContentDevelopmentResponse retrieveContentDevelopment(RetrieveContentDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Content Development")
    RequestContentDevelopmentResponse requestContentDevelopment(RequestContentDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Content Development")
    UpdateContentDevelopmentResponse updateContentDevelopment(UpdateContentDevelopmentRequest req);
}