package org.museframework.bian.customercase;

import org.museframework.bian.customercase.dto.InitiateCustomerCaseProcedureRequest;
import org.museframework.bian.customercase.dto.InitiateCustomerCaseProcedureResponse;
import org.museframework.bian.customercase.dto.RetrieveCustomerCaseProcedureRequest;
import org.museframework.bian.customercase.dto.RetrieveCustomerCaseProcedureResponse;
import org.museframework.bian.customercase.dto.UpdateCustomerCaseProcedureRequest;
import org.museframework.bian.customercase.dto.UpdateCustomerCaseProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Customer Case. ")
@GenericDomain(name="CustomerCase", group="CustomerCaseProcedure")
public interface CrCustomerCaseProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate a customer case procedure")
    InitiateCustomerCaseProcedureResponse initiateCustomerCaseProcedure(InitiateCustomerCaseProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about a customer case")
    UpdateCustomerCaseProcedureResponse updateCustomerCaseProcedure(UpdateCustomerCaseProcedureRequest req);

    @Description("ReCR Retrieve details about a customer case")
    RetrieveCustomerCaseProcedureResponse retrieveCustomerCaseProcedure(RetrieveCustomerCaseProcedureRequest req);
}