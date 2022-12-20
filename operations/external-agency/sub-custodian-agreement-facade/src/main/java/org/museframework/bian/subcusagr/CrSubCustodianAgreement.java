package org.museframework.bian.subcusagr;

import org.museframework.bian.subcusagr.dto.ControlSubCustodianAgreementRequest;
import org.museframework.bian.subcusagr.dto.ControlSubCustodianAgreementResponse;
import org.museframework.bian.subcusagr.dto.EvaluateSubCustodianAgreementRequest;
import org.museframework.bian.subcusagr.dto.EvaluateSubCustodianAgreementResponse;
import org.museframework.bian.subcusagr.dto.ExchangeSubCustodianAgreementRequest;
import org.museframework.bian.subcusagr.dto.ExchangeSubCustodianAgreementResponse;
import org.museframework.bian.subcusagr.dto.GrantSubCustodianAgreementRequest;
import org.museframework.bian.subcusagr.dto.GrantSubCustodianAgreementResponse;
import org.museframework.bian.subcusagr.dto.NotifySubCustodianAgreementRequest;
import org.museframework.bian.subcusagr.dto.NotifySubCustodianAgreementResponse;
import org.museframework.bian.subcusagr.dto.RequestSubCustodianAgreementRequest;
import org.museframework.bian.subcusagr.dto.RequestSubCustodianAgreementResponse;
import org.museframework.bian.subcusagr.dto.RetrieveSubCustodianAgreementRequest;
import org.museframework.bian.subcusagr.dto.RetrieveSubCustodianAgreementResponse;
import org.museframework.bian.subcusagr.dto.UpdateSubCustodianAgreementRequest;
import org.museframework.bian.subcusagr.dto.UpdateSubCustodianAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Sub Custodian Agreement.  ")
@GenericDomain(name="SubCustodianAgreement", group="SubCustodianAgreement")
public interface CrSubCustodianAgreement {
    @GenericDtxEndpoint
    @Description("Control Sub Custodian Agreement")
    ControlSubCustodianAgreementResponse controlSubCustodianAgreement(ControlSubCustodianAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Evaluate Sub Custodian Agreement")
    EvaluateSubCustodianAgreementResponse evaluateSubCustodianAgreement(EvaluateSubCustodianAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Sub Custodian Agreement")
    ExchangeSubCustodianAgreementResponse exchangeSubCustodianAgreement(ExchangeSubCustodianAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Grant Sub Custodian Agreement")
    GrantSubCustodianAgreementResponse grantSubCustodianAgreement(GrantSubCustodianAgreementRequest req);

    @Description("Notify Sub Custodian Agreement")
    NotifySubCustodianAgreementResponse notifySubCustodianAgreement(NotifySubCustodianAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Request Sub Custodian Agreement")
    RequestSubCustodianAgreementResponse requestSubCustodianAgreement(RequestSubCustodianAgreementRequest req);

    @Description("Retrieve Sub Custodian Agreement")
    RetrieveSubCustodianAgreementResponse retrieveSubCustodianAgreement(RetrieveSubCustodianAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Update Sub Custodian Agreement")
    UpdateSubCustodianAgreementResponse updateSubCustodianAgreement(UpdateSubCustodianAgreementRequest req);
}