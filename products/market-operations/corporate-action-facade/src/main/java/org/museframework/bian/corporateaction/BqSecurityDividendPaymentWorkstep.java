package org.museframework.bian.corporateaction;

import org.museframework.bian.corporateaction.dto.ExchangeSecurityDividendPaymentWorkstepRequest;
import org.museframework.bian.corporateaction.dto.ExchangeSecurityDividendPaymentWorkstepResponse;
import org.museframework.bian.corporateaction.dto.ExecuteSecurityDividendPaymentWorkstepRequest;
import org.museframework.bian.corporateaction.dto.ExecuteSecurityDividendPaymentWorkstepResponse;
import org.museframework.bian.corporateaction.dto.InitiateSecurityDividendPaymentWorkstepRequest;
import org.museframework.bian.corporateaction.dto.InitiateSecurityDividendPaymentWorkstepResponse;
import org.museframework.bian.corporateaction.dto.NotifySecurityDividendPaymentWorkstepRequest;
import org.museframework.bian.corporateaction.dto.NotifySecurityDividendPaymentWorkstepResponse;
import org.museframework.bian.corporateaction.dto.RequestSecurityDividendPaymentWorkstepRequest;
import org.museframework.bian.corporateaction.dto.RequestSecurityDividendPaymentWorkstepResponse;
import org.museframework.bian.corporateaction.dto.RetrieveSecurityDividendPaymentWorkstepRequest;
import org.museframework.bian.corporateaction.dto.RetrieveSecurityDividendPaymentWorkstepResponse;
import org.museframework.bian.corporateaction.dto.UpdateSecurityDividendPaymentWorkstepRequest;
import org.museframework.bian.corporateaction.dto.UpdateSecurityDividendPaymentWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Security Spin-Off Action Workstep in the context of executing the Security Spin-Off Action Workstep")
@GenericDomain(name="CorporateAction", group="SecurityDividendPaymentWorkstep")
public interface BqSecurityDividendPaymentWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Security Dividend Payment Workstep")
    ExchangeSecurityDividendPaymentWorkstepResponse exchangeSecurityDividendPaymentWorkstep(ExchangeSecurityDividendPaymentWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Security Dividend Payment Workstep")
    ExecuteSecurityDividendPaymentWorkstepResponse executeSecurityDividendPaymentWorkstep(ExecuteSecurityDividendPaymentWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Security Dividend Payment Workstep")
    InitiateSecurityDividendPaymentWorkstepResponse initiateSecurityDividendPaymentWorkstep(InitiateSecurityDividendPaymentWorkstepRequest req);

    @Description("Notify Security Dividend Payment Workstep")
    NotifySecurityDividendPaymentWorkstepResponse notifySecurityDividendPaymentWorkstep(NotifySecurityDividendPaymentWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Security Dividend Payment Workstep")
    RequestSecurityDividendPaymentWorkstepResponse requestSecurityDividendPaymentWorkstep(RequestSecurityDividendPaymentWorkstepRequest req);

    @Description("Retrieve Security Dividend Payment Workstep")
    RetrieveSecurityDividendPaymentWorkstepResponse retrieveSecurityDividendPaymentWorkstep(RetrieveSecurityDividendPaymentWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Security Dividend Payment Workstep")
    UpdateSecurityDividendPaymentWorkstepResponse updateSecurityDividendPaymentWorkstep(UpdateSecurityDividendPaymentWorkstepRequest req);
}