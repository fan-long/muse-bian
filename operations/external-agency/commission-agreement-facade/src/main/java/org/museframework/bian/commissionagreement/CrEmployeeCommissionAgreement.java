package org.museframework.bian.commissionagreement;

import org.museframework.bian.commissionagreement.dto.ControlEmployeeCommissionAgreementRequest;
import org.museframework.bian.commissionagreement.dto.ControlEmployeeCommissionAgreementResponse;
import org.museframework.bian.commissionagreement.dto.ExchangeEmployeeCommissionAgreementRequest;
import org.museframework.bian.commissionagreement.dto.ExchangeEmployeeCommissionAgreementResponse;
import org.museframework.bian.commissionagreement.dto.GrantEmployeeCommissionAgreementRequest;
import org.museframework.bian.commissionagreement.dto.GrantEmployeeCommissionAgreementResponse;
import org.museframework.bian.commissionagreement.dto.InitiateEmployeeCommissionAgreementRequest;
import org.museframework.bian.commissionagreement.dto.InitiateEmployeeCommissionAgreementResponse;
import org.museframework.bian.commissionagreement.dto.RequestEmployeeCommissionAgreementRequest;
import org.museframework.bian.commissionagreement.dto.RequestEmployeeCommissionAgreementResponse;
import org.museframework.bian.commissionagreement.dto.RetrieveEmployeeCommissionAgreementRequest;
import org.museframework.bian.commissionagreement.dto.RetrieveEmployeeCommissionAgreementResponse;
import org.museframework.bian.commissionagreement.dto.UpdateEmployeeCommissionAgreementRequest;
import org.museframework.bian.commissionagreement.dto.UpdateEmployeeCommissionAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Commission Agreement. Example: Define and maintain the terms govering the contratcual relationship with a customer.")
@GenericDomain(name="CommissionAgreement", group="EmployeeCommissionAgreement")
public interface CrEmployeeCommissionAgreement {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Employee Commission Agreement")
    ControlEmployeeCommissionAgreementResponse controlEmployeeCommissionAgreement(ControlEmployeeCommissionAgreementRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Employee Commission Agreement processing")
    ExchangeEmployeeCommissionAgreementResponse exchangeEmployeeCommissionAgreement(ExchangeEmployeeCommissionAgreementRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to Employee Commission Agreement")
    GrantEmployeeCommissionAgreementResponse grantEmployeeCommissionAgreement(GrantEmployeeCommissionAgreementRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Employee Commission Agreement")
    InitiateEmployeeCommissionAgreementResponse initiateEmployeeCommissionAgreement(InitiateEmployeeCommissionAgreementRequest req);

    @Description("ReCR Retrieve details about any aspect of Employee Commission Agreement")
    RetrieveEmployeeCommissionAgreementResponse retrieveEmployeeCommissionAgreement(RetrieveEmployeeCommissionAgreementRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Employee Commission Agreement")
    RequestEmployeeCommissionAgreementResponse requestEmployeeCommissionAgreement(RequestEmployeeCommissionAgreementRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Employee Commission Agreement")
    UpdateEmployeeCommissionAgreementResponse updateEmployeeCommissionAgreement(UpdateEmployeeCommissionAgreementRequest req);
}