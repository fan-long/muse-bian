package org.museframework.bian.sessiondialogue;

import org.museframework.bian.sessiondialogue.dto.InitiateProductorServiceRequest;
import org.museframework.bian.sessiondialogue.dto.InitiateProductorServiceResponse;
import org.museframework.bian.sessiondialogue.dto.RetrieveProductorServiceRequest;
import org.museframework.bian.sessiondialogue.dto.RetrieveProductorServiceResponse;
import org.museframework.bian.sessiondialogue.dto.UpdateProductorServiceRequest;
import org.museframework.bian.sessiondialogue.dto.UpdateProductorServiceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="SessionDialogue", group="ProductorService")
public interface BqProductorService {
    @GenericDtxEndpoint
    @Description("InBQ Initiate customer product/service handling")
    InitiateProductorServiceResponse initiateProductorService(InitiateProductorServiceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for product/service handling")
    UpdateProductorServiceResponse updateProductorService(UpdateProductorServiceRequest req);

    @Description("ReBQ Retrieve details about product/service handling")
    RetrieveProductorServiceResponse retrieveProductorService(RetrieveProductorServiceRequest req);
}