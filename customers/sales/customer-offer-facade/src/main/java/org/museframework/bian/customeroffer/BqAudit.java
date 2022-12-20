package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveAuditRequest;
import org.museframework.bian.customeroffer.dto.RetrieveAuditResponse;
import org.museframework.bian.customeroffer.dto.UpdateAuditRequest;
import org.museframework.bian.customeroffer.dto.UpdateAuditResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="Audit")
public interface BqAudit {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of submitted materials for audit checks")
    UpdateAuditResponse updateAudit(UpdateAuditRequest req);

    @Description("ReBQ Retrieve details of the compliance assessment")
    RetrieveAuditResponse retrieveAudit(RetrieveAuditRequest req);
}