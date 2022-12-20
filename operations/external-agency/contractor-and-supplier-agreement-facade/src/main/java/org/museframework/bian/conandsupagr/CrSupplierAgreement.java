package org.museframework.bian.conandsupagr;

import org.museframework.bian.conandsupagr.dto.ControlSupplierAgreementRequest;
import org.museframework.bian.conandsupagr.dto.ControlSupplierAgreementResponse;
import org.museframework.bian.conandsupagr.dto.EvaluateSupplierAgreementRequest;
import org.museframework.bian.conandsupagr.dto.EvaluateSupplierAgreementResponse;
import org.museframework.bian.conandsupagr.dto.ExchangeSupplierAgreementRequest;
import org.museframework.bian.conandsupagr.dto.ExchangeSupplierAgreementResponse;
import org.museframework.bian.conandsupagr.dto.GrantSupplierAgreementRequest;
import org.museframework.bian.conandsupagr.dto.GrantSupplierAgreementResponse;
import org.museframework.bian.conandsupagr.dto.NotifySupplierAgreementRequest;
import org.museframework.bian.conandsupagr.dto.NotifySupplierAgreementResponse;
import org.museframework.bian.conandsupagr.dto.RequestSupplierAgreementRequest;
import org.museframework.bian.conandsupagr.dto.RequestSupplierAgreementResponse;
import org.museframework.bian.conandsupagr.dto.RetrieveSupplierAgreementRequest;
import org.museframework.bian.conandsupagr.dto.RetrieveSupplierAgreementResponse;
import org.museframework.bian.conandsupagr.dto.UpdateSupplierAgreementRequest;
import org.museframework.bian.conandsupagr.dto.UpdateSupplierAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Contractor and Supplier Agreement.  ")
@GenericDomain(name="ContractorandSupplierAgreement", group="SupplierAgreement")
public interface CrSupplierAgreement {
    @GenericDtxEndpoint
    @Description("Control Supplier Agreement")
    ControlSupplierAgreementResponse controlSupplierAgreement(ControlSupplierAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Evaluate Supplier Agreement")
    EvaluateSupplierAgreementResponse evaluateSupplierAgreement(EvaluateSupplierAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Supplier Agreement")
    ExchangeSupplierAgreementResponse exchangeSupplierAgreement(ExchangeSupplierAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Grant Supplier Agreement")
    GrantSupplierAgreementResponse grantSupplierAgreement(GrantSupplierAgreementRequest req);

    @Description("Notify Supplier Agreement")
    NotifySupplierAgreementResponse notifySupplierAgreement(NotifySupplierAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Request Supplier Agreement")
    RequestSupplierAgreementResponse requestSupplierAgreement(RequestSupplierAgreementRequest req);

    @Description("Retrieve Supplier Agreement")
    RetrieveSupplierAgreementResponse retrieveSupplierAgreement(RetrieveSupplierAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Update Supplier Agreement")
    UpdateSupplierAgreementResponse updateSupplierAgreement(UpdateSupplierAgreementRequest req);
}