package org.museframework.bian.bralocman;

import org.museframework.bian.bralocman.dto.CaptureCustomerLiaisonRequest;
import org.museframework.bian.bralocman.dto.CaptureCustomerLiaisonResponse;
import org.museframework.bian.bralocman.dto.InitiateCustomerLiaisonRequest;
import org.museframework.bian.bralocman.dto.InitiateCustomerLiaisonResponse;
import org.museframework.bian.bralocman.dto.RequestCustomerLiaisonRequest;
import org.museframework.bian.bralocman.dto.RequestCustomerLiaisonResponse;
import org.museframework.bian.bralocman.dto.RetrieveCustomerLiaisonRequest;
import org.museframework.bian.bralocman.dto.RetrieveCustomerLiaisonResponse;
import org.museframework.bian.bralocman.dto.UpdateCustomerLiaisonRequest;
import org.museframework.bian.bralocman.dto.UpdateCustomerLiaisonResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management. Example: Manage the day to day activities at a bank branch location.")
@GenericDomain(name="BranchLocationManagement", group="CustomerLiaison")
public interface BqCustomerLiaison {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Customer Liaison activity or event related information")
    CaptureCustomerLiaisonResponse captureCustomerLiaison(CaptureCustomerLiaisonRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Customer Liaison")
    InitiateCustomerLiaisonResponse initiateCustomerLiaison(InitiateCustomerLiaisonRequest req);

    @Description("ReBQ Retrieve details about any aspect of Customer Liaison")
    RetrieveCustomerLiaisonResponse retrieveCustomerLiaison(RetrieveCustomerLiaisonRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Customer Liaison")
    RequestCustomerLiaisonResponse requestCustomerLiaison(RequestCustomerLiaisonRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Customer Liaison")
    UpdateCustomerLiaisonResponse updateCustomerLiaison(UpdateCustomerLiaisonRequest req);
}