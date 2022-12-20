package org.museframework.bian.producttraining;

import org.museframework.bian.producttraining.dto.ExchangeServiceSchedulingRequest;
import org.museframework.bian.producttraining.dto.ExchangeServiceSchedulingResponse;
import org.museframework.bian.producttraining.dto.ExecuteServiceSchedulingRequest;
import org.museframework.bian.producttraining.dto.ExecuteServiceSchedulingResponse;
import org.museframework.bian.producttraining.dto.InitiateServiceSchedulingRequest;
import org.museframework.bian.producttraining.dto.InitiateServiceSchedulingResponse;
import org.museframework.bian.producttraining.dto.RequestServiceSchedulingRequest;
import org.museframework.bian.producttraining.dto.RequestServiceSchedulingResponse;
import org.museframework.bian.producttraining.dto.RetrieveServiceSchedulingRequest;
import org.museframework.bian.producttraining.dto.RetrieveServiceSchedulingResponse;
import org.museframework.bian.producttraining.dto.UpdateServiceSchedulingRequest;
import org.museframework.bian.producttraining.dto.UpdateServiceSchedulingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="ProductTraining", group="ServiceScheduling")
public interface BqServiceScheduling {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Service Scheduling processing")
    ExchangeServiceSchedulingResponse exchangeServiceScheduling(ExchangeServiceSchedulingRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Service Scheduling")
    ExecuteServiceSchedulingResponse executeServiceScheduling(ExecuteServiceSchedulingRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Service Scheduling")
    InitiateServiceSchedulingResponse initiateServiceScheduling(InitiateServiceSchedulingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Service Scheduling")
    RetrieveServiceSchedulingResponse retrieveServiceScheduling(RetrieveServiceSchedulingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Service Scheduling")
    RequestServiceSchedulingResponse requestServiceScheduling(RequestServiceSchedulingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Service Scheduling")
    UpdateServiceSchedulingResponse updateServiceScheduling(UpdateServiceSchedulingRequest req);
}