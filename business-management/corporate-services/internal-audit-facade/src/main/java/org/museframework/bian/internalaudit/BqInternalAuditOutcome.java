package org.museframework.bian.internalaudit;

import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Internal Audit.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="InternalAudit", group="InternalAuditOutcome")
public interface BqInternalAuditOutcome {
}