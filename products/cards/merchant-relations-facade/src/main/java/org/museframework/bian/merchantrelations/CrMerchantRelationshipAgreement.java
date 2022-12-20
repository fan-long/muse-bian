package org.museframework.bian.merchantrelations;

import org.museframework.bian.merchantrelations.dto.ControlMerchantRelationshipAgreementRequest;
import org.museframework.bian.merchantrelations.dto.ControlMerchantRelationshipAgreementResponse;
import org.museframework.bian.merchantrelations.dto.EvaluateMerchantRelationshipAgreementRequest;
import org.museframework.bian.merchantrelations.dto.EvaluateMerchantRelationshipAgreementResponse;
import org.museframework.bian.merchantrelations.dto.ExchangeMerchantRelationshipAgreementRequest;
import org.museframework.bian.merchantrelations.dto.ExchangeMerchantRelationshipAgreementResponse;
import org.museframework.bian.merchantrelations.dto.GrantMerchantRelationshipAgreementRequest;
import org.museframework.bian.merchantrelations.dto.GrantMerchantRelationshipAgreementResponse;
import org.museframework.bian.merchantrelations.dto.NotifyMerchantRelationshipAgreementRequest;
import org.museframework.bian.merchantrelations.dto.NotifyMerchantRelationshipAgreementResponse;
import org.museframework.bian.merchantrelations.dto.RequestMerchantRelationshipAgreementRequest;
import org.museframework.bian.merchantrelations.dto.RequestMerchantRelationshipAgreementResponse;
import org.museframework.bian.merchantrelations.dto.RetrieveMerchantRelationshipAgreementRequest;
import org.museframework.bian.merchantrelations.dto.RetrieveMerchantRelationshipAgreementResponse;
import org.museframework.bian.merchantrelations.dto.UpdateMerchantRelationshipAgreementRequest;
import org.museframework.bian.merchantrelations.dto.UpdateMerchantRelationshipAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Merchant Relations.  ")
@GenericDomain(name="MerchantRelations", group="MerchantRelationshipAgreement")
public interface CrMerchantRelationshipAgreement {
    @GenericDtxEndpoint
    @Description("Control Merchant Relationship Agreement")
    ControlMerchantRelationshipAgreementResponse controlMerchantRelationshipAgreement(ControlMerchantRelationshipAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Evaluate Merchant Relationship Agreement")
    EvaluateMerchantRelationshipAgreementResponse evaluateMerchantRelationshipAgreement(EvaluateMerchantRelationshipAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Merchant Relationship Agreement")
    ExchangeMerchantRelationshipAgreementResponse exchangeMerchantRelationshipAgreement(ExchangeMerchantRelationshipAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Grant Merchant Relationship Agreement")
    GrantMerchantRelationshipAgreementResponse grantMerchantRelationshipAgreement(GrantMerchantRelationshipAgreementRequest req);

    @Description("Notify Merchant Relationship Agreement")
    NotifyMerchantRelationshipAgreementResponse notifyMerchantRelationshipAgreement(NotifyMerchantRelationshipAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Request Merchant Relationship Agreement")
    RequestMerchantRelationshipAgreementResponse requestMerchantRelationshipAgreement(RequestMerchantRelationshipAgreementRequest req);

    @Description("Retrieve Merchant Relationship Agreement")
    RetrieveMerchantRelationshipAgreementResponse retrieveMerchantRelationshipAgreement(RetrieveMerchantRelationshipAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Update Merchant Relationship Agreement")
    UpdateMerchantRelationshipAgreementResponse updateMerchantRelationshipAgreement(UpdateMerchantRelationshipAgreementRequest req);
}