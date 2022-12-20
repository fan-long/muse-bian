package org.museframework.bian.internalaudit;

import org.museframework.bian.internalaudit.dto.ExchangeInternalAuditAssessmentRequest;
import org.museframework.bian.internalaudit.dto.ExchangeInternalAuditAssessmentResponse;
import org.museframework.bian.internalaudit.dto.ExecuteInternalAuditAssessmentRequest;
import org.museframework.bian.internalaudit.dto.ExecuteInternalAuditAssessmentResponse;
import org.museframework.bian.internalaudit.dto.GrantInternalAuditAssessmentRequest;
import org.museframework.bian.internalaudit.dto.GrantInternalAuditAssessmentResponse;
import org.museframework.bian.internalaudit.dto.InitiateInternalAuditAssessmentRequest;
import org.museframework.bian.internalaudit.dto.InitiateInternalAuditAssessmentResponse;
import org.museframework.bian.internalaudit.dto.RequestInternalAuditAssessmentRequest;
import org.museframework.bian.internalaudit.dto.RequestInternalAuditAssessmentResponse;
import org.museframework.bian.internalaudit.dto.RetrieveInternalAuditAssessmentRequest;
import org.museframework.bian.internalaudit.dto.RetrieveInternalAuditAssessmentResponse;
import org.museframework.bian.internalaudit.dto.UpdateInternalAuditAssessmentRequest;
import org.museframework.bian.internalaudit.dto.UpdateInternalAuditAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Internal Audit.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="InternalAudit", group="InternalAuditAssessment")
public interface CrInternalAuditAssessment {
    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Internal Audit Assessment processing")
    ExchangeInternalAuditAssessmentResponse exchangeInternalAuditAssessment(ExchangeInternalAuditAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Internal Audit Assessment")
    ExecuteInternalAuditAssessmentResponse executeInternalAuditAssessment(ExecuteInternalAuditAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to Internal Audit Assessment")
    GrantInternalAuditAssessmentResponse grantInternalAuditAssessment(GrantInternalAuditAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Internal Audit Assessment")
    InitiateInternalAuditAssessmentResponse initiateInternalAuditAssessment(InitiateInternalAuditAssessmentRequest req);

    @Description("ReCR Retrieve details about any aspect of Internal Audit Assessment")
    RetrieveInternalAuditAssessmentResponse retrieveInternalAuditAssessment(RetrieveInternalAuditAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Internal Audit Assessment")
    RequestInternalAuditAssessmentResponse requestInternalAuditAssessment(RequestInternalAuditAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Internal Audit Assessment")
    UpdateInternalAuditAssessmentResponse updateInternalAuditAssessment(UpdateInternalAuditAssessmentRequest req);
}