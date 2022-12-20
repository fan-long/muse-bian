package org.museframework.bian.dirdebman;

import org.museframework.bian.dirdebman.dto.ExecuteMandateRegistrationRequest;
import org.museframework.bian.dirdebman.dto.ExecuteMandateRegistrationResponse;
import org.museframework.bian.dirdebman.dto.RegisterMandateRegistrationRequest;
import org.museframework.bian.dirdebman.dto.RegisterMandateRegistrationResponse;
import org.museframework.bian.dirdebman.dto.RequestMandateRegistrationRequest;
import org.museframework.bian.dirdebman.dto.RequestMandateRegistrationResponse;
import org.museframework.bian.dirdebman.dto.RetrieveMandateRegistrationRequest;
import org.museframework.bian.dirdebman.dto.RetrieveMandateRegistrationResponse;
import org.museframework.bian.dirdebman.dto.UpdateMandateRegistrationRequest;
import org.museframework.bian.dirdebman.dto.UpdateMandateRegistrationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="DirectDebitMandate", group="MandateRegistration")
public interface BqMandateRegistration {
    @GenericDtxEndpoint
    @Description("ReBQ Register a customer's DD mandate for a corporate customer")
    RegisterMandateRegistrationResponse registerMandateRegistration(RegisterMandateRegistrationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of the customer's DD mandate")
    UpdateMandateRegistrationResponse updateMandateRegistration(UpdateMandateRegistrationRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action against the DD Mandate (e.g. test proposed payment)")
    ExecuteMandateRegistrationResponse executeMandateRegistration(ExecuteMandateRegistrationRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Request intervention with a customer's DD Mandate (e.g. retrieve paperwork)")
    RequestMandateRegistrationResponse requestMandateRegistration(RequestMandateRegistrationRequest req);

    @Description("ReBQ Retrieve details about a customer's DD mandate")
    RetrieveMandateRegistrationResponse retrieveMandateRegistration(RetrieveMandateRegistrationRequest req);
}