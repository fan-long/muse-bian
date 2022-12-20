package org.museframework.bian.internalaudit;

import org.museframework.bian.internalaudit.dto.ExchangeAuditRequest;
import org.museframework.bian.internalaudit.dto.ExchangeAuditResponse;
import org.museframework.bian.internalaudit.dto.ExecuteAuditRequest;
import org.museframework.bian.internalaudit.dto.ExecuteAuditResponse;
import org.museframework.bian.internalaudit.dto.GrantAuditRequest;
import org.museframework.bian.internalaudit.dto.GrantAuditResponse;
import org.museframework.bian.internalaudit.dto.InitiateAuditRequest;
import org.museframework.bian.internalaudit.dto.InitiateAuditResponse;
import org.museframework.bian.internalaudit.dto.RequestAuditRequest;
import org.museframework.bian.internalaudit.dto.RequestAuditResponse;
import org.museframework.bian.internalaudit.dto.RetrieveAuditRequest;
import org.museframework.bian.internalaudit.dto.RetrieveAuditResponse;
import org.museframework.bian.internalaudit.dto.UpdateAuditRequest;
import org.museframework.bian.internalaudit.dto.UpdateAuditResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Internal Audit.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="InternalAudit", group="Audit")
public interface BqAudit {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Audit processing")
    ExchangeAuditResponse exchangeAudit(ExchangeAuditRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Audit")
    ExecuteAuditResponse executeAudit(ExecuteAuditRequest req);

    @GenericDtxEndpoint
    @Description("GrBQ Obtain permission to act in relation to Audit")
    GrantAuditResponse grantAudit(GrantAuditRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Audit")
    InitiateAuditResponse initiateAudit(InitiateAuditRequest req);

    @Description("ReBQ Retrieve details about any aspect of Audit")
    RetrieveAuditResponse retrieveAudit(RetrieveAuditRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Audit")
    RequestAuditResponse requestAudit(RequestAuditRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Audit")
    UpdateAuditResponse updateAudit(UpdateAuditRequest req);
}