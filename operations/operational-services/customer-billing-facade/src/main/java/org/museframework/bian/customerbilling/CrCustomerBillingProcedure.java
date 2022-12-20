package org.museframework.bian.customerbilling;

import org.museframework.bian.customerbilling.dto.ExecuteCustomerBillingProcedureRequest;
import org.museframework.bian.customerbilling.dto.ExecuteCustomerBillingProcedureResponse;
import org.museframework.bian.customerbilling.dto.InitiateCustomerBillingProcedureRequest;
import org.museframework.bian.customerbilling.dto.InitiateCustomerBillingProcedureResponse;
import org.museframework.bian.customerbilling.dto.RequestCustomerBillingProcedureRequest;
import org.museframework.bian.customerbilling.dto.RequestCustomerBillingProcedureResponse;
import org.museframework.bian.customerbilling.dto.RetrieveCustomerBillingProcedureRequest;
import org.museframework.bian.customerbilling.dto.RetrieveCustomerBillingProcedureResponse;
import org.museframework.bian.customerbilling.dto.UpdateCustomerBillingProcedureRequest;
import org.museframework.bian.customerbilling.dto.UpdateCustomerBillingProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Customer Billing. ")
@GenericDomain(name="CustomerBilling", group="CustomerBillingProcedure")
public interface CrCustomerBillingProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate customer billing for a customer")
    InitiateCustomerBillingProcedureResponse initiateCustomerBillingProcedure(InitiateCustomerBillingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a customer billing transaction")
    UpdateCustomerBillingProcedureResponse updateCustomerBillingProcedure(UpdateCustomerBillingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action against an active bill (e.g. resubmit)")
    ExecuteCustomerBillingProcedureResponse executeCustomerBillingProcedure(ExecuteCustomerBillingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with an active billing procedure")
    RequestCustomerBillingProcedureResponse requestCustomerBillingProcedure(RequestCustomerBillingProcedureRequest req);

    @Description("ReCR Retrieve details about an active billing procedure")
    RetrieveCustomerBillingProcedureResponse retrieveCustomerBillingProcedure(RetrieveCustomerBillingProcedureRequest req);
}