package org.museframework.bian.corporatelease;

import org.museframework.bian.corporatelease.dto.ControlAdministerRequest;
import org.museframework.bian.corporatelease.dto.ControlAdministerResponse;
import org.museframework.bian.corporatelease.dto.ExchangeAdministerRequest;
import org.museframework.bian.corporatelease.dto.ExchangeAdministerResponse;
import org.museframework.bian.corporatelease.dto.RequestAdministerRequest;
import org.museframework.bian.corporatelease.dto.RequestAdministerResponse;
import org.museframework.bian.corporatelease.dto.RetrieveAdministerRequest;
import org.museframework.bian.corporatelease.dto.RetrieveAdministerResponse;
import org.museframework.bian.corporatelease.dto.UpdateAdministerRequest;
import org.museframework.bian.corporatelease.dto.UpdateAdministerResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Corporate Lease.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="CorporateLease", group="Administer")
public interface BqAdminister {
    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Administer")
    ControlAdministerResponse controlAdminister(ControlAdministerRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Administer processing")
    ExchangeAdministerResponse exchangeAdminister(ExchangeAdministerRequest req);

    @Description("ReBQ Retrieve details about any aspect of Administer")
    RetrieveAdministerResponse retrieveAdminister(RetrieveAdministerRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Administer")
    RequestAdministerResponse requestAdminister(RequestAdministerRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Administer")
    UpdateAdministerResponse updateAdminister(UpdateAdministerRequest req);
}